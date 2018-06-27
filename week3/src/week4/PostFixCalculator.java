package week4;

import jdk.nashorn.internal.parser.Token;

import java.util.*;

public class PostFixCalculator
{
    private String inputString;
    private int result;

    public PostFixCalculator (String input) {
        this.inputString = input;
        evaluate();
    }

    public int getResult () {
        return (result);
    }

    private void evaluate()
    {
        Stack mystack = new ListStack();
        StringTokenizer stringTokenizer = new StringTokenizer(inputString," ");
        while(stringTokenizer.hasMoreTokens()){
            String token = stringTokenizer.nextToken();
            for (int i = 0; i <token.length();i++) {
                String eerste = token;
//            System.out.println(eerste);
//            System.out.println(mystack.peek());
//            1082*-
                if (isInteger(eerste)) {
                    int b = Integer.parseInt(eerste);
                    mystack.push(b);
                } else {
                    int v1 = (int) mystack.pop();
                    int v2 = (int) mystack.pop();
                    int result = 0;

                    switch (eerste.charAt(0))
                    {
                        case '+' : result = v1 + v2;
                            break;
                        case '*' : result = v2 * v1;
                            break;
                        case '-' : result = v2 - v1;
                            break;
                        case '/' : result = (int) v2 / v1;
                    }
                    mystack.push(result);
                }
            }
        }
        result = (int) mystack.pop();

    }
    public boolean isInteger( String input )
    {
        try
        {
            Integer.parseInt( input );
            return true;
        }
        catch( Exception e )
        {
            return false;
        }
    }
}

