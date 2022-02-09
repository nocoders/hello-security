package example.hellosecurity.model;

import javax.annotation.Generated;

public class Authorities {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.471+08:00", comments="Source field: authorities.username")
    private String username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.471+08:00", comments="Source field: authorities.authority")
    private String authority;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.471+08:00", comments="Source field: authorities.username")
    public String getUsername() {
        return username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.471+08:00", comments="Source field: authorities.username")
    public void setUsername(String username) {
        this.username = username;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.471+08:00", comments="Source field: authorities.authority")
    public String getAuthority() {
        return authority;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.472+08:00", comments="Source field: authorities.authority")
    public void setAuthority(String authority) {
        this.authority = authority;
    }
}