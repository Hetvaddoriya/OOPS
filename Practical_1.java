import java.util.Scanner;
class Practical_1
{
	public static void main(String args[])
	{
	 Scanner p1 = new Scanner(System.in);
	 System.out.println("Enter distance in meter:");
	 double a,b;
	 a = p1.nextDouble();
	 b = a * 3.28084;
 	 System.out.printf("Distance in feet: %.2f",b);
	}

}
