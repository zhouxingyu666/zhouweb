package student;

import java.util.ArrayList;
import java.util.Scanner;

public class GuanLi {
	Scanner sc = new Scanner(System.in);
	ArrayList<XueSheng> list = new ArrayList<XueSheng>();
	public void add() {
		list.add(new XueSheng(1, "����", 1701, "java", 88));
		list.add(new XueSheng(2, "����", 1704, "java", 90));
		list.add(new XueSheng(3, "����", 1706, "java", 78));
		list.add(new XueSheng(4, "������", 1707, "java", 98));
	}

	/**
	 * ���ȫ��
	 */
	public void all() {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	/**
	 * ����������ѯ
	 */
	public void chaxun() {
		System.out.println("������Ҫ��ѯѧ������");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (name == list.get(i).getName()) {
				System.out.println(list.get(i));
			} else {
				System.out.println("��ѧ��������");
			}

		}
	}

	/**
	 * ���ɼ�����
	 */
	public void paixu() {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {
				if (list.get(j).getChengji() < list.get(j).getChengji()) {
					XueSheng temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
			all();
		}
	}
}
