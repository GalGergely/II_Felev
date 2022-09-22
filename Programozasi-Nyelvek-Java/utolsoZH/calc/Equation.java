package calc;
import calc.util.*;
import calc.*;
public class Equation implements Evaluable
{
    private Character op;
    private String op1;
    private String op2;
    public Equation(String keplet)
    {
        op=null;
        String str[] = new String[2];
        for(int i=0; i<keplet.length(); i++)
        {
            if(keplet.charAt(i)=='+' || keplet.charAt(i)=='-'|| keplet.charAt(i)=='*'|| keplet.charAt(i)=='/')
            {
                op = keplet.charAt(i);
                str = keplet.split(Character.toString(op));
            }
        }
        if(op==null)
        {
            throw new IllegalArgumentException();
        }
        if(CellName.isCellNameValid(str[0]) && CellName.isCellNameValid(str[1]) || CellName.isCellNameValid(str[0]) && Integer.parseInt(str[1])>=0 || CellName.isCellNameValid(str[1]) &&  Integer.parseInt(str[0])>=0 ||  Integer.parseInt(str[0])>=0 &&  Integer.parseInt(str[1])>=0)
        {
            op1=str[0];
            op2=str[1];
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public int eval(Sheet table) throws SheetException
    {
        /*int num1=Sheet.constructIntFromOperandStr(op1, table);
        int num2=Sheet.constructIntFromOperandStr(op2, table);
        if(op=="+")
        {
           return num1+num2;
        }
        if(op=="-")
        {
           if(num1-num2>0) {return num1-num2;}
           else {
               throw new ArithmeticException();
           }
        }
        if(op=="*")
        {
           return num1*num2;
        }
        else{
            if (num2==0) throw new ArithmeticException();
            return num1/num2;
        }*/
    }
}