package Bitlab.Module2.Practice1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String login = in.next();
        String password = in.next();

        System.out.println(check(login, password));
    }

    static String check(String str1, String str2) {
        if (str1.equals("admin") && str2.equals("qwerty")) {
            return "Authentication completed";
        }
        else {
            return "Invalid login or password";
        }
    }
}
