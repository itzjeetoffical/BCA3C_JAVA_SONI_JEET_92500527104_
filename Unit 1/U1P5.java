/*write a program to get a user input for command line*/
class program5
     {

	public static void main(String args[])
     {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);

	System.out.println("first number:"+a);
	System.out.println("second number:"+b);
	
	System.out.println("Addition is: "+(a+b));
	System.out.println("Subatraction is: "+(a-b));
	System.out.println("multiplication is: "+(a*b));
	System.out.println("division is: "+(a/b));
	System.out.println("modulus is: "+(a%b));
	
     }
     }