import UtilitesCheck.Patterns;

import java.util.Scanner;

public class NameNumber extends Patterns {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input a name: ");
        String name = in.nextLine();
        if (chechThatNotNumber(name)) return;


        System.out.print("Input a number: ");
        String age = in.nextLine();
        if (checkThatNotString(age)) return;

        System.out.print("I'm " + name + " and I'm " + age + " years old.");
    }


}

