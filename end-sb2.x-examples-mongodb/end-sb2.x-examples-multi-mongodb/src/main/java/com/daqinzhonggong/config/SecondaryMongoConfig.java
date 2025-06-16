package com.daqinzhonggong.config;

import com.daqinzhonggong.config.props.MultipleMongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableConfigurationProperties(MultipleMongoProperties.class)
@EnableMongoRepositories(basePackages = "com.daqinzhonggong.repository.secondary",
		mongoTemplateRef = "secondaryMongoTemplate")
public class SecondaryMongoConfig {

}
