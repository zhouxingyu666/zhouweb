package student;

import java.util.Scanner;

public class TiaoShi {
	public static void main(String[] args) {
		GuanLi w = new GuanLi();
		int m;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("��ӭʹ��ѧ���ɼ�����ϵͳ��");
			System.out.println("��ѡ���ܣ�0���˳���1����ʾ���У�2������������ѯ�ɼ���3�����ݳɼ���������ɼ���Ϣ");
			m = sc.nextInt();
			switch (m) {
			case 1:
				w.all();
				break;
			case 2:
				w.chaxun();
				break;
			case 3:
				w.paixu();
				break;
			}
		} while (m != 0);
		System.out.println("ллʹ�ñ�ϵͳ��");
	}
}
