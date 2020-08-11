package ru.atrofimov.uitest.page.db;

import javax.sql.DataSource;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class MapperFactory {

    private static final SqlSession sqlSession = buildSqlSession();

    public static SqlSession getSqlSession() {
        return sqlSession;
    }

    public static <T> T getMapper(Class<T> mapperClass) {
        return sqlSession.getMapper(mapperClass);
    }


    public static SqlSession buildSqlSession() {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String driver = "org.postgresql.Driver";
        String username = "postgres";
        String password = "postgres";
        DataSource dataSource
            = new PooledDataSource(driver, url, username, password);

        Environment environment
            = new Environment("Development", new JdbcTransactionFactory(), dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMappers("ru.atrofimov.uitest.page.db.mapper");
        configuration.setMapUnderscoreToCamelCase(true);

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        return builder.build(configuration).openSession();
    }

}
