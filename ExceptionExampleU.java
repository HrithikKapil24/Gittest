import java.util.Scanner;

class ExceptionExample0{
	public static void main(String[] args){

		int a;
		int b;
		int c;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the value of a");
		a=sc.nextInt();
		try{}

		System.out.print("Enter the value of b");
		b=sc.nextInt();
	}catch(ArithmeticException e){
		System.out.print("Exception "+ e.toString());
		b=1;
	}
	c=a/b;

		System.out.print("\na ="+a +"b=" + b + " a/b="+c);		
	}
