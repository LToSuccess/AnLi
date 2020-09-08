package com.stx.demo1;

import java.util.Scanner;

public class Login{
	 static User user;
	public static void main(String args[]) {
		while(true) {
			System.out.println("**********************************");
			System.out.println("\n\n\n");
			System.out.println("\t\t进入学生管理系统");
			System.out.println("\n\n\n");
			System.out.println("**********************************");
			System.out.println("请选择输入(A)用户登录\t(B)注册用户\t(C)退出系统 :");
			Scanner scanner=new Scanner(System.in);
			String str=scanner.next();
			if(str.equalsIgnoreCase("A")) {
				Login.userLogin();
				break;
				
			}else if(str.equalsIgnoreCase("B")) {
				userRegister();
			}else if(str.equalsIgnoreCase("C")) {
				System.out.println("退出系统");
				System.exit(0);
			}else {
				System.out.println("输入有误！！！");
			}
		}
		
	}
	public static void userRegister() {
		System.out.println("注册新用户");
		Scanner scanner=new Scanner (System.in);
		while(true) {
			System.out.println("请输入用户名：");
			String  name=scanner.next();
			System.out.println("请输入密码：");
			String password=scanner.next();
			user=new User(name,password);
			if(user!=null) {
				System.out.println("添加成功");
				break;
			}
			
		}	
	}
	public static void userLogin() {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("用户登陆");
			System.out.println("请输入用户名：");
			String name1=scanner.next();
			System.out.println("请输入密码：");
			String  password1=scanner.next();
			if(name1.equals(user.getUserName())&&password1.equals(user.getPassWord())) {
				System.out.println("登录成功！！");
				System.out.println("欢迎进入学生系统");
				break;
			}else {
				System.out.println("您输入的用户名或者密码错误！！");
			}
		}
	}
}
