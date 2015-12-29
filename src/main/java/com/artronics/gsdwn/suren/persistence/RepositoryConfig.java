package com.artronics.gsdwn.suren.persistence;

import org.apache.log4j.Logger;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.artronics.gsdwn.suren.persistence.repositories")
@EnableTransactionManagement
@EntityScan(basePackages = "com.artronics.gsdwn.suren.entities")
public class RepositoryConfig
{
    private final static Logger log = Logger.getLogger(RepositoryConfig.class);
}
