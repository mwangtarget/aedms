package com.aedms.core.test.config;

import com.aedms.core.entities.eo.AirworthDirective;
import com.aedms.core.entities.eo.Authority;
import com.aedms.core.entities.eo.EOGroup;
import com.aedms.core.entities.eo.EOOrder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @author jaly
 */
@Configuration
public class EntityConfig {
    
    @Bean(name="authority")
    public Authority authority() {
        return new Authority();
    }
    
    @Bean(name = "ad")
    public AirworthDirective ad() {
        return new AirworthDirective();
    }
    
    @Bean(name = "eoGroup")
    public EOGroup eoGroup() {
        return new EOGroup();
    }
    
    @Bean(name = "eoOrder")
    public EOOrder eoOrder() {
        return new EOOrder();
    }
}
