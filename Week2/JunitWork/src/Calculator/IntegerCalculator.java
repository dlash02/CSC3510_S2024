package Calculator;

public class IntegerCalculator {
    public int integerDivision( int x, int y){
        if ( y == 0 ){
            throw new ArithmeticException("Cannot Divide By Zero");
        }
        return (x)/y;
    }
    //ToDo: Write another method called
    public int integerSubtraction( int x, int y){
        return x-y;
    }
}
