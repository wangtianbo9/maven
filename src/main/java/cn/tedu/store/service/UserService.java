package cn.tedu.store.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tedu.store.bean.User;
import cn.tedu.store.mapper.UserMapper;
import cn.tedu.store.service.ex.UsernameAlreadyExistException;
@Service
public class UserService implements IUserService{
	@Resource
	private UserMapper userMapper;
	public void addUser(User user) {
		//1.调用持久层的方法
		//selectByUsername(user.getUsername());
		//返回user1对象
		User user1 = 
				userMapper.selectByUsername(
				user.getUsername());
		
		//2.如果user1==null，
		//调用insertUser(user)方法；
		if(user1==null){
			userMapper.insertUser(user);
		}else{
		//3.如果user1!=null,抛出异常UsernameAlreadyExistException;
			//throw new UsernameAlreadyExistException("用户名已存在！");
			throw new 
			UsernameAlreadyExistException(
					"用户名已存在！");
		}
	}
	public boolean checkEmail(String email) {
		
	  return userMapper.selectByEmail(email)>0;
	}
	public boolean checkPhone(String phone) {
		
		return userMapper.selectByPhone(phone)>0;
	}

}




