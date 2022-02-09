package example.hellosecurity.bo;

import example.hellosecurity.model.Role;
import example.hellosecurity.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * TODO
 *
 * @author linmeng
 * @version 1.0
 * @date 2022年1月29日 11:10
 */
public class NormalUserDetails implements UserDetails {

    private User user;

    private List<Role> roles;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        return getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return user.getAccountnonexpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return user.getAccountnonlocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return user.getAccountnonexpired();
    }

    @Override
    public boolean isEnabled() {
        return user.getEnabled();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public NormalUserDetails() {
    }

    public NormalUserDetails(User user, List<Role> roles) {
        this.user = user;
        this.roles = roles;
    }
}
