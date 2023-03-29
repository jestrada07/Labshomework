package lab3;

import java.util.Arrays;

public class RunCalc {

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        calculator1.calculatorBrand = "Casio fx-39 ";
        calculator1.modelYear = 1978;
        calculator1.color = "Black & Grey ";
        calculator1.calculatorInfo();
        int x;
        int y;
        Calculator divide1 = new Calculator();
       int result = divide1.divide(20 , 2);
        System.out.println("the division result is: " + result);

        Calculator add1 = new Calculator();
        int sum = add1.add(30, 40);
        System.out.println("the sum result is: " + sum);

        Calculator subtract1 = new Calculator();
        int remainder = subtract1.subtract(65, 45);
        System.out.println("the subtraction result is: " + remainder);

        Calculator multiply1 = new Calculator();
        int multResult = multiply1.multiply(10 , 10);
        System.out.println("the multiplication result is " + multResult);












    }



}
