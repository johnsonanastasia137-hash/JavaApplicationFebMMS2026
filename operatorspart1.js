public class operatorspart1{

    public static void main(string[] args){
	    //Assignment operator(=)
		   
	    int num - 100;
	    system.out.print("Number is %d%n",num);
		   
		//Arithmetic operator(+,-,*,/,%)
		int num1 = 50;
	    int num2 = 200;
		   
		int addition = num1 + num2;
		int subtractuion = num1 - num2;
		int multiplication = num1 * num2;
		double division = (double)num1 / num2;
		int remainder = num1 % num2;
		  
		system.out.printf("%d + %d = %d%n",num1,num2,addition);
		system.out.printf("%d - %d = %d%n",num1,num2,subtractuion);
		system.out.printf("%d * %d = %d%n",num1,num2,multiplication);
		system.out.printf("%d / %d = %.2f%n",num1,num2,division);
		system.out.printf("%d % %d = %d%n",num1,num2,remainder);
		  
	}
}		  
		  
	