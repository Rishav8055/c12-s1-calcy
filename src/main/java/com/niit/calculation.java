package com.niit;

public class calculation {
    int addition(int num1,int num2){
        return num1+num2;

    }
    public int subtraction(int number1,int number2){
        return number1 - number2;
    }
    public int multiplication(int number1,int number2){
        if(number1 == 0 || number2 == 0){
            throw new ArithmeticException();
        }
        return number1 * number2;
    }
    public int division(int number1,int number2){
        if(number1 < number2){
            throw new ArithmeticException();
        }
        return number1 / number2;
    }

}
