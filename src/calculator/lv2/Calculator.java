package calculator.lv2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private final List<Double> mResultList = new ArrayList<>();

    public static double calculate(int a, int b, char operator) throws ArithmeticException {
        double result = 0;
        if (operator == '+')
            result = a + b;
        else if (operator == '-')
            result = a - b;
        else if (operator == '*')
            result = a * b;
        else if (operator == '/') {
            if (b == 0) throw new ArithmeticException();

            result = (double) a / b;
        }

        return result;
    }

    public double getLastResult() {
        return mResultList.get(mResultList.size() - 1);
    }

    public void setLastResult(double result) { //addResult
        mResultList.add(result);
    }

    public void removeFirstResult() {
        mResultList.remove(0);
    }
}
