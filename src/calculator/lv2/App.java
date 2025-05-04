package calculator.lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            try {
                double result = Calculator.calculate(a, b, operator);
                calculator.setLastResult(result);

                System.out.println("결과: " + calculator.getLastResult());
                calculator.removeFirstResult();
            } catch (ArithmeticException e) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (scanner.next().equals("exit"))
                break;
        }
        scanner.close();
    }
}
