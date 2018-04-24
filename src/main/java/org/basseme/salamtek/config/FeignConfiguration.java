package org.basseme.salamtek.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "org.basseme.salamtek")
public class FeignConfiguration {

}
