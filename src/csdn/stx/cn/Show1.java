package csdn.stx.cn;

public class Show1 {
	//CSDN��ҳ
	public static void show1() {
		
		
			System.out.println("\n================CSDN��ҳ=================");
			System.out.println("\n\t1.�鿴����\n\t2.д����\n\t3.ɾ������\n\t4.�༭����\n\t5.�л��û�\n\t6.�˳�����\n��������Ҫ���еĲ���:");
			char menu = Tools.readMenuSelection();
			switch (menu) {
			case '1':
				//�鿴����
				Boke.check();
				break;
			case '2':
				//�ϴ�����
				Boke.write();
				break;
			case '3':
				//ɾ������
				Boke.rem();
				break;
				
			case '4':
				//�޸�����
				Boke.alter();
				break;
			case '5':
				//�л��û�
				System.out.println("ȷ���Ƿ��л��û�y/n��");
				char exit = Tools.readConfirmSelection();
				if (exit == 'Y') {
					
					System.out.println("�����˺����˳������������¼ע��ҳ������");
					
					Show.show();
					

				} else {
					System.out.println("����ѡ�����ʹ�ã�");
					Show1.show1();
				}
				break;
				//�رղ���
			case '6':
				System.out.println("ȷ���Ƿ��˳�ϵͳy/n��");
				char exit1 = Tools.readConfirmSelection();
				if (exit1 == 'Y') {
					System.out.println("�رճɹ�������");
					System.exit(0);
				} else {
					System.out.println("����ѡ�����ʹ�ã�");
					Show1.show1();
				}
				break;

			}
		}

	}

