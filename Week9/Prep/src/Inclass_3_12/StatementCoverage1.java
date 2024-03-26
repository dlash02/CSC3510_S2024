package Inclass_3_12;

public class StatementCoverage1 {
    public StatementCoverage1() {
    }

    public String printSum(int x, int y){
        String ret = " ";
        int result = x + y;
        if ( result > 0 ){
            ret = "Pos";
        } else if ( result < 0 ){
            ret = "Neg";
        }
        return ret;
    }
    public int doStuff( int x, int y ){
        int ret = 0;
        y = y + 1;
        if ( x == 0 || y > 0 ){
            ret = y/x;
        } else {
            ret = x + 2;
        }
        ret += 1;
        return ret;

    }
}
