package cn.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.ssm.pojo.User;
import cn.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
	@Resource
	private UserService userService;
	
	@RequestMapping("/list")
	public String findAll(Model model){
		List<User> userList = userService.findAll();
		model.addAttribute("userList", userList);
		return "index";
	}
}
