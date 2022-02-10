package example.hellosecurity.config;

import example.hellosecurity.filter.VerifyCodeFilter;
import example.hellosecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.hierarchicalroles.RoleHierarchy;
import org.springframework.security.access.hierarchicalroles.RoleHierarchyImpl;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.sql.DataSource;

/**
 * 安全配置
 * @author linmeng
 * @version 1.0
 * @date 2022年1月26日 15:28
 */
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    /* 白名单集合*/
    @Autowired
    DataSource dataSource;

    @Autowired
    UserService userService;
    @Bean
    PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*内存中配置用户名密码角色*/
        /*auth.inMemoryAuthentication()
                .withUser("root")
                .password("root")
                .roles("admin")
                .and()
                .withUser("linmeng").password("lm19961207").roles("user");*/
        /*在数据库中配置用户信息*/
        auth.userDetailsService(userService);
    }

    /*角色继承*/
    @Bean
    RoleHierarchy roleHierarchy(){
        RoleHierarchyImpl roleHierarchy = new RoleHierarchyImpl();
        roleHierarchy.setHierarchy("ROLE_admin > ROLE_user"); // 角色间继承，大于号两边要有空格

        return roleHierarchy;
    }
    @Override
    protected UserDetailsService userDetailsService() {
        // 数据库添加用户
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
        if (!manager.userExists("root")) {
            manager.createUser(User.withUsername("root").password("root").roles("admin").build());
        }
        if (!manager.userExists("linmeng")) {
            manager.createUser(User.withUsername("linmeng").password("lm19961207").roles("user").build());
        }
        // 内存中添加用户
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("linmeng").password("lm19961207").roles("user").build());
//        manager.createUser(User.withUsername("root").password("root").roles("admin").build());

        return manager;
    }

    /*静态文件忽略*/
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**","/images/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = http.authorizeRequests();
        //不需要保护的资源路径允许访问
        for (String url : ignoreUrlsConfig().getUrls()) {
            registry.antMatchers(url).permitAll();
        }
        // 角色设置请求路径权限
        registry.antMatchers("/admin/**").hasRole("admin")// 角色设置请求路径权限
                .antMatchers("/user/**").hasRole("user")
                .anyRequest().authenticated();// 要放到后面 否则会抛异常
        // 登录请求不拦截，关闭csrf
        http.formLogin()
                .loginPage("/login.html")// 前段页面
                .loginProcessingUrl("/doLogin")// 后端接口
                .usernameParameter("name")//页面填入参数用户名字段名
                .passwordParameter("pass")//页面填入参数密码 请求时参数要正确，否则无法拦截到
                .permitAll() // 登录请求不拦截
                .and()
                .csrf().disable() // 关闭csrf
                // 开启验证码过滤
                .addFilterBefore(verifyCodeFilter(), UsernamePasswordAuthenticationFilter.class);
    }

    @Bean
    public IgnoreUrlsConfig ignoreUrlsConfig() {
        return new IgnoreUrlsConfig();
    }

    @Bean
    public VerifyCodeFilter verifyCodeFilter(){
        return new VerifyCodeFilter();
    }
}
