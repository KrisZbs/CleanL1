package JavaBaseDZ;


import java.util.Scanner;

public class exfour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Сумма = " + c);
        if (c >= 10 && c <= 20){
            System.out.println("True");
        }
        else
            System.out.println("False");

    }


    }











