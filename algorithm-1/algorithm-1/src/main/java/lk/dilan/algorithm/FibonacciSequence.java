package lk.dilan.algorithm;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a positive number : ");
        int count =scanner.nextInt();
        if (count<0){
            System.out.println("Count can not be negative...");
        }else {
            int num1=0,num2=1,sum=0;
            System.out.print(num1+ " "+num2);

            do {
                sum=num1+num2;
                num1=num2;
                num2=sum;
                System.out.print(" "+sum);
            }while (--count >2);

        }


    }
}
