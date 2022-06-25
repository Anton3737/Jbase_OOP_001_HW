package BookPack;

import java.util.Scanner;

public class Title {
    static String String;
    static void show(){
        Scanner in = new Scanner(System.in);
        String = in.nextLine();
        System.out.println("Title: \n" + String);
    }
}
