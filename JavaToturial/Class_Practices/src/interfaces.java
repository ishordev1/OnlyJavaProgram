interface motorcycle{
	void color();
	void speed();
}
interface yamaha{
	void weight();
	void average();
}
class newMotorcycle implements motorcycle , yamaha{
public	void color() {
		System.out.println("purple");
	}
public	void speed() {
		System.out.println("fast");
	}
public	void weight() {
		System.out.println("125 Kg");
	}
public	void average() {
		System.out.println("mast");
	}
}
public class interfaces {

}
