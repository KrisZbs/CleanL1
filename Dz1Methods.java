package JavaBaseDZ;

public class Dz1Methods {

static void showValue (float a, float b,float c,float d) {
float method;
method=a*(b + (c / d));
    System.out.println("Выражение = "+method);



}

    public static void main(String[] args) {
        showValue(0.58f, 2.25f, 25.6f ,4.8f);
    }

}
