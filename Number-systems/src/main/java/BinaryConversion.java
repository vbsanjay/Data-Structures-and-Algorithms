public class BinaryConversion {
    public static int binaryToDecimal(String binary) {

        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(i);
            if (bit == '1') {
                // Calculate the power of 2 based on the position (from right to left)
                int power = length - i - 1;
                decimal += Math.pow(2, power);
            }
        }

        return decimal;
    }

    public static String binaryToOctal(String binary) {
        int length = binary.length();

        // Pad the binary string with leading zeros to make the length a multiple of 3
        int padding = (3 - (length % 3)) % 3;
        String paddedBinary = "0".repeat(padding) + binary;

        StringBuilder octal = new StringBuilder();
        for (int i = 0; i < paddedBinary.length(); i += 3) {
            // Extract a group of three binary digits
            String binaryGroup = paddedBinary.substring(i, i + 3);

            // Convert the binary group to a decimal number
            int decimalValue = Integer.parseInt(binaryGroup, 2);

            // Convert the decimal number to its octal representation
            octal.append(decimalValue);
        }

        return octal.toString();
    }

    public static String binaryToHexadecimal(String binary) {
        int length = binary.length();

        // Pad the binary string with leading zeros to make the length a multiple of 4
        int padding = (4 - (length % 4)) % 4;
        String paddedBinary = "0".repeat(padding) + binary;

        StringBuilder hexadecimal = new StringBuilder();
        for (int i = 0; i < paddedBinary.length(); i += 4) {
            // Extract a group of four binary digits
            String binaryGroup = paddedBinary.substring(i, i + 4);

            // Convert the binary group to a decimal number
            int decimalValue = Integer.parseInt(binaryGroup, 2);

            // Convert the decimal number to its hexadecimal representation
            String hexadecimalDigit = Integer.toHexString(decimalValue);

            // Append the hexadecimal digit to the output string
            hexadecimal.append(hexadecimalDigit.toUpperCase());
        }

        return hexadecimal.toString();
    }



}
