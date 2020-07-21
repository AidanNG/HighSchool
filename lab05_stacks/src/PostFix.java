//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public PostFix()
	{
		stack = new Stack<Double>();
		expression = ";";
	}

	public PostFix(String exp)
	{
		stack = new Stack<Double>();
		expression = exp;
	}

	public void setExpression(String exp)
	{
		stack = new Stack<Double>();
		expression = exp;
	}
	public String getExpression(){
		return expression;
	}

	public double calc(double one, double two, char op)
	{
		double file = 0;
		if(op == '/') file = two/one;
		if(op == '*') file = one*two;
		if(op == '+') file = one+two;
		if(op == '-') file = two-one;
		return file;
	}

	public void solve()
	{
		char[] fun = expression.toCharArray();
		for(char s : fun){
			if(Character.isDigit(s)) {
				double good = Double.parseDouble(s+"");
				stack.push(good);
			}else if(s=='/'||s=='*'||s=='-'||s=='+'){
				if(s=='/'){
					stack.push(this.calc(stack.pop(),stack.pop(),s));

                }
				if(s=='*'){
					stack.push(this.calc(stack.pop(),stack.pop(),s));

				}
				if(s=='+'){
					stack.push(this.calc(stack.pop(),stack.pop(),s));

				}
				if(s=='-'){

					stack.push(this.calc(stack.pop(),stack.pop(),s));

				}
			}
		}
	}

	//add a toString
	public String toString(){
		return stack.peek()+"";
	}
}