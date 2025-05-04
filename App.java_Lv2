package com.example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        while(true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int a = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int b = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            sc.nextLine();
            String s = sc.nextLine();

            int result= calc.calculate(a, b, s);
            calc.Getter(0);
            calc.Setter(0,result+1);
            calc.Getter(0);
            calc.removeResult();

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            s = sc.nextLine();
            if(s.equals("exit")) {break;}
        }

    }


}
