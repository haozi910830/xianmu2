package serviceImpl;

import java.util.List;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import entity.User;
import service.UserService;

public class userServiceImpl implements UserService {

	private UserDao userDao = new UserDaoImpl();

		//判断用户帐户是否重复的方法
		@Override
		public boolean userDecideUserName(String userName) {

			List<User>userList = userDao.selectAllUser();
			int i = 0;
			if(userList.size() > 0) {
				for(User u:userList) {
					if(u.getUserName().equals(userName)) {
						i=1;
						break;
					}
				}
			}
			boolean bo = false;
			if(i==0) {
				bo = true;
			}else {
				bo = false;
			}
			return bo;
		}

		//用户注册方法
		@Override
		public boolean registerUser(User user) {
			boolean bo = userDao.registerUser(user);
			return bo;
		}
		//用户登录时判断帐号密码是否相同
		@Override
		public boolean judgmentUserNameAndUserPass(String userName, String userPass) {

		List<User> useList = userDao.selectAllUser();
		int a = 0;
		if(useList.size() > 0) {
			for(User u:useList) {
				if(u.getUserName().equals(userName)) {
					if(u.getUserPass().equalsIgnoreCase(userPass)) {
						a = 1;
						break;
					}
				}
			}
		}
		boolean bo = false;
		if(a == 1) {
			bo = true;
		}else {
			bo = false;
		}
			return bo;
		}

}
