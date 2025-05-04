package com.example.calculator;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator calc = new Calculator();
    while(true) {
      System.out.println("첫 번째 숫자를 입력하세요: ");
      String a = sc.nextLine();
      System.out.println("두 번째 숫자를 입력하세요: ");
      String b = sc.nextLine();
      System.out.println("사칙연산 기호를 입력하세요: ");
      String s = sc.nextLine();
    

      int x = Integer.parseInt(a);
      int y = Integer.parseInt(b);
      int result;
      
      switch (s) {
          case "+": {
            result = x + y;
            System.out.println("결과: " + result);
            break;
          }
          case "-": {
            result = x - y;
            System.out.println("결과: " + result);
            break;
          }
          case "*": {
            result = x * y;
            System.out.println("결과: " + result);
            break;
          }
          case "/": {
            if (y == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
              break;
            }
            result = x / y;
            System.out.println("결과: " + result);
            break;
          }
          default:
            System.out.println("올바르지 않은 사칙연산 기호입니다.");
      }
      System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
      a = sc.nextLine();
      if(a.equals("exit")) { break;}
  }


    }
}
