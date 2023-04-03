import java.util.Scanner;
class Operation{
	public int addition(int a,int b){
		return a+b;
		
	}
	public int subtraction(int a,int b) {
		return a-b;
		
	}
	public int multipliction(int a,int b) {
		return a*b;
		
	}
	public int division(int a,int b) {
		return a/b;
		
	}
	public int modulos(int a,int b) {
		return a%b;
		
	}
	
}


public class Calculator {

	public static void main(String[] args) {
		Operation op = new Operation();
		
		Scanner sc = new Scanner(System.in);
		int x,y,choice;
		do {
		System.out.println("Enter your choice:");
		System.out.println("1)Addition\n 2)Subtraction\n 3)Multiplication\n 4)Division\n 5)Modulos\n 6)Exit\n");
		choice=sc.nextInt();
		
	    	switch(choice)
	    	{
	    	case 1:
			System.out.println("Enter first number:");
	     		x=sc.nextInt();
	    		System.out.println("Enter Second number:");
	    		y=sc.nextInt();
	    		System.out.println("Sum:"+op.addition(x,y));
	    	break;
	    
	    	case 2: 
			System.out.println("Enter first number:");
	     		x=sc.nextInt();
	    		System.out.println("Enter Second number:");
	    		y=sc.nextInt();
	    		System.out.println("Difference:"+op.subtraction(x,y));
	    	break;
	    
	    	case 3:
			System.out.println("Enter first number:");
	     		x=sc.nextInt();
	    		System.out.println("Enter Second number:");
	    		y=sc.nextInt();
	    		System.out.println("Product:"+op.multipliction(x,y));
		break;	
		
	    	case 4:
			System.out.println("Enter first number:");
	     		x=sc.nextInt();
	    		System.out.println("Enter Second number:");
	    		y=sc.nextInt();
	    		System.out.println("Quiotent:"+op.division(x,y));
		break;	
		
	    	case 5:
			System.out.println("Enter first number:");
	     		x=sc.nextInt();
	    		System.out.println("Enter Second number:");
	    		y=sc.nextInt();
	    		System.out.println("Remiander:"+op.modulos(x,y));
		break;
		
	    	case 6:
			System.exit(0);
	    	break;
		
	    	default:
			System.out.println("Invalid output!!");
			
			
	    	
	    }
		}
		while(true);
		
	}

}