    package practices_2;

class hindi{
	void action() {
		System.out.println("baby");
	}
	void romantic() {
		System.out.println("wanted");
	}
	
}
class hollywood extends hindi{
	void romantic() {
		System.out.println("DeadPool");
	}
	void adventure() {
		System.out.println("jumanji");
	}
	void thariler() {
		System.out.println("Dracula");
	}
}

public class Dynamic_method_Dispach {
public static void main(String[] args) {
	hindi film =new hollywood();
film.action();
film.romantic();
//film.adventure();
//fil.thariler();

}
	
}
