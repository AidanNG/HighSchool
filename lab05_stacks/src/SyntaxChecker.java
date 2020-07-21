//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Aidan Gow

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;

	public SyntaxChecker()
	{
		symbols= new Stack<Character>();
	}

	public SyntaxChecker(String s)
	{
		symbols= new Stack<Character>();
		exp  = s;

	}
	
	public void setExpression(String s)
	{
		symbols= new Stack<Character>();
		exp=s;
	}

	public boolean checkExpression()
	{
		char[] fun = exp.toCharArray();
		for(char s: fun){
			if(s == '{'|| s=='['||s=='<'||s=='('){
				symbols.push(s);
			}else if(s == '}'|| s==']'||s=='>'||s==')'){
				if(symbols.isEmpty())return false;
				if(s==']'){
					if(symbols.pop()!='[') return false;
				}
				if(s=='}'){
					if(symbols.pop()!='{') return false;
				}
				if(s=='>'){
					if(symbols.pop()!='<') return false;
				}
				if(s==')'){
					if(symbols.pop()!='(') return false;
				}
			}
		}

		if(!symbols.isEmpty()) return false;
		return true;

	}

	//write a toString
	public String toString(){
		return exp;
	}
}