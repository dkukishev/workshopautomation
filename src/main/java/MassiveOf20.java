
import java.util.Scanner;

public class MassiveOf20 {

    public static void main(String[] agrs) {

        int[] arr = new int[20];

        Scanner in = new Scanner(System.in);
        System.out.println("Put array of 20 digits");

        for (int i = 0; i < arr.length; i++) {
            {

                System.out.print("Enter " + (i + 1) + " array element: ");
                arr[i] = in.nextInt();
            }


            System.out.println("Array of even:");

            for (int k = 0; k < arr.length; k++) {

                if (arr[k] % 2 == 0) {
                    System.out.println((k + 1) + " is " + arr[k]);
                }
            }

            System.out.println("Array of odd:");

            for (int p = 0; p < arr.length; p++) {

                if (arr[p] % 2 != 0) {
                    System.out.println((p + 1) + " is " + arr[p]);
                }
            }
        }
    }
}