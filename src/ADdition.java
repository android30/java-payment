
/*
 *  Write Java program to allow the user to input two integer values and then the
program prints the results of adding, subtracting, multiplying, and dividing among the two
values.
 */
    import java.util.Scanner;
    	public class ADdition
    		{
    		public static void main(String[] args)
{
    			caculateValues();
}
    		static void caculateValues(){
    			int a,b;
				int resulta,results,resultm;
				float resultd;
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter a:");
				a=sc.nextInt();
				System.out.print("Enter b:");
				b=sc.nextInt();
				resulta=a+b;
				results=a-b;
				resultm=a*b;
				resultd=(float)a/b;
				
					System.out.println("The result of adding is "+resulta);
					
					System.out.println("The result of subtracting is "+results);
					System.out.println("The result of multiplying is "+resultm);
					System.out.println("The result of dividing is "+resultd);
					}
					}