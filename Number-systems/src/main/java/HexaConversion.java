public class HexaConversion {
    public static String hexaToBinary(String hexadecimal) {
        StringBuilder binary = new StringBuilder();

        // Map of hexadecimal digits to 4-bit binary equivalents
        String[] hexaToBinaryMap = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        // Convert each hexadecimal digit to its 4-bit binary representation
        for (char hexaDigit : hexadecimal.toUpperCase().toCharArray()) {
            if (Character.isDigit(hexaDigit)) {
                // Convert numeric hexadecimal digits (0-9)
                binary.append(hexaToBinaryMap[Character.getNumericValue(hexaDigit)]);
            } else {
                // Convert alphabetic hexadecimal digits (A-F)
                int hexaValue = 10 + hexaDigit - 'A'; // 'A' represents 10, 'B' represents 11, etc.
                binary.append(hexaToBinaryMap[hexaValue]);
            }
        }

        return binary.toString();
    }

    public static int hexToDecimal(String hex) {
        int decimal = 0;
        int length = hex.length();

        // Iterate over each hexadecimal digit from left to right
        for (int i = 0; i < length; i++) {
            char hexaDigit = hex.charAt(i);

            int decimalValue;
            if (Character.isDigit(hexaDigit)) {
                // If the character is a digit (0-9), convert it to its integer value
                decimalValue = Character.getNumericValue(hexaDigit);
            } else {
                // If the character is a letter (A-F), determine its integer value (A=10, B=11, etc.)
                decimalValue = 10 + Character.toUpperCase(hexaDigit) - 'A';
            }

            // Positional value, taking into account the power of 16
            int power = length - i - 1; // Calculate the position (from left to right)
            decimal += decimalValue * Math.pow(16, power); // Calculate the decimal representation
        }

        return decimal;
    }

    public static String hexToOctal(String hex) {
        StringBuilder binary = new StringBuilder();

        // Map of hexadecimal digits to their 4-bit binary equivalents
        String[] hexToBinaryMap = {
                "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
        };

        // Convert each hexadecimal digit to 4-bit binary representation
        for (char hexaDigit : hex.toUpperCase().toCharArray()) {
            if (Character.isDigit(hexaDigit)) {
                binary.append(hexToBinaryMap[Character.getNumericValue(hexaDigit)]);
            } else {
                int hexaValue = 10 + (hexaDigit - 'A'); // 'A' represents 10, 'B' represents 11, etc.
                binary.append(hexToBinaryMap[hexaValue]);
            }
        }

        StringBuilder octal = new StringBuilder();

        // Pad the binary string with leading zeros to ensure it has a length that is a multiple of 3
        int padding = (3 - (binary.length() % 3)) % 3;
        String paddedBinary = "0".repeat(padding) + binary.toString();

        // Convert each group of three binary digits to octal
        for (int i = 0; i < paddedBinary.length(); i += 3) {
            String binaryGroup = paddedBinary.substring(i, i + 3);
            int decimalValue = Integer.parseInt(binaryGroup, 2); // Binary to decimal
            octal.append(Integer.toOctalString(decimalValue)); // Decimal to octal
        }

        return octal.toString();
    }
}
