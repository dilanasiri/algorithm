package lk.dilan.algorithm;

import java.util.Scanner;

public class FibonacciSequenceWithRecursion {
    static int num1=0,num2=1,sum=0;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a input: ");
        int count=scanner.nextInt();
        System.out.print(num1+" "+num2);

        Fibonacci(count-2);
    }

    static void Fibonacci(int count) {

        if (count>0){
            sum=num1+num2;
            num1=num2;
            num2=sum;
            System.out.print(" "+sum);
            Fibonacci(count-1);

        }

    }
}
