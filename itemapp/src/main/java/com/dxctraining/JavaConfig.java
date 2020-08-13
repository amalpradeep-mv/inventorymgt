package com.dxctraining;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.dxctraining")
@EnableTransactionManagement
@PropertySource("classpath:orm.properties")
public class JavaConfig {
}
