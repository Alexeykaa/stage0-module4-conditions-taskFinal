package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        String result;
        if (divider == 0) {
            result = "division by zero";
        } else if (dividend / divider * divider == dividend) {
            result = "can be divided completely";
        } else {
            result = "cannot be divided completely";
        }
        System.out.println(result);
    }
}
