package nju.software.zky.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nju.software.zky.data.dataobject.Test;
import nju.software.zky.service.TestService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Resource
	private TestService testService;

	@RequestMapping(value="/login.do",method=RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mv = new ModelAndView();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		Test test = new Test();
		test.setPassword(password);
		test.setUsername(username);
		//testService.save1(test);
		if(testService.save(test)>0){
			mv.addObject("success",1);
			mv.addObject("msg","添加成功");
		}else {
			mv.addObject("success",0);
			mv.addObject("msg","添加失败");
		}
		return mv;
	}
	
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String showLogin(HttpServletRequest request, HttpServletResponse response, ModelMap model){
		return "login";
	}
}
