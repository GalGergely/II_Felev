package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;
import org.junit.Test;
import calc.util.*;
import calc.*;

public class Tests 
{
    public static final double epszilon = 0.001;

    @Test
    public void SpaceInColName1()
    {
       assertFalse(CellName.isCellNameValid(" A1"));
    }
        
    @Test
    public void SpaceInColName2()
    {
        assertFalse(CellName.isCellNameValid("A 1"));
    }
    @Test
    public void SpaceInColName3()
    {
        assertFalse(CellName.isCellNameValid("A1 "));
        
    }
    @Test
    public void LowerCase()
    {
        assertFalse(CellName.isCellNameValid("a1"));
    }
    public void WrongColName()
    {
        assertFalse(CellName.isCellNameValid("Ű1"));
    }
    @Test
    public void CorrectColAndRow()
    {
        assertTrue(CellName.isCellNameValid("A1"));
    }
    @Test
    public void CorrectColAndRow2()
    {
        assertTrue(CellName.isCellNameValid("A11"));
    }
    @Test
    public void CorrectGetRowIndexFromCellName()
    {
        try {
        assertEquals(CellName.getRowIndexFromCellName("A1"),1);
        } catch (Exception e) {
        }
    }
    @Test
    public void CorrectGetRowIndexFromCellName2()
    {
        try {
        assertEquals(CellName.getRowIndexFromCellName("A11"),11);
        } catch (Exception e) {
        }
    }
    @Test
    public void WrongGetRowIndexFromCellName()
    {
        try {
        assertFalse(CellName.getRowIndexFromCellName("A1")==2);
        } catch (Exception e) {
        }
    }
    @Test
    public void CorrectGetColIndexFromCellName()
    {
        try {
        assertEquals(CellName.getColIndexFromCellName("A1"),0);
        } catch (Exception e) {
        }
    }
    @Test
    public void CorrectGetColIndexFromCellName2()
    {
        try {
        assertEquals(CellName.getColIndexFromCellName("C1"),2);
        } catch (Exception e) {
        }
    }
    @Test
    public void WrongGetColIndexFromCellName()
    {
        try {
        assertFalse(CellName.getColIndexFromCellName("A1")==1);
        } catch (Exception e) {
        }
    }
    //2.feladat
    @Test
    public void NumX1()
    {
       Num asd = new Num(1);
       try{
        assertEquals(asd.eval(null), 1);
       }
       catch(Exception e){}
    }
    @Test
    public void NumX2()
    {
       Num asd = new Num(50);
       try{
        assertEquals(asd.eval(null), 50);
       }
       catch(Exception e){}
    }
    @Test
    public void NumX3False()
    {
       Num asd = new Num(5);
       try{
        assertFalse(asd.eval(null)==50);
       }
       catch(Exception e){}
    }
    //eq
    @Test(expected = IllegalArgumentException.class)
    public void EquationToWhitespace()
    {
       Equation asd = new Equation("A1+ B1");
    }
    @Test
    public void EquationIsGood()
    {
       Equation asd = new Equation("A1-A2");
    }
    @Test(expected = IllegalArgumentException.class)
    public void KisBetusNemjoFeladomAzAngolNeveket()
    {
       Equation asd = new Equation("a1+2");
    }
    @Test(expected = IllegalArgumentException.class)
    public void RosszOperator()
    {
       Equation asd = new Equation("1%2");
    }
}