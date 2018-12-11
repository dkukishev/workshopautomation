import java.util.InputMismatchException;
import java.util.Scanner;

public class MassiveOf10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] a = new int[10]; //массив 123
        // int i = 0; № элемента массива

        for (int i = 0; i < a.length; i++) {
            try {

                System.out.print("Enter " + (i + 1) + " array element: ");
                a[i] = in.nextInt();

                System.out.println("Element " + (i + 1) + " is " + a[i]);

            } catch (InputMismatchException e) {
                System.out.println("OOOPPppssssss!!! with " + (i + 1) + "element! Only digits can be used.");
                in = new Scanner(System.in);
            }
        }

        System.out.println("Revert array:");
        for (int i = a.length - 1; i >= 0; i--) {

            System.out.println(a[i]);
        }
    }
}