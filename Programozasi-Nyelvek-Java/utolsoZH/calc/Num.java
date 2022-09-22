package calc;
import calc.util.*;
import calc.*;
public class Num implements Evaluable
{
    private int storedNumber;
    public Num(int num)
    {
        if(num>=0)
        {
            storedNumber=num;
        }
        else
        {
            throw new IllegalArgumentException();
        }
    }
    @Override
    public int eval(Sheet table) throws SheetException
    {
        return storedNumber;
    }
}