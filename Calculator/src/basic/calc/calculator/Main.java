package basic.calc.calculator;

import java.util.Scanner;

public class Main {
	
	  public static void main(String[] args) {

		    char operator;
		    Double number1, number2, result;

		    // create an object of Scanner class
		    Scanner number = new Scanner(System.in);

		    // ask users to enter operator
		    System.out.println("Choose An Operator: +, -, *, or /");
		    operator = number.next().charAt(0);

		    // ask users to enter numbers
		    System.out.println("Enter First Number");
		    number1 = number.nextDouble();

		    System.out.println("Enter Second Number");
		    number2 = number.nextDouble();

		    switch (operator) {

		      // performs addition between numbers
		      case '+':
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;

		      // performs subtraction between numbers
		      case '-':
		        result = number1 - number2;
		        System.out.println(number1 + " - " + number2 + " = " + result);
		        break;

		      // performs multiplication between numbers
		      case '*':
		        result = number1 * number2;
		        System.out.println(number1 + " * " + number2 + " = " + result);
		        break;

		      // performs division between numbers
		      case '/':
		        result = number1 / number2;
		        System.out.println(number1 + " / " + number2 + " = " + result);
		        break;

		      default:
		        System.out.println("Invalid operator!");
		        break;
		    }

		    number.close();
		  }
		}

