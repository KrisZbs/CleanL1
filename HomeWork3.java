import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {


        int a = 0;
        int b = 9;
        int q = a + (int) (Math.random() * ((b - a) + 1)); //Загаданное число;



          for (int i = 1; i <4; i++) {
            System.out.println("Угадайте загаданное число");
            Scanner sc = new Scanner(System.in);
            int g = sc.nextInt();//догадка пользователя:

            if (q < g) {
                System.out.println("Загаданное число меньше!");
                System.out.println("Осталось попыток: " + (3-i));



                } else if (q>g){
                    System.out.println("Загаданное число больше! Осталось попыток: " + (3-i));
                }

                 else{

                    System.out.println("Вы угадали!");

                    System.out.println("Сиграем еще раз? 1 - да; 2 - нет.");
                    Scanner answ = new Scanner(System.in);
                    String s = answ.nextLine();
                    if (s =="1"){


                    }
                    else{
                        break;
                    }








                }


            }



}
    }

