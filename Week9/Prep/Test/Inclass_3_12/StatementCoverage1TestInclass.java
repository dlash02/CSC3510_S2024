package Inclass_3_12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StatementCoverage1TestInclass {
    @Test
    public void test_PositiveNumber_isGood( ){
        int  x = 3;
        int y = 9;
        StatementCoverage1 sc = new StatementCoverage1();
        String actual = sc.printSum( x, y);
        String expected = "Pos";
        assertEquals( expected, actual);
    }
    @Test
    public void test_NegativeNumber_isGood( ){
        int  x = -3;
        int y = -9;
        StatementCoverage1 sc = new StatementCoverage1();
        String actual = sc.printSum( x, y);
        String expected = "Neg";
        assertEquals( expected, actual);
    }
    @Test
    public void test_BranchCoverage_isGood( ){
        int  x =5;
        int y = 6;
        StatementCoverage1 sc = new StatementCoverage1();
        int actual = sc.doStuff(x, y);
        int expected = 2;
        assertEquals( expected, actual);
    }
    @Test
    public void test_BranchCoverage2_isGood( ){
        int  x = 5;
        int y = -6;
        StatementCoverage1 sc = new StatementCoverage1();
        int actual = sc.doStuff(x, y);
        int expected = 8;
        assertEquals( expected, actual);
    }
}