public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        if ( isPali( "hannah")){
        if ( isPaliRecusive( "hannah")){
            System.out.println("Hannah is a Palindrome");
        } else {
            System.out.println("Hannah is not a Palindrome");
        }
        String myString = "abba";
        System.out.printf("\n Part1:%s",
                myString.substring(1,myString.length()-1));
    }

    private static boolean isPaliRecusive(String inStr ) {
        if ( inStr.length() <= 1){
            return true;
        } else if (inStr.charAt(0) != inStr.charAt(inStr.length()-1)) {
            return false;
        } else {
            return isPaliRecusive(inStr.substring(1,inStr.length()-1));
        }
    }

    private static boolean isPali(String inStr ) {
        boolean isPali = true;
        int check = inStr.length() -1;
        for ( int i=0; i < inStr.length()/2; i++ ) {
            char leftCh  = inStr.charAt(i);
            char rightCh  = inStr.charAt(check);
            if ( leftCh != rightCh ) {
                isPali = false;
                break;
            }
            check = check -1;
        }
        return isPali;
    }
}