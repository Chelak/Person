package com.kz.person;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
@EnableTransactionManagement
public class PersonApplication {

	public static void main(String[] args)
	{

		SpringApplication.run(PersonApplication.class, args);
	}

	@Bean
	public DataSource dataSource() throws IOException {
		Properties dsProps = PropertiesLoaderUtils.loadAllProperties("datasource.properties");
		Properties hikariProps = PropertiesLoaderUtils.loadAllProperties("hikari.properties");
		hikariProps.put("dataSourceProperties", dsProps);
		return new HikariDataSource(new HikariConfig(hikariProps));
	}

	@Bean
	public PlatformTransactionManager transactionManager() throws IOException {
		return new DataSourceTransactionManager(dataSource());
	}
}
