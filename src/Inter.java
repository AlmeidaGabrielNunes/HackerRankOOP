package src;
import java.util.Scanner;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

public class Inter {
    public static void main(String[] args) {
        AdvancedArithmetic my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
        sc.close();
    }

    private static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (Class theInterface : theInterfaces) {
            String interfaceName = theInterface.getName();
            System.out.println(interfaceName);
        }
    }

}
class MyCalculator implements AdvancedArithmetic {

    @Override
    public int divisor_sum(int n) {

        if (n == 1) {
            return n;
        }

        int sum = 0;

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                sum += i;
            }
        }

        return sum + 1 + n;
    }
}