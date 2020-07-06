package com.wxy.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 调用方可配置的Properties
 * @author WXY
 * @date 2020/7/3.
 */
//暴露给使用方进行配置，即在application.properties 进行配置 spring.coustomize.name
@ConfigurationProperties(prefix = "spring.coustomize")
public class CoustomizeStarterProperties {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
