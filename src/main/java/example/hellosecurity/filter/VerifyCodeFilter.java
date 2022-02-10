package example.hellosecurity.filter;

import com.mysql.cj.util.StringUtils;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录验证码过滤器
 *
 * @author linmeng
 * @version 1.0
 * @date 2022年2月10日 11:21
 */
public class VerifyCodeFilter extends GenericFilterBean {
    private String defaultFilterProcessUrls = "/doLogin";
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        if ("POST".equalsIgnoreCase(request.getMethod()) && defaultFilterProcessUrls.contains(request.getServletPath())) {
            // 验证码验证 用户填写的验证码
            String code = request.getParameter("code");
            String indexCode = (String) request.getSession().getAttribute("index_code");
            if (StringUtils.isNullOrEmpty(code))
                throw new AuthenticationServiceException("验证码不能为空!");
            if (!code.toLowerCase().equals(indexCode.toLowerCase())) {
                throw new AuthenticationServiceException("验证码错误!");
            }
        }
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
