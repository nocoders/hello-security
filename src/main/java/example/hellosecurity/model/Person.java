package example.hellosecurity.model;

import java.util.Date;
import javax.annotation.Generated;

public class Person {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.id")
    private Integer id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.first_name")
    private String firstName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.last_name")
    private String lastName;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.birth_date")
    private Date birthDate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.employed")
    private String employed;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.521+08:00", comments="Source field: person.occupation")
    private String occupation;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.521+08:00", comments="Source field: person.address_id")
    private Integer addressId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.id")
    public Integer getId() {
        return id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.id")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.first_name")
    public String getFirstName() {
        return firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.last_name")
    public String getLastName() {
        return lastName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.birth_date")
    public Date getBirthDate() {
        return birthDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.52+08:00", comments="Source field: person.birth_date")
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.521+08:00", comments="Source field: person.employed")
    public String getEmployed() {
        return employed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.521+08:00", comments="Source field: person.employed")
    public void setEmployed(String employed) {
        this.employed = employed;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.521+08:00", comments="Source field: person.occupation")
    public String getOccupation() {
        return occupation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.521+08:00", comments="Source field: person.occupation")
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.521+08:00", comments="Source field: person.address_id")
    public Integer getAddressId() {
        return addressId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.521+08:00", comments="Source field: person.address_id")
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}