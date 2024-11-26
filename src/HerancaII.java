package src;
import java.io.*;
import java.util.*;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}


class Adder extends Arithmetic {
}

public class HerancaII {
    public static void main(String[] args) {
        Adder adder = new Adder();

        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());
        System.out.print(adder.add(10, 32) + " " + adder.add(10, 3) + " " + adder.add(10, 10) + "\n");
    }
}