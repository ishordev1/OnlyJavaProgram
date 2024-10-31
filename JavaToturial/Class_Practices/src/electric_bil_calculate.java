
import java.util.Scanner;
class ElectricityBillExample1   
{   
    // main() method start  
    public static void main(String args[])   
    {     
    	Scanner input=new Scanner(System.in);
        // declare and initialize variable units  
      System.out.println("Enter your meter unit:");
    	int units =input.nextInt();  
        // variable to calculate electricity bill to pay  
        double billToPay = 0;  
        // check whether units are less than 100  
        if(units < 100)  
        {  
            billToPay = units * 1.20;  
        }  
        // check whether the units are less than 300  
        else if(units < 300){  
            billToPay = 100 * 1.20 + (units - 100) * 2;  
        }  
        // check whether the units are greater than 300  
        else if(units > 300)  
        {  
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;  
        }  
        System.out.println("The electricity bill for " +units+ " is Rs :- " + billToPay);   
    }   
}  