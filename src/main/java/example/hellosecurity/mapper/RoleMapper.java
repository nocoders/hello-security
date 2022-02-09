package example.hellosecurity.mapper;

import static example.hellosecurity.mapper.RoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import example.hellosecurity.model.Role;
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
public interface RoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.455+08:00", comments="Source Table: role")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, namezh);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.447+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.448+08:00", comments="Source Table: role")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.448+08:00", comments="Source Table: role")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="record.id", before=false, resultType=Integer.class)
    int insert(InsertStatementProvider<Role> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.45+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RoleResult")
    Optional<Role> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.451+08:00", comments="Source Table: role")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RoleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="nameZh", property="namezh", jdbcType=JdbcType.VARCHAR)
    })
    List<Role> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.451+08:00", comments="Source Table: role")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.452+08:00", comments="Source Table: role")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, role, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.452+08:00", comments="Source Table: role")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, role, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.452+08:00", comments="Source Table: role")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.453+08:00", comments="Source Table: role")
    default int insert(Role record) {
        return MyBatis3Utils.insert(this::insert, record, role, c ->
            c.map(name).toProperty("name")
            .map(namezh).toProperty("namezh")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.454+08:00", comments="Source Table: role")
    default int insertSelective(Role record) {
        return MyBatis3Utils.insert(this::insert, record, role, c ->
            c.map(name).toPropertyWhenPresent("name", record::getName)
            .map(namezh).toPropertyWhenPresent("namezh", record::getNamezh)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.456+08:00", comments="Source Table: role")
    default Optional<Role> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, role, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.456+08:00", comments="Source Table: role")
    default List<Role> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, role, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.457+08:00", comments="Source Table: role")
    default List<Role> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, role, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.457+08:00", comments="Source Table: role")
    default Optional<Role> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.457+08:00", comments="Source Table: role")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, role, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.458+08:00", comments="Source Table: role")
    static UpdateDSL<UpdateModel> updateAllColumns(Role record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalTo(record::getName)
                .set(namezh).equalTo(record::getNamezh);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.458+08:00", comments="Source Table: role")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Role record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(name).equalToWhenPresent(record::getName)
                .set(namezh).equalToWhenPresent(record::getNamezh);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.459+08:00", comments="Source Table: role")
    default int updateByPrimaryKey(Role record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(namezh).equalTo(record::getNamezh)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.459+08:00", comments="Source Table: role")
    default int updateByPrimaryKeySelective(Role record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(namezh).equalToWhenPresent(record::getNamezh)
            .where(id, isEqualTo(record::getId))
        );
    }
}