package example.hellosecurity.mapper;

import static example.hellosecurity.mapper.PersonDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import example.hellosecurity.model.Person;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface PersonMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    BasicColumn[] selectList = BasicColumn.columnList(id, firstName, lastName, birthDate, employed, occupation, addressId);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source Table: person")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source Table: person")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.523+08:00", comments="Source Table: person")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Person> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("PersonResult")
    Optional<Person> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="PersonResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="first_name", property="firstName", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_name", property="lastName", jdbcType=JdbcType.VARCHAR),
        @Result(column="birth_date", property="birthDate", jdbcType=JdbcType.DATE),
        @Result(column="employed", property="employed", jdbcType=JdbcType.VARCHAR),
        @Result(column="occupation", property="occupation", jdbcType=JdbcType.VARCHAR),
        @Result(column="address_id", property="addressId", jdbcType=JdbcType.INTEGER)
    })
    List<Person> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, person, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, person, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default int insert(Person record) {
        return MyBatis3Utils.insert(this::insert, record, person, c ->
            c.map(firstName).toProperty("firstName")
            .map(lastName).toProperty("lastName")
            .map(birthDate).toProperty("birthDate")
            .map(employed).toProperty("employed")
            .map(occupation).toProperty("occupation")
            .map(addressId).toProperty("addressId")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default int insertSelective(Person record) {
        return MyBatis3Utils.insert(this::insert, record, person, c ->
            c.map(firstName).toPropertyWhenPresent("firstName", record::getFirstName)
            .map(lastName).toPropertyWhenPresent("lastName", record::getLastName)
            .map(birthDate).toPropertyWhenPresent("birthDate", record::getBirthDate)
            .map(employed).toPropertyWhenPresent("employed", record::getEmployed)
            .map(occupation).toPropertyWhenPresent("occupation", record::getOccupation)
            .map(addressId).toPropertyWhenPresent("addressId", record::getAddressId)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default Optional<Person> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, person, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default List<Person> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, person, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default List<Person> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, person, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default Optional<Person> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, person, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    static UpdateDSL<UpdateModel> updateAllColumns(Person record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(firstName).equalTo(record::getFirstName)
                .set(lastName).equalTo(record::getLastName)
                .set(birthDate).equalTo(record::getBirthDate)
                .set(employed).equalTo(record::getEmployed)
                .set(occupation).equalTo(record::getOccupation)
                .set(addressId).equalTo(record::getAddressId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Person record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(firstName).equalToWhenPresent(record::getFirstName)
                .set(lastName).equalToWhenPresent(record::getLastName)
                .set(birthDate).equalToWhenPresent(record::getBirthDate)
                .set(employed).equalToWhenPresent(record::getEmployed)
                .set(occupation).equalToWhenPresent(record::getOccupation)
                .set(addressId).equalToWhenPresent(record::getAddressId);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default int updateByPrimaryKey(Person record) {
        return update(c ->
            c.set(firstName).equalTo(record::getFirstName)
            .set(lastName).equalTo(record::getLastName)
            .set(birthDate).equalTo(record::getBirthDate)
            .set(employed).equalTo(record::getEmployed)
            .set(occupation).equalTo(record::getOccupation)
            .set(addressId).equalTo(record::getAddressId)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.524+08:00", comments="Source Table: person")
    default int updateByPrimaryKeySelective(Person record) {
        return update(c ->
            c.set(firstName).equalToWhenPresent(record::getFirstName)
            .set(lastName).equalToWhenPresent(record::getLastName)
            .set(birthDate).equalToWhenPresent(record::getBirthDate)
            .set(employed).equalToWhenPresent(record::getEmployed)
            .set(occupation).equalToWhenPresent(record::getOccupation)
            .set(addressId).equalToWhenPresent(record::getAddressId)
            .where(id, isEqualTo(record::getId))
        );
    }
}