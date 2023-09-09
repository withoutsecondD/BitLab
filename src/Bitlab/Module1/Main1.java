package Bitlab.Module1;

public class Main1 {
    public static void main(String[] args) { // psvm + tab for shortcut!
        byte number1 = -128; // from -128 to 127
        short number2 = -32768; // from -32768 to 32767
        int number3 = -2147483648; // from -2^31 to (2^31) - 1
        long number4 = 1l;  // from -2^63 to (2^63) - 1; l in the end
                            // is needed when using number of long type
        float number5 = 6777.23f;
        double number6 = 6777.2;

        System.out.println((number1 * number5 * 10 - 100) / 20);
        System.out.println("Hello, World!"); // sout + tab for shortcut!
    }
}

// ctrl + alt + l to make code look good!
// ctrl + d to instantly create a copy of currently selected line