//final variable -->we cannot change the final variable

//final method --> we cannot override final method in subclass

//final class--> we cannot extends final class in sub-class


//final
class base1{
	final float pi=3.14f;
	final void fun() {
		System.out.println("hello");
	}
}
class drive1 extends base1{

// void fun() {
//System.out.println("hello");	
//System.out.println(pi);
//
//}
}
public class final_var_method_class {
public static void main(String[] args) {
	drive1 d1=new drive1();

}
}
