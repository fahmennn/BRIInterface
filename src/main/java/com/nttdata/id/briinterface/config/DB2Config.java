package com.nttdata.id.briinterface.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
// import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
// import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableJpaRepositories(
    basePackages = "com.nttdata.id.briinterface.repository.db2", // Ganti dengan package repository Anda
    entityManagerFactoryRef = "secondaryEntityManagerFactory",
    transactionManagerRef = "secondaryTransactionManager"
)
@DependsOn("ConfigLoader")
public class DB2Config {

    // @Autowired
    // private Environment env;

	@Value("${spring.secondary-datasource.driver-class-name}")
    private String driverClassName;

	// @Value("${spring.datasource.driver-class-name}")
    // private String driverClassName;
	
	@Value("${spring.datasource.hikari.connection-timeout}")
    private int connectionTimeout;

    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private int maxPoolSize;

    @Value("${spring.datasource.hikari.minimum-idle}")
    private int minIdle;

    @Value("${spring.datasource.hikari.idle-timeout}")
    private int idleTimeout;

    @Value("${spring.datasource.hikari.max-lifetime}")
    private int maxLifetime;
    
    @Value("${fti_database_jdbc_url}")
    private String jdbcUrl;
    
    @Value("${fti_database_username}")
    private String db2Username;

    @Value("${fti_database_password}")
    private String db2Password;
    
    @Bean(name = "db2DataSource")
    public DataSource db2DataSource() {
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setJdbcUrl(jdbcUrl);
        hikariConfig.setUsername(db2Username);
        hikariConfig.setPassword(db2Password);
        hikariConfig.setReadOnly(true); // Set read-only mode

        return new HikariDataSource(hikariConfig);
    }

    @Bean(name = "secondaryEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean db2EntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("db2DataSource") DataSource dataSource) {

        Map<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", "none");
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.dialect", "org.hibernate.dialect.DB2Dialect");

        return builder
                .dataSource(dataSource)
                .properties(properties)
                .packages("com.nttdata.id.briinterface.model.db2") // Ganti dengan package entity Anda
                .persistenceUnit("db2PU")
                .build();
    }

    @Bean(name = "secondaryTransactionManager")
    public PlatformTransactionManager db2TransactionManager(
            @Qualifier("secondaryEntityManagerFactory") EntityManagerFactory db2EntityManagerFactory) {
        return new JpaTransactionManager(db2EntityManagerFactory);
    }
	

    // @Bean(name = "secondaryDataSource")
    // public DataSource secondaryDataSource() {
    //     HikariConfig hikariConfig = new HikariConfig();
    //     hikariConfig.setJdbcUrl(jdbcUrl);
    //     hikariConfig.setUsername(env.getProperty("fti_database_username"));
    //     hikariConfig.setPassword(env.getProperty("fti_database_password"));
    //     hikariConfig.setDriverClassName(driverClassName);
    //     hikariConfig.setConnectionTimeout(connectionTimeout);
    //     hikariConfig.setMaximumPoolSize(maxPoolSize);
    //     hikariConfig.setMinimumIdle(minIdle);
    //     hikariConfig.setIdleTimeout(idleTimeout);
    //     hikariConfig.setMaxLifetime(maxLifetime);

    //     return new HikariDataSource(hikariConfig);
    // }

    // @Bean(name = "secondaryEntityManagerFactory")
    // public LocalContainerEntityManagerFactoryBean secondaryEntityManagerFactory(
    //         DataSource secondaryDataSource) {
    //     LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    //     em.setDataSource(secondaryDataSource);
    //     em.setPackagesToScan("com.nttdata.id.briinterface.model.db2"); // Ganti dengan package entity Anda

    //     HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    //     em.setJpaVendorAdapter(vendorAdapter);

    //     Map<String, Object> properties = new HashMap<>();
    //     properties.put("spring.secondary-jpa.hibernate.ddl-auto", "validate");
    //     properties.put("spring.secondary-jpa.properties.hibernate.dialect", "org.hibernate.dialect.DB2Dialect");
    //     properties.put("spring.secondary-jpa.show-sql", "true");
    //     em.setJpaPropertyMap(properties);

    //     return em;
    // }

    // @Bean(name = "secondaryTransactionManager")
    // public PlatformTransactionManager secondaryTransactionManager(
    //         EntityManagerFactory secondaryEntityManagerFactory) {
    //     return new JpaTransactionManager(secondaryEntityManagerFactory);
    // }
}
