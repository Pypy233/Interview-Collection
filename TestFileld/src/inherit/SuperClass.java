package inherit;

/**
 * @Author: py
 * @Date: 2019-04-16 20:35
 * @Version 1.0
 */
public class SuperClass {
    SuperClass() {
        this(0);
        System.out.println("1");
    }

    SuperClass(int x) {
        System.out.println("2" + x);
    }
}
