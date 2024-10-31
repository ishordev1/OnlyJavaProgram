//In the overriding the method is same in the parent and child with same keyword called overriding.abstract.
//we can also use @override because 
//we say the compailer to in parent class there are we declear method overrinding.

package practices_2;
class movies2{
	public void hindi() {
		System.out.println("marvels");
	}
}
class south extends movies2{
	public void hindi() {
		System.out.println("Robot");
	}
}
public class OverRiding {
	public static void main(String[] args) {
		south film = new south();
		film.hindi();
	}


}
