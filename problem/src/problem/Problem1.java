//This program is used to calculate average of numbers.
package problem;
import java.util.*;
public class Problem1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double num, total=0, average, counter=0;
		System.out.println("Please enter number(enter -1 to calculate the average) :");
		num = read.nextDouble();
		while(num!=-1)
		{
		total=total+num;
		counter=counter+1;
		System.out.println("Please enter number(enter -1 to calculate the average) :");
		num = read.nextDouble();
		
		}
		
		average=total/counter;
		System.out.println("The average is:"+average);
		

	}

}
