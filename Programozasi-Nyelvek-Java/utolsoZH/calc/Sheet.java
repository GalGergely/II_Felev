package calc;
import calc.util.*;
import calc.*;

public class Sheet{
    private Evaluable[][] tableSheet;
    public Sheet(int numOfRows, int numOfCols)
    {
        if(numOfCols>26) throw new IllegalArgumentException();
        tableSheet = new Evaluable[numOfRows][numOfCols];
    }
    public void insertToSheet(String cellName, Evaluable evaluable) throws SheetException
    {
        tableSheet[CellName.getRowIndexFromCellName(cellName)][CellName.getColIndexFromCellName(cellName)]=evaluable;
    }
    public Evaluable getFromSheet(String cellName) throws SheetException
    {
        return tableSheet[CellName.getRowIndexFromCellName(cellName)][CellName.getColIndexFromCellName(cellName)];
    }
    /*public static int constructIntFromOperandStr(String operandStr, Sheet sheet)
    {
        if(getColIndexes().contains(operandStr.charAt(0)))
        {
            
            int num=getFromSheet(operandStr).eval();
        }
        else
        {
            int num=Integer.parseInt(operandStr);
        }
    }*/
}