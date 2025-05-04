package calculator.lv3;

public enum OperatorType {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION;

    public static OperatorType fromChar(char op) {
        return switch (op) {
            case '+' -> ADDITION;
            case '-' -> SUBTRACTION;
            case '*' -> MULTIPLICATION;
            case '/' -> DIVISION;
            default -> ADDITION;
        };
    }
}
