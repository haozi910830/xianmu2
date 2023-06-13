package service;

import entity.User;

public interface UserService {
	//判断用户是否重复方法
	boolean userDecideUserName(String userName);

	//注册用户方法
	boolean registerUser(User user);

	//登录时判断帐号密码是否正确方法
	boolean judgmentUserNameAndUserPass(String userName,String userPass);

}
