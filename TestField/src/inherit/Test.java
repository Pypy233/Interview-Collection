package inherit;

import java.awt.*;
import java.math.BigDecimal;

/**
 * @Author: py
 * @Date: 2019-04-18 19:46
 * @Version 1.0
 */
public class Test {
    public Test() {
        this(10);
    }
    public Test(int data) {
        this.data = data;
    }
    void display() {
        System.out.println("data = " + data);
    }
    int data;

    class Decrementer {
        public void decrement(double data) {
            data = data - 1.0;
        }
    }

    public static void main(String[] args) {
//        int x = 0, y = 4, z = 5;
//        if(x > 0)
//            if(y < 3)
//                System.out.println("One");
//            else if(y < 4)
//                System.out.println("Two");
//            else if(z > 5)
//                System.out.println("Threee");
//            else
//                System.out.println("Four");

        int x = -1;
        int x1 = x >>> 1;
        int x2 = x >>> 32;
        int x3 = x >> 32;
        int x4 = x >>> 0;
        int x5 = x >> 1;
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(x4);
        System.out.println(x5);

    }
}

