/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package польская.запись;

import folder.MyStack;

/**
 *
 * @author milan
 */
public class Look 
{
    private MyStack stack = new MyStack();
    private String ans ="";
    private String s = "b+c*d";
    
    public Look()
    {
        start();
    }
    
    public boolean check(int ch)
    {
        if (ch == s.length() - 1) 
        {
            return true;
        } 
        return false;
    }
    
    public boolean checkSmall(char lexime)
    {
        if (checkStatus(stack.peek()) >= checkStatus(lexime)) 
        {
            return true;    
        }
        return false;
    }
    
    public Integer checkStatus(char lexime)
    {
        if (lexime == ')') 
        {
            return 0;
        }
        if (lexime == '(') 
        {
            return 1;
        }
        if (lexime == '-' || lexime == '+') 
        {
            return 2;
        }
        if (lexime == '*' || lexime == '/') 
        {
            return 3;
        }
        return null;
    }
    
    public void pushOut(char lexime)
    {
        while(stack.peek() != '(' && stack.length() != 0 && checkStatus(lexime) <= checkStatus(stack.peek()))  
        {
            ans = ans + stack.pop();
        }
        if (stack.length() != 0) 
        {
            stack.pop();
        }
    }
    
    public void start()
    {
        for (int ch = 0; ch < s.length(); ch++) 
        {
            char lexime = s.charAt(ch);
            switch(lexime) {
                case '(':
                    if (check(ch)) 
                    {
                        System.out.println("Строка неликвидна");
                        System.exit(0);
                    }
                    else  stack.push(lexime);
                    break;
                case ')':
                    pushOut(lexime);
                    break;
                case '+':
                    if (check(ch)) 
                    {
                        System.out.println("Строка неликвидна");
                        System.exit(0);
                    }
                    else
                    {
                        stack.push(lexime);
                        if (checkSmall(lexime)) 
                        {
                            pushOut(lexime);
                        }
                        else
                        {
                            break;
                        } 
                    }
                    break;
                case '-':
                    if (check(ch)) 
                    {
                        System.out.println("Строка неликвидна");
                        System.exit(0);
                    }
                    else
                    {
                        stack.push(lexime);
                        pushOut(lexime);
                    }
                    
                    break;
                case '*':
                    if (check(ch)) 
                    {
                        System.out.println("Строка неликвидна");
                        System.exit(0);
                    }
                    else
                    {
                        stack.push(lexime);
                        pushOut(lexime);
                    }
                    break;
                case '/':
                    if (check(ch)) 
                    {
                        System.out.println("Строка неликвидна");
                        System.exit(0);
                    }
                    else
                    {
                        stack.push(lexime);
                        pushOut(lexime);
                    }
                    break;
                default:
                    ans = ans + lexime;
                    break;
            }      
        }
        pushOut(')');
        System.out.println(this.stack);
        System.out.println(this.ans);
    }
    
    
}
