package com.stx.demo;

public class FamilyAccount {
	public static void main(String args[]) {
		boolean flag=true;
		double balance=10000;
		String details="收支\t\t账户余额\t\t收支余额\t\t说明\n";
		while(flag) {
			System.out.println("----------------家庭收支记账软件-----------------------");
			System.out.println("\t\t1.收支明细");
			System.out.println("\t\t2.登记收入");
			System.out.println("\t\t3.登记支出");
			System.out.println("\t\t4.退出");
			System.out.println("请选择（1-4）:");
			// 要求用户输入1-5选择
			char  menu=Utility.readMenuSelection();
			switch(menu) {
			case '1':
				System.out.println("---------收支明细----------");
				System.out.println(details);
				break;
			case '2':
				System.out.println("本次收入金额:");
				int money=Utility.readNumber();
				System.out.println("本次收入说明：");	
				String desc=Utility.readString();
				balance+=money;
				details+=("收入\t\t"+balance+"\t\t"+money+"\t\t"+desc+"\n");
				break;
			case '3':
				System.out.println("本次支出金额:");
				int money1=Utility.readNumber();
				System.out.println("本次支出说明：");	
				String desc1=Utility.readString();
				balance-=money1;
				details+=("收入\t\t"+balance+"\t\t"+money1+"\t\t"+desc1+"\n");
				
				break;
			case '4':
				System.out.println("确认是否退出y/n：");
				char exit=Utility.readConfirmSelection();
				if(exit=='Y') {
					flag=false;
				}
				break;
				
			}
		}
	}
}
