import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Binary Number");
        String binaryNumber = sc.next();
        System.out.println("Binary to Decimal");
        System.out.println(BinaryConversion.binaryToDecimal(binaryNumber));
        System.out.println("Binary to Octal");
        System.out.println(BinaryConversion.binaryToOctal(binaryNumber));
        System.out.println("Binary to Hexa");
        System.out.println(BinaryConversion.binaryToHexadecimal(binaryNumber));

//        System.out.println("Decimal to Binary");
//        System.out.println("Decimal to Octal");
//        System.out.println("Decimal to Hexa");
//
//        System.out.println("Octal to Binary");
//        System.out.println("Octal to Decimal");
//        System.out.println("Octal to Hexa");
//
//        System.out.println("Hexa to Binary");
//        System.out.println("Hexa to Octal");
//        System.out.println("Hexa to Hexa");



    }
}
