package practice1.model.vo;

public class Cat extends Animal { // vo.�ڽ�

	private String location;
	private String color;
	
	public Cat() {}
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return super.toString() + location + "�� �����ϸ�, ������ " + color + "�Դϴ�.";
	}
	
	@Override
	public void speak() {
		System.out.println("�߿�");
	}
}
