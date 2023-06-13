package dao;

import java.util.List;

import entity.User;

public interface UserDao {
	//用集合类型查询所有用户
	List<User> selectAllUser();
	//用户注册方法
	boolean registerUser(User user);



}
