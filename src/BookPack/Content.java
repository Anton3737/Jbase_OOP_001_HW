package BookPack;

import java.util.Scanner;

public class Content {
    static String Content;
    static void show(){
        Scanner in = new Scanner(System.in);
        Content = in.nextLine();
        System.out.println("Content: \n" + Content);
    }
}
