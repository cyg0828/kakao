package com.example.calculator;

import java.util.ArrayList;


public class Calculator {
    int result;
    private ArrayList<Integer> ary = new ArrayList<>();
    public int calculate(int x, int y, String s) {
        switch (s) {
            case "+": {
                result = x + y;
                break;
            }
            case "-": {
                result = x - y;
                break;
            }
            case "*": {
                result = x * y;
                break;
            }
            case "/": {
                if (y == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return 0;
                }
                result = x / y;
                break;
            }
            default:
                System.out.println("올바르지 않은 사칙연산 기호입니다.");
                return 0;
        }
        System.out.println("결과: " + result);
        ary.add(result);
        return result;
    }
    public void Setter(int x, int y){
        if(this.ary.size() <= x) {
            System.out.println("잘못된 배열값입니다.");
        }
        else {
            this.ary.set(x, y);
        }
    }

    public int Getter(int x) {
        if(this.ary.size() <= x) {
            System.out.println("잘못된 배열값입니다.");
            return 0;
        }
        else{
            System.out.println(ary.get(x));
        }
        return this.ary.get(x);
    }
    public void removeResult(){
        if(this.ary.size() <= 0) {
            System.out.println("제거할수 있는 값이 없습니다.");
        }
        else {
            ary.remove(0);
        }
    }
}
