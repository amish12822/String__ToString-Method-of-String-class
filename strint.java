/**
 * strint
 */
public class strint {

    public static void main(String[] args) {
        
        int a = 123;

        String num = Integer.toString(a);

        // in here, a is a int and 1 is int so print: 124(123+1)
        System.out.println(a + 1);

        // in here, num is a string (convert a in string type) and 1 is a int so print: 1231
        System.out.println(num + 1);
    }
}
