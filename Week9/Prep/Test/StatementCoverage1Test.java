import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementCoverage1Test {
    @Test
    public void test_PositiveResults_IsTrue() {
        int x = 3;
        int y = 9;
        StatementCoverage1 sc = new StatementCoverage1();
        String actual = sc.printSum(x, y);
        String expected = "Pos";
        // Asser
        assertEquals( expected, actual);
    }
    @Test
    public void test_NegativeResults_IsTrue() {
        int x = 3;
        int y = -9;
        StatementCoverage1 sc = new StatementCoverage1();
        String actual = sc.printSum(x, y);
        String expected = "Neg";
        // Asser
        assertEquals( expected, actual);
    }
    @Test
    public void test_BranchCoverage_IsTrue() {
        int x = 5;
        int y = 6;
        StatementCoverage1 sc = new StatementCoverage1();
        int actual = sc.doStuff(x, y);
        int  expected = 2;
        // Asser
        assertEquals( expected, actual);
    }
    @Test
    public void test_BranchCoverage2_IsTrue() {
        int x = 5;
        int y = -6;
        StatementCoverage1 sc = new StatementCoverage1();
        int actual = sc.doStuff(x, y);
        int  expected = 8;
        // Asser
        assertEquals( expected, actual);
    }
}