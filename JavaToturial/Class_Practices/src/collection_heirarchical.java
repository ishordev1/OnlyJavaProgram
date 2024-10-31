interface Iterable{
	void fun();
	void fun2();
	void fun3();
	void fun4();
	void fun5();
	void funA();
}
interface Collection extends Iterable{
	//50 method

}
interface List extends Collection{
//	20 method
	void fun();
	void fun2();
}
interface Set extends Collection{
//	20 method
	void fun3();
	void fun4();
}
interface Queue extends Collection{
//	10 method
	void fun5();
}

abstract class ArrayList implements List{
public void fun() {
	System.out.println("hello");
}
}
abstract class LinkedList implements List{
	public void fun2() {
		System.out.println("new world");
	}
}
abstract class Vector implements List{
abstract public void funA();
void fun9() {
	System.out.println("hai");
}
}
abstract class Stack extends Vector{
public	void funA() {
		System.out.println("LaLa");
	}

}

public class collection_heirarchical {
 
}
