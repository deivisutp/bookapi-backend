package com.br.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScans;

import java.util.Properties;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import static org.hibernate.cfg.Environment.*;

@Configuration
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
@ComponentScans(value = {
		@ComponentScan("com.br.spring.dao"),
		@ComponentScan("com.br.spring.service")
})
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		Properties props = new Properties();
		
		//Setting JDBC properties
		props.put(DRIVER, env.getProperties("mysql.driver"));
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
