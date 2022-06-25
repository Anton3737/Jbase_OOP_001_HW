package BookPack;

import java.util.Scanner;

public class Author {
    static String Author;
    static void show(){
        Scanner in = new Scanner(System.in);
        Author = in.nextLine();
        System.out.println("Author: \n" + Author);
    }
}
