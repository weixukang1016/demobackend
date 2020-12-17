package com.pvsoul.demobackend.config;
import com.pvsoul.demobackend.resource.HelloPvsoulResouce;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.autoconfigure.jersey.ResourceConfigCustomizer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

/**
 * Jersey配置类
 *
 * @author weiweishen
 */
@Configuration
//@ComponentScan(value = {"com.pvsoul.demobackend" })
public class JerseyConfig implements ResourceConfigCustomizer {

	@Override
	public void customize(ResourceConfig config) {
		config.register(HelloPvsoulResouce.class);
		//config.registerClasses(ValidationExceptionProvider.class);
	}
}
