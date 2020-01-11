package com.vip.video.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


@Configuration
@EnableTransactionManagement
public class MybatisConfig {

    @Value("${database.driver}")
    private String className;
    @Value("${database.url}")
    private String jdbcUrl;
    @Value("${database.username}")
    private String userName;
    @Value("${database.password}")
    private String password;
    @Value("${hikari.connectionTimeout}")
    private long timeout;
    @Value("${hikari.idleTimeout}")
    private long idleTimeOut;
    @Value("${hikari.maxLifetime}")
    private long leftTimeOut;
    @Value("${" +
            ".maximumPoolSize}")
    private int poolSize;

    @Primary
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {

        HikariConfig hikariConfig = new HikariConfig();

        hikariConfig.setConnectionInitSql("SELECT 1");
        hikariConfig.setDriverClassName(this.className);
        hikariConfig.setJdbcUrl(this.jdbcUrl);
        hikariConfig.setUsername(this.userName);
        hikariConfig.setPassword(this.password);
        hikariConfig.setConnectionTimeout(this.timeout);
        hikariConfig.setIdleTimeout(this.idleTimeOut);
        hikariConfig.setMaxLifetime(this.leftTimeOut);
        hikariConfig.setMaximumPoolSize(this.poolSize);

        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);
        return hikariDataSource;
    }


    @Primary
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {
        return new DataSourceTransactionManager(dataSource());
    }
    @Primary
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
}