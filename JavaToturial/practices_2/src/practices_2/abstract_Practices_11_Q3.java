package practices_2;
class monkey{
void jump() {
		System.out.println("jump monkey");
	}
	void bite() {
		System.out.println("byte monkey");
	}
}
interface BasicAnimal{
	void eat();
	void sleep();
}
class human extends monkey implements BasicAnimal{
	public void eat() {
		System.out.println("eating......");
	}
	public void sleep() {
		System.out.println("sleeping......");
	}
}
public class abstract_Practices_11_Q3 {
public static void main(String[] args) {
	human person=new human();
	person.jump();
	person.bite();
	person.eat();
	person.sleep();
}
}
