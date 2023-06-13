package view;

import java.util.Scanner;

import ctrl.MainCtrl;

public class MainView {
	private Scanner scanner = new Scanner(System.in);
	//主界面
	public void mainView() {
		while(true) {
			System.out.println("\n------欢迎使用购票系统------");
			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("3.购买车票");
			System.out.println("4.我的订单");
			System.out.println("5.退出");
			System.out.println("---------------------------");
			System.out.println("请选择您的序号：");
			String num = scanner.next();
			MainCtrl mainCtrl = new MainCtrl();
			mainCtrl.determineUserNum(num, scanner);


		}

	}
}
