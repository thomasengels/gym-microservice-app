package com.gym.user.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Import(com.gym.common.configuration.MongoConfig.class)
@Configuration
@EnableMongoRepositories(basePackages = "com.gym.user.repository")
public class MongoConfig extends com.gym.common.configuration.MongoConfig {
}
