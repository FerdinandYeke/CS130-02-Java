//Ferdinand Yeke
//Bellarmine University
//CS130-2
//CommandLineMultiplication.java
//This program prints messages with arguments and does Multiplication

public class CommandLineMultiplication{
	public static void main(String args[]){
	
	//This converts the args to Integers for addition
	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);
	double c = Double.parseDouble(args[2]);
	System.out.println("Multiplication: " +(a*b*c));
	}//main method ends here
}//Class ends here
	