package com.wxy.customizestartertext;

import com.wxy.starter.service.impl.CoustomizeStarter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WXY
 * @date 2020/7/3.
 */
@RestController
public class TextStarterController {
	@Autowired
	private CoustomizeStarter coustomizeStarter;

	@GetMapping(value="/text")
	public String text(){
		return coustomizeStarter.doBusiness();
	}
}
