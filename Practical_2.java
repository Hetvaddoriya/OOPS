import java.util.Scanner;
class Practical_2
{
	 public static void main(String args[])
		{
		  Scanner p2 = new Scanner(System.in);
                  double a,b,c,d,e,f,D,Dx,Dy,x,y;
    		  System.out.println("Enter the value of a:");
		  a = p2.nextDouble();
 		  System.out.println("Enter the value of b");
 		  b = p2.nextDouble();
 		  System.out.println("Enter the value of c");
 		  c = p2.nextDouble();
		  System.out.println("Enter the value of d"); 
  		  d = p2.nextDouble();
		  System.out.println("Enter the value of e");
 		  e = p2.nextDouble();
  		  System.out.println("Enter the value of f");
  		  f = p2.nextDouble();
		  D = a*b-d*c;
		  Dx = e*d-b*f;
		  Dy = a*f-c*e;
		  x = Dx/D;
  		  y = Dy/D;
		  System.out.println("x="+x);
 		  System.out.println("y="+y);

		}	
}