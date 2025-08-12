class Counter {
    static int count = 0; // static variable

    Counter() {
        count++; // same count shared by all objects
    }
}

public class Test {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        System.out.println(Counter.count); // Output: 3
    }
}
