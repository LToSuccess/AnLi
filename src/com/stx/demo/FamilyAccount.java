package com.stx.demo;

public class FamilyAccount {
	public static void main(String args[]) {
		boolean flag=true;
		double balance=10000;
		String details="��֧\t\t�˻����\t\t��֧���\t\t˵��\n";
		while(flag) {
			System.out.println("----------------��ͥ��֧�������-----------------------");
			System.out.println("\t\t1.��֧��ϸ");
			System.out.println("\t\t2.�Ǽ�����");
			System.out.println("\t\t3.�Ǽ�֧��");
			System.out.println("\t\t4.�˳�");
			System.out.println("��ѡ��1-4��:");
			// Ҫ���û�����1-5ѡ��
			char  menu=Utility.readMenuSelection();
			switch(menu) {
			case '1':
				System.out.println("---------��֧��ϸ----------");
				System.out.println(details);
				break;
			case '2':
				System.out.println("����������:");
				int money=Utility.readNumber();
				System.out.println("��������˵����");	
				String desc=Utility.readString();
				balance+=money;
				details+=("����\t\t"+balance+"\t\t"+money+"\t\t"+desc+"\n");
				break;
			case '3':
				System.out.println("����֧�����:");
				int money1=Utility.readNumber();
				System.out.println("����֧��˵����");	
				String desc1=Utility.readString();
				balance-=money1;
				details+=("����\t\t"+balance+"\t\t"+money1+"\t\t"+desc1+"\n");
				
				break;
			case '4':
				System.out.println("ȷ���Ƿ��˳�y/n��");
				char exit=Utility.readConfirmSelection();
				if(exit=='Y') {
					flag=false;
				}
				break;
				
			}
		}
	}
}
