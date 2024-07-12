public class DecimalConversion {
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0"; // Special case for decimal zero
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2; // Get the remainder when divided by 2
            binary.append(remainder); // Append the remainder to the binary representation
            decimal /= 2; // Divide the decimal by 2 to continue the process
        }

        return binary.reverse().toString(); // Reverse to get the correct binary representation
    }

    public static String decimalToOctal(int decimal) {
        if (decimal == 0) {
            return "0"; // Special case for 0
        }

        StringBuilder octal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 8; // Find the remainder when divided by 8
            octal.append(remainder); // Add the remainder to the octal representation
            decimal /= 8; // Divide the decimal number by 8
        }

        return octal.reverse().toString(); // Reverse the string to get the correct octal representation
    }

    public static String decimalToHexadecimal(int decimal) {
        if (decimal == 0) {
            return "0"; // Special case for 0
        }

        StringBuilder hexadecimal = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 16; // Find the remainder when divided by 16
            char hexDigit;

            // Convert the remainder to the corresponding hexadecimal digit
            if (remainder < 10) {
                hexDigit = (char) ('0' + remainder); // '0' to '9'
            } else {
                hexDigit = (char) ('A' + (remainder - 10)); // 'A' to 'F'
            }

            hexadecimal.append(hexDigit); // Append to the hex string
            decimal /= 16; // Divide the decimal by 16
        }

        return hexadecimal.reverse().toString(); // Reverse the string to get the correct hexadecimal representation
    }
}
