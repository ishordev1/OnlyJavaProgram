//count the particular alphabet
public class a_found_found_Sentence {
public static void main(String[] args) {
	String sentence="My name is Nabin prasad Chaudhar";
	int count=0;
	for(int i=0; i<sentence.length(); i++)
	{
		if(sentence.charAt(i)=='a')
		{
			count=count+1;
		}
	}
	System.out.println(count);
}
}
