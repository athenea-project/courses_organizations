package org.athenea.util;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.MongoClient;

/**
 * Spring MongoDB configuration file
 *
 */
@Configuration
public class SpringMongoConfig{

  public @Bean
  MongoTemplate mongoTemplate() throws Exception {

    MongoTemplate mongoTemplate =
        new MongoTemplate(new MongoClient("mongodb_courses_organizations"),"athenea");
    return mongoTemplate;

  }

}
