package InClassWork;

public class MinTestCases1 {
    public int myMethod1( int x, int y){
        int ret = 0;
        if ( x+y > 100 ){
            ret = x+2;
        }
        if ( x > 50 ){
            ret += 1;
        }
        return ret;
    }
    public int myMethod2( boolean a, boolean b, boolean c, boolean d){
        int ret = 1;
        if ( a ) ret = 2;
        else if ( b ) ret = 3;
        else  if ( c ){
            if ( d ) { ret = 4;} }
        return ret;
    }
    public int myMethod3( int n ){
        int ret=0;
        int j=n;
        while ( ret < n-1 ) {
            j += ret;

            while (j < n) {
                if (ret < n) {
                    ret += 1;
                }
            }
        }
        return ret;
    }
    public int simpleWhile( int n ){
        int ret=0;
        int j=n;
        while ( ret < n-1 ) {
            ret += j;
        }
        return ret;
    }
    public int simpleIfElse( int n ){
        int ret=0;
        int j=n;
        if ( j < n ){
            n += 1;
        } else {
            n += 2;
        }
        return ret;
    }
    public int simpleWhilewithIf( int n ){
        int i=0;
        while ( i < n-1 ) {
           if ( n > 0 ){
               i=i+1;
           } else {
               i = i +2;
           }
        }
        return i;
    }
    public class CyclomaticComplexityDemo {
        public static void main(String[] args) {
            int var1 = 10;
            int var2 = 9;
            int var3 = 8;
            int var4 = 7;
            if (var1 == 10){
                if(var2 > var3){
                    var2 = var3;
                } else{
                    if (var3 > var4){
                        var3 = var4;
                    } else{
                        var4 = var1;
                    }
                }
            } else{
                var1=var4;
            }
            System.out.println("var1, var2, var3, and var4"+var1+" "+var2+" "+var3+" "+var4);
        }
    }

}
