//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
	public static void main ( String[] args )
	{
		SyntaxChecker test = new SyntaxChecker("(abc(*def)");
		if(test.checkExpression() == false){
			System.out.println(test+" is incorrect.");
		}else{
			System.out.println(test+ " is correct.");
		}
		System.out.println();
		test.setExpression("[{}]");
		if(test.checkExpression() == false){
			System.out.println(test+" is incorrect.");
		}else{
			System.out.println(test+ " is correct.");
		}
		System.out.println();
		test.setExpression("[");
		if(test.checkExpression() == false){
			System.out.println(test+" is incorrect.");
		}else{
			System.out.println(test+ " is correct.");
		}
		System.out.println();
		test.setExpression("[{<()>}]");
		if(test.checkExpression() == false){
			System.out.println(test+" is incorrect.");
		}else{
			System.out.println(test+ " is correct.");
		}
		System.out.println();
		test.setExpression("{<html[value=4]*(12)>{$x}}");
		if(test.checkExpression() == false){
			System.out.println(test+" is incorrect.");
		}else{
			System.out.println(test+ " is correct.");
		}
		System.out.println();
		test.setExpression("[one]<two>{three}(four)");
		if(test.checkExpression() == false){
			System.out.println(test+" is incorrect.");
		}else{
			System.out.println(test+ " is correct.");
		}
		System.out.println();
		test.setExpression("car(cdr(a)(b)))");
		if(test.checkExpression() == false){
			System.out.println(test+" is incorrect.");
		}else{
			System.out.println(test+ " is correct.");
		}
		System.out.println();
		test.setExpression("car(cdr(a)(b))");
		if(test.checkExpression() == false){
			System.out.println(test+" is incorrect.");
		}else{
			System.out.println(test+ " is correct.");
		}
		System.out.println();

	}
}