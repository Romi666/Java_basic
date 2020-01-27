/**
 * unaryoperation
 */
public class unaryoperation {

    public static void main(String [] args) {
        boolean x = false;
        System.out.println(x); // false
        x = !x;
        System.out.println(x); // true

        double y = 1.21;
        System.out.println(x);
        y = -y;
        System.out.println(x);
        y = -y;
        System.out.println(x);

        int counter = 0;
        System.out.println(counter);
        System.out.println(++counter);
        System.out.println(counter);
        System.out.println(counter--);
        System.out.println(counter);

        int a = 3;
        int b = ++a * 5 / a-- + a--;
        System.out.println("a is " + a);
        System.out.println("b is " + b);

        int c = 4;
        int d = --c;
        System.out.println(c);
        System.out.println(d);

        int ax = 4;
        int bx = ax++;
        System.out.println(ax);
        System.out.println(bx);
    }
}