package com.stx.demo1;

import java.util.Scanner;

public class Login{
	 static User user;
	public static void main(String args[]) {
		while(true) {
			System.out.println("**********************************");
			System.out.println("\n\n\n");
			System.out.println("\t\t����ѧ������ϵͳ");
			System.out.println("\n\n\n");
			System.out.println("**********************************");
			System.out.println("��ѡ������(A)�û���¼\t(B)ע���û�\t(C)�˳�ϵͳ :");
			Scanner scanner=new Scanner(System.in);
			String str=scanner.next();
			if(str.equalsIgnoreCase("A")) {
				Login.userLogin();
				break;
				
			}else if(str.equalsIgnoreCase("B")) {
				userRegister();
			}else if(str.equalsIgnoreCase("C")) {
				System.out.println("�˳�ϵͳ");
				System.exit(0);
			}else {
				System.out.println("�������󣡣���");
			}
		}
		
	}
	public static void userRegister() {
		System.out.println("ע�����û�");
		Scanner scanner=new Scanner (System.in);
		while(true) {
			System.out.println("�������û�����");
			String  name=scanner.next();
			System.out.println("���������룺");
			String password=scanner.next();
			user=new User(name,password);
			if(user!=null) {
				System.out.println("��ӳɹ�");
				break;
			}
			
		}	
	}
	public static void userLogin() {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("�û���½");
			System.out.println("�������û�����");
			String name1=scanner.next();
			System.out.println("���������룺");
			String  password1=scanner.next();
			if(name1.equals(user.getUserName())&&password1.equals(user.getPassWord())) {
				System.out.println("��¼�ɹ�����");
				System.out.println("��ӭ����ѧ��ϵͳ");
				break;
			}else {
				System.out.println("��������û�������������󣡣�");
			}
		}
	}
}
