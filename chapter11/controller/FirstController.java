package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.context.ApplicationContextAware;

public class FirstController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO 自动生成的方法存根
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","this is my first mvc program!");
		mav.setViewName("/WEB-INF/jsp/first.jsp");
		return mav;
	}

}
