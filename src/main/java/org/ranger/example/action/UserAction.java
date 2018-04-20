package org.ranger.example.action;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.ranger.example.service.UserService;
import org.simplestartframwork.context.annotation.Inject;
import org.simplestartframwork.context.annotation.component.Action;
import org.simplestartframwork.web.annotation.PathMapping;
import org.simplestartframwork.web.annotation.RequestParam;

//设置组件类注解
@Action
//设置路径访问命名空间
@PathMapping(value = "/user")
public class UserAction {
	
	private static final Logger LOGGER = LogManager.getLogger(UserAction.class.getName());
	
	/**
	 * 注入业务对象
	 */
	@Inject
	private UserService userService;

	/**
	 * 增加学生
	 * @param entity
	 * @return
	 */
	@PathMapping(value = "/add")
	public String add(@RequestParam Map<String, Object> entity) {
		LOGGER.debug("-增加学生-");

	
		return "redirect:/add.jsp";

	}
	
	/**
	 * 删除学生
	 * @param entity
	 * @return
	 */
	@PathMapping(value = "/delete")
	public String delete(Long id) {
		LOGGER.debug("-删除学生-");
	
		return "redirect:/info.jsp";
	}

	
	/**
	 * 更新学生
	 * @param entity
	 * @return
	 */
	@PathMapping(value = "/update")
	public String update(@RequestParam Map<String, Object> entity) {
		LOGGER.debug("-更新学生-");

		return "redirect:/info.jsp";
	}

	/**
	 * 查询学生
	 */
	@PathMapping(value = "/list")
	public String list() {
		LOGGER.debug("-查询学生-");
	
		return "redirect:/info.jsp";

	}





}
