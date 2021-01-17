


public class Animal {
	String name;
	String color;
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Animal() {
		super();
	}
	
	void speak() {
		System.out.println("Animal speaking");
	}
	private void eat() {
		System.out.println("Eating");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
