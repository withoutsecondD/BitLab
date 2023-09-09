package Bitlab.Module1.Practice6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String someWord = in.next();
        String someLetter = in.next();

        if (someWord.indexOf(someLetter) != -1) {
            System.out.println(someWord.indexOf(someLetter));
        }
        else {
            System.out.println("THERE IS NO SUCH LETTER");
        }
    }
}
