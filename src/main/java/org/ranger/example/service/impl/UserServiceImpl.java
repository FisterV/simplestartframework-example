package org.ranger.example.service.impl;

import java.util.Map;

import org.ranger.example.mapper.UserMapper;
import org.ranger.example.service.UserService;
import org.simplestartframwork.context.annotation.Inject;
import org.simplestartframwork.context.annotation.component.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Inject
	private UserMapper userMapper;

	@Override
	public int insert(Map<String, Object> entity) {
		int count = userMapper.insert(entity);
		return count;
	}
	

		
	

}
