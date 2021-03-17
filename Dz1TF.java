package JavaBaseDZ;

public class Dz1TF {

    static void defineDig(int digit) {

        if (digit >= 0) {
            System.out.println("Вы вели положительное число");

        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }

    public static void main(String[] args) {
        defineDig(10);
        defineDig(-1);
        defineDig(0);
    }
}