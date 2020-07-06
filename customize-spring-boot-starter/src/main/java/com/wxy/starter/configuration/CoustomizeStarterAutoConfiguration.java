package com.wxy.starter.configuration;

import com.wxy.starter.service.impl.CoustomizeStarter;
import com.wxy.starter.properties.CoustomizeStarterProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 实现使用方bean的自动装配
 * @author WXY
 * @date 2020/7/3.
 */
@Configuration//标记这是一个配置类
@ConditionalOnClass(CoustomizeStarter.class)//装配条件：在classpath下不存在此类时才自动装配
@EnableConfigurationProperties(CoustomizeStarterProperties.class)//使此配置类生效
public class CoustomizeStarterAutoConfiguration {

	@Bean
	@ConditionalOnMissingBean//IOC容器中不存在这个bean才将此bean交给IOC容器管理
	public CoustomizeStarter coustomizeStarter(){
		return new CoustomizeStarter();
	}
}
