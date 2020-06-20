package com.roc.engine.parse.druid;

import org.junit.Test;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlSchemaStatVisitor;

public class DuidSqlTest {

    @Test
    public void testSql() {
        String sql = "select id as id,name as sName from test where id!=1 order by name desc limit 10";
        SQLStatement statement = SQLUtils.parseSingleMysqlStatement(sql);
        MySqlSchemaStatVisitor visitor = new MySqlSchemaStatVisitor();
        statement.accept(visitor);
        System.out.println(visitor.getColumns());
        System.out.println(visitor.getOrderByColumns());
    }
}
