package com.example.calculator;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> {
    private T result;
    private final ArrayList<T> results = new ArrayList<>();

    @SuppressWarnings("unchecked")
    public T calculate(T x, T y, String s) {
        double xVal = x.doubleValue();
        double yVal = y.doubleValue();
        double calculatedResult;

        switch (s) {
            case "+":
                calculatedResult = xVal + yVal;
                break;
            case "-":
                calculatedResult = xVal - yVal;
                break;
            case "*":
                calculatedResult = xVal * yVal;
                break;
            case "/":
                if (yVal == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    return null;
                }
                calculatedResult = xVal / yVal;
                break;
            default:
                System.out.println("올바르지 않은 사칙연산 기호입니다.");
                return null;
        }

        result = convertResult(calculatedResult, x, y);
        results.add(result);
        System.out.println("결과: " + result);
        return result;
    }

    @SuppressWarnings("unchecked")
    private T convertResult(double calculatedResult, T x, T y) {
        if (x instanceof Integer || y instanceof Integer) {
            return (T) Integer.valueOf((int) Math.round(calculatedResult));
        } else if (x instanceof Long || y instanceof Long) {
            return (T) Long.valueOf(Math.round(calculatedResult));
        }
        else if (x instanceof Float || y instanceof Float) {
            return (T) Float.valueOf((float) calculatedResult);
        }
        else {
            return (T) Double.valueOf(calculatedResult);
        }
    }

    public void setResult(int index, T value) {
        if (index >= results.size()) {
            System.out.println("잘못된 배열 인덱스입니다.");
        } else {
            results.set(index, value);
        }
    }

    public T getResult(int index) {
        if (index >= results.size()) {
            System.out.println("잘못된 배열 인덱스입니다.");
            return null;
        }
        return results.get(index);
    }

    public void removeFirstResult() {
        if (results.isEmpty()) {
            System.out.println("제거할 결과가 없습니다.");
        } else {
            results.remove(0);
        }
    }
}
