package calc.util;

import calc.util.SheetException;

public class CellName
{
    final static String colIndexes ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final boolean isCellNameValid(String cellName) throws NumberFormatException
    {
        boolean sol=false;
        try{
            sol=colIndexes.indexOf(cellName.charAt(0))!=-1 && Integer.parseInt(cellName.substring(1))>=0;
        }
        catch(NumberFormatException e){}
        return sol;
    }
    public static int getRowIndexFromCellName(String cellName) throws SheetException
    {
        try{
            return Integer.parseInt(cellName.substring(1));
        }
        catch(Exception e){
            throw new SheetException("RowIndexFailed");
        }
    }
    public static int getColIndexFromCellName(String cellName) throws SheetException
    {
        try{
           return colIndexes.indexOf(cellName.charAt(0));
        }
        catch(Exception e){
            throw new SheetException("ColIndexFailed");
        }
    }
    public static String getColIndexes()
    {
        return colIndexes;
    }
}