package example.hellosecurity.mapper;

import static example.hellosecurity.mapper.AuthoritiesDynamicSqlSupport.*;

import example.hellosecurity.model.Authorities;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
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
public interface AuthoritiesMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    BasicColumn[] selectList = BasicColumn.columnList(username, authority);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<Authorities> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AuthoritiesResult")
    Optional<Authorities> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AuthoritiesResult", value = {
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="authority", property="authority", jdbcType=JdbcType.VARCHAR)
    })
    List<Authorities> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, authorities, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, authorities, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    default int insert(Authorities record) {
        return MyBatis3Utils.insert(this::insert, record, authorities, c ->
            c.map(username).toProperty("username")
            .map(authority).toProperty("authority")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.474+08:00", comments="Source Table: authorities")
    default int insertSelective(Authorities record) {
        return MyBatis3Utils.insert(this::insert, record, authorities, c ->
            c.map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(authority).toPropertyWhenPresent("authority", record::getAuthority)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.475+08:00", comments="Source Table: authorities")
    default Optional<Authorities> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, authorities, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.475+08:00", comments="Source Table: authorities")
    default List<Authorities> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, authorities, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.475+08:00", comments="Source Table: authorities")
    default List<Authorities> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, authorities, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.475+08:00", comments="Source Table: authorities")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, authorities, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.475+08:00", comments="Source Table: authorities")
    static UpdateDSL<UpdateModel> updateAllColumns(Authorities record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(username).equalTo(record::getUsername)
                .set(authority).equalTo(record::getAuthority);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2022-02-09T14:53:34.475+08:00", comments="Source Table: authorities")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Authorities record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(username).equalToWhenPresent(record::getUsername)
                .set(authority).equalToWhenPresent(record::getAuthority);
    }
}