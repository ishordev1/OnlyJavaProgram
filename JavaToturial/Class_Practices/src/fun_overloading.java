class add{
	int add(int a, int b) {
		int c=a+b;
		return c;
	}
	void add (int a) {
		System.out.println(a*a);
	}
}
public class fun_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add obj=new add();
		System.out.println(obj.add(50, 40));
		obj.add(5);

	}

}
