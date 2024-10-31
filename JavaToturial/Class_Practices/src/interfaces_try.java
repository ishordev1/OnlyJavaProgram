interface obj1{
	void sum();
	void Fun();
}
interface obj2{
	void sum();
	void Fun();
}
class child implements obj1, obj2{
	public void sum() {
		System.out.println("hello");
	}
	public void Fun() {
		System.out.println("new world");
	}
}
public class interfaces_try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
