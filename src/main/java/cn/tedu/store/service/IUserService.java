package cn.tedu.store.service;

import cn.tedu.store.bean.User;

public interface IUserService {
	/**
	 * 添加用户信息
	 * @param user
	 */
	void addUser(User user);
	/**
	 * 验证邮箱是否存在
	 * @param email
	 * @return：如果存在，返回true；
	 * 			如果不存在，返回false
	 */
	boolean checkEmail(String email);
	/**
	 * 验证电话是否存在
	 * @param phone
	 * @return：如果存在，返回true；
	 * 			如果不存在，返回false
	 */
	boolean checkPhone(String phone);
	

}




