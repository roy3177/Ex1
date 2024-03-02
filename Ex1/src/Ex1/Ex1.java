/* ID-207302340
 * In this code,the goal is to find what is the minimal common denominator(n) between three numbers(x,y,z).
 * he algorithm works by three auxiliary functions.
The first function,gcd,to find the greatest common divisor between two numbers.
The second function,mcd,to find the minimal common denominator between two numbers+link the first function(gcd).
The third function,mcd2,to find the minimal common  denominator between the result of the second function to another number+link to the first function(gcd).
And at the end,connect all the auxiliary functions to the main function,and solve the algorithm.

 * @author Roy M
 */
package Ex1;
import java.util.Scanner;

public class Ex1 {
	public static long gcd(long x,long y) {
		while(y!=0) {
			long temp=y;			//GCD function
			y=x%y;
			x=temp;
		}
		return x;


	}
	public static long mcd(long x,long y) {  //MCD function
		return (x*y/gcd(x,y));
	}


	public static long mcd2(long z,long mcd) {
		return (z*mcd)/gcd(z,mcd);				//MCD2 function
	}


	public static void main(String[] args) {

		double startTime=System.nanoTime();
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);

		System.out.println("Enter three numbers:");

		long x=s.nextLong();
		long y=s.nextLong();
		long z=s.nextLong();



		if((x<=0) || (y<=0) || (z<=0)) {
			System.out.println("One of the numbers is invalid"); //We want only natural numbers(without zero).
		}
		else {

			long n=mcd2((x),mcd(y,z));
			System.out.println("The mcd is : " + n);	

		}	



	
		double endTime=System.nanoTime();		//The runtime of the code,for the efficiency of the code itself
		double totalTime=endTime-startTime;
		System.out.println("The run time in the program " + totalTime/1000);
	}


}


