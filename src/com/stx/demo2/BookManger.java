package com.stx.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*ͼ�����ϵͳ
 * 1.�鿴�鼮��������״̬�����������
 * 2.����鼮
 * 3.�����鼮
 * 4.����
 * 5.�¼�
 * 6.�˳�ϵͳ
 * */
public class BookManger {
	public static void main(String args[]) {
		Object[] book1=new Object[] {"java","���",0};
		Object[] book2=new Object[] {"��������","���",0};
		Object[] book3=new Object[] {"���μ�","���",0};
		List <Object[]>list=new ArrayList<Object[]>();
		list.add(book1);
		list.add(book2);
		list.add(book3);
		System.out.println("---------------ͼ�����ϵͳ----------------");
		System.out.println("\t\t1.�鿴�鼮��Ϣ");
		System.out.println("\t\t2.����鼮��Ϣ");
		System.out.println("\t\t3.����ͼ��");
		System.out.println("\t\t4.�黹ͼ��");
		System.out.println("\t\t5.�¼�ͼ��");
		System.out.println("\t\t6.�˳�ϵͳ");
		System.out.println("----------------------------------");
		Scanner scanner=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("��������ѡ��Ĺ��ܣ�");
			int state=scanner.nextInt();
			
			switch(state) {
			case 1:
				for(int i=0;i<list.size();i++) {
					System.out.println("������"+list.get(i)[0]+"\t\t״̬��"+list.get(i)[1]+
							"\t\t���������"+list.get(i)[2]);
				}
				break;
			case 2:
				System.out.println("������Ҫ��ӵ��鼮���ƣ�");
				
				String bookName=scanner.next();
				list.add(new Object[] {bookName,"���",0});
				break;
			case 3:
				System.out.println("������Ҫ���ĵ�ͼ������");
				
				String book=scanner.next();
				for(int i=0;i<list.size();i++) {
					if(book.equals(list.get(i)[0])) {
						list.set(i, new Object[]{book,"����",(Integer)list.get(i)[2]+1});
					}
				}
				break;
			case 4:
				System.out.println("������Ҫ�黹��ͼ�����ƣ�");
				
				String borrow=scanner.next();
				for(int i=0;i<list.size();i++) {
					if(borrow.equals(list.get(i)[0])) {
						if((Integer)list.get(i)[2]>1) {
							list.set(i, new Object[] {borrow,"����",(Integer)list.get(i)[2]-1});
						}else {
							list.set(i, new Object[] {borrow,"���",(Integer)list.get(i)[2]-1});
						}
					}
				}
				break;
			case 5:
				System.out.println("������Ҫ�¼ܵ�ͼ������");
				
				String delete=scanner.next();
				for(int i=0;i<list.size();i++) {
					if(delete.equals(list.get(i)[0])) {
						list.remove(i);
					}
				}
				break;
			case 6:
				System.out.println("�˳�ϵͳ");
				flag=false;
				break;
			}
		}

	}
}
