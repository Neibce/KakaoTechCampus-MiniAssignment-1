package calculator.lv1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int a = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int b = scanner.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            String s = scanner.next();

            double result = 0;
            if (s.equals("+"))
                result = a + b;
            else if (s.equals("-"))
                result = a - b;
            else if (s.equals("*"))
                result = a * b;
            else if (s.equals("/")) {
                if (b == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    continue;
                }
                result = (double) a / b;
            }
            System.out.println("결과: " + result);

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (scanner.next().equals("exit"))
                break;
        }
        scanner.close();
    }
}
