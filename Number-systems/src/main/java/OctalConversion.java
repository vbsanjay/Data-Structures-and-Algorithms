public class OctalConversion {
    public static String octalToBinary(String octal) {
        StringBuilder binary = new StringBuilder();

        // Define a mapping for each octal digit to its 3-bit binary equivalent
        String[] octalToBinaryMap = {
                "000", "001", "010", "011", "100", "101", "110", "111"
        };

        // Convert each octal digit to its binary representation
        for (char octalDigit : octal.toCharArray()) {
            int octalValue = Character.getNumericValue(octalDigit);
            binary.append(octalToBinaryMap[octalValue]); // Append the corresponding 3-bit binary
        }

        return binary.toString();
    }

    public static int octalToDecimal(String octal) {
        int decimal = 0;
        int length = octal.length();

        // Process each digit in the octal number from left to right
        for (int i = 0; i < length; i++) {
            // Get the numeric value of the current octal digit
            int octalDigit = Character.getNumericValue(octal.charAt(i));

            // Calculate the positional value (power of 8)
            int power = length - i - 1;

            // Add the corresponding decimal value to the total
            decimal += octalDigit * Math.pow(8, power);
        }

        return decimal;
    }

    public static String octalToHexadecimal(String octal) {
        StringBuilder binary = new StringBuilder();

        // Mapping of octal digits to their 3-bit binary equivalents
        String[] octalToBinaryMap = {
                "000", "001", "010", "011", "100", "101", "110", "111"
        };

        // Convert each octal digit to binary
        for (char digit : octal.toCharArray()) {
            int octalValue = Character.getNumericValue(digit);
            binary.append(octalToBinaryMap[octalValue]); // Get 3-bit binary equivalent
        }

        // Convert binary to hexadecimal
        StringBuilder hexadecimal = new StringBuilder();

        // Pad with leading zeros to ensure groups of four binary digits
        int padding = (4 - (binary.length() % 4)) % 4;
        String paddedBinary = "0".repeat(padding) + binary.toString();

        // Convert each group of four binary digits to hexadecimal
        for (int i = 0; i < paddedBinary.length(); i += 4) {
            String binaryGroup = paddedBinary.substring(i, i + 4);
            int decimalValue = Integer.parseInt(binaryGroup, 2); // Binary to decimal
            hexadecimal.append(Integer.toHexString(decimalValue).toUpperCase()); // Decimal to hex
        }

        return hexadecimal.toString();
    }

}
