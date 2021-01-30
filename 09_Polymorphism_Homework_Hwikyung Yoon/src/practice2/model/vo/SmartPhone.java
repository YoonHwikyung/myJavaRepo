package practice2.model.vo;

// 추상 클래스
public abstract class SmartPhone implements CellPhone, TouchDisplay{
	
	public SmartPhone() {}
	
	public abstract void printMaker();
	
	public abstract String information();

}
