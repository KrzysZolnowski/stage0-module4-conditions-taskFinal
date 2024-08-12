package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int quotient = dividend % divider;

        if (divider != 0) {
            if (quotient != 0) {
                int product = quotient * divider;
                if (product == dividend) {
                    System.out.println("can be divided completely");
                } else if (quotient != dividend) {
                    System.out.println("cannot be divided completely");
                }
                }
            }else {
            System.out.println("division by zero");
        }
    }
}
