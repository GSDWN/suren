package com.artronics.gsdwn.suren;

import com.artronics.gsdwn.suren.persistence.PersistenceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(PersistenceConfig.class)
@ComponentScan(basePackages = {
        "com.artronics.gsdwn.suren.persistence",
})
public class SurenApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SurenApplication.class, args);
    }
}
