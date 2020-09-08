package com.stx.demo;
import java.util.*;
/*
 * Utility������
 * ����ͬ�Ĺ��ܷ�װΪ���������ǿ���ֱ��ͨ�����÷���ʹ�����Ĺ��ܣ������迼�Ǿ���Ĺ���ʵ��ϸ��
 * 
 * */

 public class Utility{
	  private static Scanner scanner= new Scanner(System.in);
	  /*
	   * ���ڽ���˵���ѡ�񡣸÷�����ȡ���̣�����û����롯1��-��4���е������ַ����򷽷����ء�����ֵΪ�û������ַ���
	   * */
public static char  readMenuSelection() {
	char  c;
	for( ; ;) {
		String str=Utility.readKeyBoard(1);
		c=str.charAt(0);
		if(c!='1'&&c!='2'&&c!='3'&&c!='4') {
			System.out.println("����������������룺");		
		}else break;
	}
	return c;
	
}


private static String readKeyBoard(int limit) {
	String line=" ";
	while(scanner.hasNext()) {
		line=scanner.next();
		if(line.length()<1||line.length()>limit) {
			System.out.println("���볤�ȣ�������"+limit+"���������������룺");
			continue;	
		}
		break;
	}
	return line;
}

public static int readNumber() {
	int n;
	for( ; ;) {
		String str=Utility.readKeyBoard(4);
		try {
			n=Integer.parseInt(str);
			break;
		}catch(Exception e) {
			System.out.print("��������������������룺");
		}
	}
	return n;
}
public static String readString() {
	String str=Utility.readKeyBoard(8);
	return str;
}

public static char readConfirmSelection() {
	char c;
	for( ; ;) {
		String str=Utility.readKeyBoard(8).toUpperCase();
		c=str.charAt(0);
		if(c=='Y'||c=='N') {
			break;
		}else{
			System.out.print("ѡ��������������룺");
		}
	}
	return c;
}
 }