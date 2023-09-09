    package Bitlab.Module1.Practice6;

    import java.util.Scanner;

    public class Task10 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            String someWord = in.next();

            for (int i = 0; i < someWord.length(); i++) {
                System.out.print(someWord.charAt(i) + "" + someWord.charAt(i));
            }
        }
    }
