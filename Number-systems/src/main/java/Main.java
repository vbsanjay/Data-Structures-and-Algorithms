import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Binary Number");
        String binaryNumber = sc.next();
        System.out.print("Binary to Decimal: ");
        System.out.println(BinaryConversion.binaryToDecimal(binaryNumber));
        System.out.print("Binary to Octal: ");
        System.out.println(BinaryConversion.binaryToOctal(binaryNumber));
        System.out.print("Binary to Hexadecimal: ");
        System.out.println(BinaryConversion.binaryToHexadecimal(binaryNumber));

        System.out.println("Enter your Decimal Number");
        int decimalNumber = sc.nextInt();
        System.out.print("Decimal to Binary: ");
        System.out.println(DecimalConversion.decimalToBinary(decimalNumber));
        System.out.print("Decimal to Octal: ");
        System.out.println(DecimalConversion.decimalToOctal(decimalNumber));
        System.out.print("Decimal to Hexadecimal: ");
        System.out.println(DecimalConversion.decimalToHexadecimal(decimalNumber));

        System.out.println("Enter your Octal Number");
        String octalNumber = sc.next();
        System.out.print("Octal to Binary: ");
        System.out.println(OctalConversion.octalToBinary(octalNumber));
        System.out.print("Octal to Decimal: ");
        System.out.println(OctalConversion.octalToDecimal(octalNumber));
        System.out.print("Octal to Hexadecimal: ");
        System.out.println(OctalConversion.octalToHexadecimal(octalNumber));

        System.out.println("Enter your Hexadecimal Number");
        String hexadecimalNumber = sc.next();
        System.out.println("Hexadecimal to Binary: ");
        System.out.println(HexaConversion.hexaToBinary(hexadecimalNumber));
        System.out.println("Hexadecimal to Octal: ");
        System.out.println(HexaConversion.hexToOctal(hexadecimalNumber));
        System.out.println("Hexadecimal to Decimal: ");
        System.out.println(HexaConversion.hexToDecimal(hexadecimalNumber));



    }
}
