package homwork1;
import java.util.Scanner;
public class Seven_Dwarves {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0,num1,num2,num3,num4,num5,num6,num7,num8,num9;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter 9 number " );
		
		
			num1 = in.nextInt();
			num2 = in.nextInt();
			num3 = in.nextInt();
			num4 = in.nextInt();
			num5 = in.nextInt();
			num6 = in.nextInt();
			num7 = in.nextInt();
			num8 = in.nextInt();
			num9 = in.nextInt();
		
		
		
		sum = num1+num2+num3+num4+num5+num6+num7+num8+num9;
		

		
		if((sum - num1 - num2) == 100)
		{
			System.out.println("Sum = "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num1 - num3) == 100)
		{
			System.out.println("Sum = "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num1 - num4) == 100)
		{
			System.out.println("Sum = "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num1 - num5) == 100)
		{
			System.out.println("Sum = "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num1 - num6) == 100)
		{
			System.out.println("Sum = "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num1 - num7) == 100)
		{
			System.out.println("Sum = "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9);
		}
		else if((sum - num1 - num8) == 100)
		{
			System.out.println("Sum = "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9);
		}
		else if((sum - num1 - num9) == 100)
		{
			System.out.println("Sum = "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8);
		}
		else if((sum - num2 - num3) == 100)
		{
			System.out.println("Sum = "+num1+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num2 - num4) == 100)
		{
			System.out.println("Sum = "+num1+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num2 - num5) == 100)
		{
			System.out.println("Sum = "+num1+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num2 - num6) == 100)
		{
			System.out.println("Sum = "+num1+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num2 - num7) == 100)
		{
			System.out.println("Sum = "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9);
		}
		else if((sum - num2 - num8) == 100)
		{
			System.out.println("Sum = "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9);
		}
		else if((sum - num2 - num9) == 100)
		{
			System.out.println("Sum = "+num1+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8);
		}
		else if((sum - num3 - num4) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num5+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num3 - num5) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num4+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num3 - num6) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num4+" "+num5+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num3 - num7) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num8+" "+num9);
		}
		else if((sum - num3 - num8) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num9);
		}
		else if((sum - num3 - num9) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num4+" "+num5+" "+num6+" "+num7+" "+num8);
		}
		else if((sum - num4 - num5) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num6+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num4 - num6) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num5+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num4 - num7) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num8+" "+num9);
		}
		else if((sum - num4 - num8) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num9);
		}
		else if((sum - num4 - num9) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num5+" "+num6+" "+num7+" "+num8);
		}
		else if((sum - num5 - num6) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num7+" "+num8+" "+num9);
		}
		else if((sum - num5 - num7) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num8+" "+num9);
		}
		else if((sum - num5 - num8) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num9);
		}
		else if((sum - num5 - num9) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num6+" "+num7+" "+num8);
		}
		else if((sum - num6 - num7) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num8+" "+num9);
		}
		else if((sum - num6 - num8) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num9);
		}
		else if((sum - num6 - num9) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num7+" "+num8);
		}
		else if((sum - num7 - num8) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num9);
		}
		else if((sum - num7 - num9) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num8);
		}
		else if((sum - num8 - num9) == 100)
		{
			System.out.println("Sum = "+num1+" "+num2+" "+num3+" "+num4+" "+num5+" "+num6+" "+num7);
		}
		else
		{
			System.out.println("Error Score All");
		}

	}

}
