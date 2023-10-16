package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        String result;
        if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide
                && secondSide + thirdSide > firstSide) {
            result = "this is a valid triangle";
        } else {
            result = "it's not a triangle";
        }
        System.out.println(result);
    }
}
