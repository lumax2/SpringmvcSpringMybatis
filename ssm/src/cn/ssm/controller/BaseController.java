package cn.ssm.controller;

import java.text.SimpleDateFormat;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

public abstract class BaseController {
	//日期转换，通过注解 @InitBinder
	@InitBinder
	public void InitBinder (ServletRequestDataBinder binder){
		binder.registerCustomEditor(
			java.util.Date.class, 
			new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
	}
}
