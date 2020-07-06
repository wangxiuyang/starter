package com.wxy.starter.service.impl;

import com.wxy.starter.properties.CoustomizeStarterProperties;
import com.wxy.starter.service.CoustomizeStarterI;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 执行自定义业务逻辑
 *
 * @author WXY
 * @date 2020/7/3.
 */
public class CoustomizeStarter implements CoustomizeStarterI {

	@Autowired
	private CoustomizeStarterProperties properties;

	@Override
	public String doBusiness() {
		String name = properties.getName();
		System.out.println("配置数据："+name);
		return name;
	}
}
