

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Kitten();
		Cat c = new Cat();
		c.setColor("red");
		System.out.println("Cat Color :"+c.getColor());
		a.speak();

	}

}
