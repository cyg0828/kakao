package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator<Number> calc = new ArithmeticCalculator<>();

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            Number a = parseNumber(sc.next());

            System.out.print("두 번째 숫자를 입력하세요: ");
            Number b = parseNumber(sc.next());

            System.out.print("사칙연산 기호를 입력하세요: ");
            String operator = sc.next();

            Number result = calc.calculate(a, b, operator);

            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (sc.next().equalsIgnoreCase("exit")) {
                break;
            }
        }
    }

    private static Number parseNumber(String input) {
        try {
            if (input.contains(".")) {
                return Double.parseDouble(input);
            } else {
                return Integer.parseInt(input);
            }
        } catch (NumberFormatException e) {
            System.out.println("잘못된 숫자 형식입니다. 기본값 0으로 설정됩니다.");
            return 0;
        }
    }
}
