package calculator.lv3;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double a = scanner.nextDouble();
            System.out.print("두 번째 숫자를 입력하세요: ");
            double b = scanner.nextDouble();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            try {
                double result = ArithmeticCalculator.calculate(a, b, OperatorType.fromChar(operator));
                arithmeticCalculator.setLastResult(result);

                System.out.println("결과: " + arithmeticCalculator.getLastResult());
            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (scanner.next().equals("exit"))
                break;
        }

        System.out.print("저장된 연산 결과에서 기준이 될 숫자를 입력하세요 (더 큰 결과 값들만 출력): ");
        double n = scanner.nextDouble();

        List<Double> filteredList = arithmeticCalculator.getResultsGreaterThan(n);
        System.out.print("기준보다 큰 결과값들: ");
        for (var d : filteredList)
            System.out.print(d + " ");

        scanner.close();
    }
}
