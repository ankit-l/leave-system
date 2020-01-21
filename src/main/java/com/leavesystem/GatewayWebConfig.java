package com.leavesystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class GatewayWebConfig {

	private static final Logger LOG = LoggerFactory.getLogger(GatewayWebConfig.class);
	
	@Bean
	public CorsFilter corsFilter() {

		LOG.debug("Creating CORS Filter");

		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("DELETE");
		config.addAllowedMethod("PUT");
		source.registerCorsConfiguration("/**", config);

		LOG.debug("Created CORS Filter");

		return new CorsFilter(source);
	}
}
