package student;

import java.util.Scanner;

public class TiaoShi {
	public static void main(String[] args) {
		GuanLi w = new GuanLi();
		int m;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("欢迎使用学生成绩管理系统！");
			System.out.println("请选择功能：0：退出，1：显示所有，2：根据姓名查询成绩，3：根据成绩降序排序成绩信息");
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
		System.out.println("谢谢使用本系统！");
	}
}
