import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        int r, a;
        double alan, pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Giriniz");
        r = input.nextInt();
        System.out.println("Dairenin Diliminin Açısını Giriniz");
        a = input.nextInt();

        alan = pi * r * r * a / 360;

        System.out.println("Daire Diliminin Alanı: " + alan);

    }
}
