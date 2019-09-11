package inherit;

/**
 * @Author: py
 * @Date: 2019-04-16 20:39
 * @Version 1.0
 */
public class SubClass extends SuperClass {
    SubClass(int x) {
        System.out.println("3" + x);
    }

    SubClass(int x, int y) {
        this(x);
        System.out.println("4" + x + y);
    }

    public static void main(String[] args) {
        new SubClass(2, 3);
    }


}
