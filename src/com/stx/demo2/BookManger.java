package com.stx.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*图书馆里系统
 * 1.查看书籍（书名，状态，出借次数）
 * 2.添加书籍
 * 3.借阅书籍
 * 4.还书
 * 5.下架
 * 6.退出系统
 * */
public class BookManger {
	public static void main(String args[]) {
		Object[] book1=new Object[] {"java","库存",0};
		Object[] book2=new Object[] {"三国演义","库存",0};
		Object[] book3=new Object[] {"西游记","库存",0};
		List <Object[]>list=new ArrayList<Object[]>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		System.out.println("---------------图书馆里系统----------------");
		System.out.println("\t\t1.查看书籍信息");
		System.out.println("\t\t2.添加书籍信息");
		System.out.println("\t\t3.借阅图书");
		System.out.println("\t\t4.归还图书");
		System.out.println("\t\t5.下架图书");
		System.out.println("\t\t6.退出系统");
		System.out.println("----------------------------------");
		Scanner scanner=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("请输入您选择的功能：");
			int state=scanner.nextInt();
			
			switch(state) {
			case 1:
				for(int i=0;i<list.size();i++) {
					System.out.println("书名："+list.get(i)[0]+"\t\t状态："+list.get(i)[1]+
							"\t\t出借次数："+list.get(i)[2]);
				}
				break;
			case 2:
				System.out.println("请输入要添加的书籍名称：");
				
				String bookName=scanner.next();
				list.add(new Object[] {bookName,"库存",0});
				break;
			case 3:
				System.out.println("请输入要借阅的图书名称");
				
				String book=scanner.next();
				for(int i=0;i<list.size();i++) {
					if(book.equals(list.get(i)[0])) {
						list.set(i, new Object[]{book,"出借",(Integer)list.get(i)[2]+1});
					}
				}
				break;
			case 4:
				System.out.println("请输入要归还的图书名称：");
				
				String borrow=scanner.next();
				for(int i=0;i<list.size();i++) {
					if(borrow.equals(list.get(i)[0])) {
						if((Integer)list.get(i)[2]>1) {
							list.set(i, new Object[] {borrow,"出借",(Integer)list.get(i)[2]-1});
						}else {
							list.set(i, new Object[] {borrow,"库存",(Integer)list.get(i)[2]-1});
						}
					}
				}
				break;
			case 5:
				System.out.println("请输入要下架的图书名称");
				
				String delete=scanner.next();
				for(int i=0;i<list.size();i++) {
					if(delete.equals(list.get(i)[0])) {
						list.remove(i);
					}
				}
				break;
			case 6:
				System.out.println("退出系统");
				flag=false;
				break;
			}
		}

	}
}
