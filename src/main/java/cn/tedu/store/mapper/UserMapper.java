package cn.tedu.store.mapper;

import cn.tedu.store.bean.User;

public interface UserMapper {
	/**
	 * 插入一个用户信息
	 * @param user
	 */
	void insertUser(User user);
	/**
	 * 根据用户名查询
	 * @param username
	 * @return 如果查到了，把记录封装成user对象返回
	 *         如果没查到，返回null
	 */
	User selectByUsername(String username);
	/**
	 * 通过邮箱查询
	 * @param email
	 * @return：如果存在，那么返回行数；
	 * 			如果不存在，返回0；
	 */
	Integer selectByEmail(String email);
	/**
	 * 通过电话查询
	 * @param phone
	 * @return：如果存在，那么返回行数；
	 * 			如果不存在，返回0；
	 */
	Integer selectByPhone(String phone);

}






