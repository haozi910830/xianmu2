package daoImpl;

import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import entity.User;

public class UserDaoImpl implements UserDao {
	private static List<User> userList = new ArrayList<User>();

	@Override
	public List<User> selectAllUser() {

		return userList;
	}

	@Override
	public boolean registerUser(User user) {
		userList.add(user);
		return true;
	}
}
