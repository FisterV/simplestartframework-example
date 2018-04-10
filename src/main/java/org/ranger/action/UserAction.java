package org.ranger.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.ranger.pojo.User;
import org.ranger.service.UserService;
import org.simplestartframwork.web.annotation.RequestParam;
import org.simplestartframwork.context.annotation.Inject;
import org.simplestartframwork.context.annotation.component.Action;
import org.simplestartframwork.web.annotation.PathMapping;

@Action
@PathMapping(value = "/user")
public class UserAction {
	
	@Inject
	private UserService userService;

	@PathMapping(value = "/login")
	public String login(HttpServletRequest request, HttpServletResponse response, ServletContext application, HttpSession session) {
		

		System.out.println(request);
		System.out.println(response);
		System.out.println(application);
		System.out.println(session);
		System.out.println("用户名:" + request.getParameter("username") + ",密码:" + request.getParameter("password") + "年龄" + request.getParameter("age"));
		return "redirect:/login.jsp";

	}
	
	@PathMapping(value = "/login_auto")
	public String loginAuto(String username, String password, long age, HttpServletRequest request,
			@RequestParam("date") Date date) {
		System.out.println("用户名:" + username + ",密码:" + password + "年龄" + age);
		System.out.println(request.getRequestURI());
		System.out.println(date);
		return "redirect:/register.jsp";
	}

	@PathMapping(value = "/register")
	public String register(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("age") long age, HttpServletRequest request,
			@RequestParam("date") Date date) {
		System.out.println("用户名:" + username + ",密码:" + password + "年龄" + age);
		System.out.println(request.getRequestURI());
		System.out.println(date);
		return "redirect:/register.jsp";
	}

	@PathMapping(value = "/list")
	public String list(@RequestParam("username") long[] username) {
		for (Long uname : username) {
			System.out.println(uname);
		}
		return "redirect:/register.jsp";

	}

	@PathMapping(value = "/map_login")
	public String login(@RequestParam("user") Map<String, Object> entity) {

		System.out.println(entity.values());
		System.out.println(entity.get("username"));
		System.out.println(entity.get("password"));
		System.out.println(entity.get("age"));
		
		int count = userService.insert(entity);
		System.out.println("-count,增加用户-"+count);
		
		return "redirect:/login.jsp";

	}

	@PathMapping(value = "/bean_register")
	public String beanRegister(@RequestParam("user") User user) {

		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getAge());
		System.out.println(user.getDate());

		return "redirect:/login.jsp";

	}

}
