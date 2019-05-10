package student;

public class XueSheng {
	private int num;
	private String name;
	private int banji;
	private String kemu;
	private int chengji;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBanji() {
		return banji;
	}

	public void setBanji(int banji) {
		this.banji = banji;
	}

	public String getKemu() {
		return kemu;
	}

	public void setKemu(String kemu) {
		this.kemu = kemu;
	}

	public int getChengji() {
		return chengji;
	}

	public void setChengji(int chengji) {
		this.chengji = chengji;
	}

	public XueSheng() {

	}

	public XueSheng(int num, String name, int banji, String kemu, int chengji) {
		this.num = num;
		this.name = name;
		this.banji = banji;
		this.kemu = kemu;
		this.chengji = chengji;
	}

	@Override
	public String toString() {
		return "学号：" + num + "姓名：" + name + ",班级" + banji + "科目：" + kemu
				+ "成绩：" + chengji;
	}

}
