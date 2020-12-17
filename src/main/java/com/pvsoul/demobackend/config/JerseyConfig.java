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
public class JerseyConfig implements ResourceConfigCustomizer {

	@Override
	public void customize(ResourceConfig config) {
		config.register(HelloPvsoulResouce.class);
	}
}
