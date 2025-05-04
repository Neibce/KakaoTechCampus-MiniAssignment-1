package calculator.lv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private final List<Double> mResultList = new ArrayList<>();

    public static<T extends Number> double calculate(T a, T b, OperatorType operatorType) throws ArithmeticException {
        double x = a.doubleValue();
        double y = b.doubleValue();

        double result = 0;
        if (operatorType == OperatorType.ADDITION)
            result = x + y;
        else if (operatorType == OperatorType.SUBTRACTION)
            result = x - y;
        else if (operatorType == OperatorType.MULTIPLICATION)
            result = x * y;
        else if (operatorType == OperatorType.DIVISION) {
            if (y == 0.0) throw new ArithmeticException();
            result = x / y;
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

    public List<Double> getResultsGreaterThan(double a){
        return mResultList.stream()
                .filter(result -> result > a).toList();
    }
}
