// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package Main;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор");
        while (true) {
            Main.menu();
        }

    }

    public static void menu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Сумма\n2 - Умножить");
        System.out.println("- ");
        int number = scan.nextInt();

        if (number == 1) {
            System.out.println("Напиши 2 числа которые нужно суммировать");

            System.out.println("Первое число - ");
            int one = scan.nextInt();
            System.out.println("Второе число - ");
            int two = scan.nextInt();
            Main.summa(one, two);
        }
        if (number == 2) {
            System.out.println("Напиши 2 числа которые нужно умножить");

            System.out.println("- ");
            System.out.println("Первое число - ");
            int one = scan.nextInt();
            System.out.println("Второе число - ");
            int two = scan.nextInt();
            Main.ymnohit(one, two);
        }
    }

    public static void ymnohit(int one, int two) {
        int tri = one * two;
        System.out.println("Произведение - "+tri);

    }
     public static void summa(int one,int two){
      int chetire = one +two;
         System.out.println("Сумма - "+chetire);
     }

}

