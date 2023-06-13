package ctrl;

import java.util.Scanner;

import entity.User;
import service.UserService;
import serviceImpl.userServiceImpl;

public class MainCtrl {

	private UserService userService = new userServiceImpl();

	int b = 0;

	public void  determineUserNum(String num,Scanner scanner) {
		if("1".equals(num)) {
			//注册方法
			userRegister(scanner);
		}else if ("2".equals(num)) {
			//登录方法
			userLogin(scanner);
		}else if ("3".equals(num)) {
			//购买车费

		}else if ("4".equals(num)) {
			//查看订单

		}else if ("5".equals(num)) {
			System.err.println("欢迎下次光临！");
			System.exit(0);
		}else {
			System.out.println("您的输入有误！请重新输入！\n");
		}
	}



	//判断用户选择的方法
	private void userRegister(Scanner scanner) {
		  while(true) {
		    System.out.println("---------");
		    System.out.println("|注册界面|");
		    System.out.println("---------");
		    System.out.print("请输入注册的账号：");
		    String userName = scanner.next();
		    System.out.print("请输入注册的密码：");
		    String userPass = scanner.next();
		    System.out.print("请输入注册的邮箱：");
		    String userEmail = scanner.next();

		    //调用一个方法来检查用户名是否只包含小写英文字母
		    if (isValidUserName(userName)) {
		      //调用一个可以判断用户帐户是否重复的方法，用布尔类型进行接收
		      boolean bo = userService.userDecideUserName(userName);
		      //判断布尔类型的值bo，如果bo为true代表用户帐户未被注册否则相反
		      if(bo) {
		        //调用一个方法来检查密码是否符合要求，比如长度大于6
		        if (isValidUserPass(userPass)) {
		          //调用一个方法来检查邮箱是否符合要求，比如格式正确
		          if (isValidUserMail(userEmail)) {
		            //调用一个注册的方法
		            User user = new User(userName,userPass,userEmail);
		            boolean bl = userService.registerUser(user);
		            if(bl) {
		              System.out.println("恭喜您注册成功!\n");
		              //退出循环
		              break;
		            }
		          } else {
		            System.err.println("邮箱格式不正确，请重新输入！\n");
		          }
		        } else {
		          System.err.println("密码长度必须大于等于6，请重新输入！\n");
		        }
		      }else {
		        System.err.println("此帐号已被注册！请重新注册！\n");
		      }
		    } else {
		      System.err.println("用户名只能包含小写英文字母，请重新输入！\n");
		    }


		  }
		}

		//定义一个方法来检查用户名是否只包含小写英文字母
		private boolean isValidUserName(String userName) {
		  //可以用正则表达式来匹配，[a-z]+ 表示一个或多个小写英文字母
		  return userName.matches("[a-z]+");
		}

		//定义一个方法来检查密码是否符合要求，比如长度大于等于6
		private boolean isValidUserPass(String userPass) {
		  //可以用 length() 方法来获取密码的长度
		  return userPass.length() >= 6;
		}

		//定义一个方法来检查邮箱是否符合要求，比如格式正确
		private boolean isValidUserMail(String userMail) {
		  //可以用正则表达式来匹配，[a-zA-Z0-9_.-]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+ 表示一个合法的邮箱格式
		  return userMail.matches("[a-zA-Z0-9_.-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+");
		}

		public void userLogin(Scanner scanner) {
			while(true) {
				System.out.println("---------");
				System.out.println("|登陆界面|");
				System.out.println("----------");
				System.out.print("请输入登录的账号：");
				String userName = scanner.next();
				System.out.print("请输入登录的密码：");
				String userPass = scanner.next();
				//调用一个判断帐号密码是否正确的方法
				boolean bo = userService.judgmentUserNameAndUserPass(userName, userPass);
				//判断调用的布尔类型登录的方法
				if(bo) {

				}else {
					b++;
					System.err.println("帐号或密码错误！请重新输入\n");
					if(b == 2) {
						System.out.println("您的帐号和密码已经错误两次了，再输入错误系统将会自动退出\n");
					}else if (b == 3) {
						System.err.println("帐号密码错误三次！系统自动退出");
						System.exit(0);
					}
				}
			}
		}
}
