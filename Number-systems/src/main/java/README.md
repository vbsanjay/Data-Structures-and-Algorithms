# Number Systems

A number system is a framework or set of rules for representing numbers. Here's a brief overview of some common types of number systems and their key characteristics:

1. **Decimal (Base-10) System**:
    - The most common system, used worldwide for most everyday calculations.
    - Uses ten digits: 0 through 9.
    - Each digit's place value is a power of 10 (units, tens, hundreds, etc.).

2. **Binary (Base-2) System**:
    - Primarily used in computing and digital electronics.
    - Uses two digits: 0 and 1.
    - Each digit's place value is a power of 2.

3. **Octal (Base-8) System**:
    - Less common, but sometimes used in computing.
    - Uses eight digits: 0 through 7.
    - Each digit's place value is a power of 8.

4. **Hexadecimal (Base-16) System**:
    - Commonly used in computing and digital systems.
    - Uses sixteen digits: 0 through 9, followed by A (10), B (11), C (12), D (13), E (14), and F (15).
    - Each digit's place value is a power of 16.

5. **Duodecimal (Base-12) System**:
    - Also known as the dozenal system.
    - Uses twelve digits, typically 0 through 9, plus additional symbols or digits for 10 and 11.
    - Historically used in various cultures and occasionally in modern contexts.

6. **Roman Numerals**:
    - An ancient system used in the Roman Empire, with symbols like I, V, X, L, C, D, and M.
    - Represents values through a combination of addition and subtraction rules.
    - Largely replaced by the decimal system for everyday use.

7. **Base-n Systems**:
    - Generalized systems where "n" can be any integer greater than 1.
    - The base determines the number of unique digits and the place value system.

---

# Positional Notation

Positional notation is a method of representing numbers where the value of each digit in a number is determined by its position within the number and by a base or radix. This concept underpins most modern numerical systems, like the decimal (base-10), binary (base-2), octal (base-8), and hexadecimal (base-16) systems.

### Key Features of Positional Notation
1. **Base/Radix**:
   - The base, or radix, defines the total number of distinct digits used in the system. For example:
      - In base-10 (decimal), there are 10 digits (0–9).
      - In base-2 (binary), there are 2 digits (0, 1).
      - In base-16 (hexadecimal), there are 16 digits (0–9, A–F).

2. **Positional Value**:
   - The position of a digit in a number determines its value. This value is a power of the base.
   - In decimal, positions represent powers of 10 (10^0, 10^1, 10^2, ...). In binary, it's powers of 2 (2^0, 2^1, 2^2, ...), and so on.

3. **Calculation of a Number's Value**:
   - To determine the total value of a number, multiply each digit by the appropriate power of the base and then sum the results.
   - For example, in the decimal number 345, the value is calculated as:
   - ```math
     3 x 10^2 + 4 x 10^1 + 5 x 10^0 = 300 + 40 + 5 = 345

### References 
- https://www.youtube.com/watch?v=LpuPe81bc2w
- https://www.youtube.com/watch?v=Xpk67YzOn5w
- https://www.youtube.com/watch?v=zDNaUi2cjv4

# Summary of the various number system conversions

### Binary to Decimal
- **Description**: Convert a binary (base-2) number to its decimal (base-10) representation.
- **Method**: Iterate over each binary digit from right to left, multiplying by the corresponding power of 2. The total is the sum of these results.
- **Example**: Binary "1101" to decimal is 1 x 2^3 + 1 x 2^2 + 0 x 2^1 + 1 x 2^0 = 8 + 4 + 0 + 1 = 13

### Octal to Decimal
- **Description**: Convert an octal (base-8) number to its decimal (base-10) representation.
- **Method**: Iterate over each octal digit from left to right, multiplying by the corresponding power of 8, then sum the results.
- **Example**: Octal "157" to decimal is 1 x 8^2 + 5 x 8^1 + 7 x 8^0 = 64 + 40 + 7 = 111.

### Hexa to Decimal
- **Description**: Convert a hexadecimal (base-16) number to its decimal (base-10) representation.
- **Method**: Convert each hexadecimal digit to its decimal equivalent (using powers of 16), then sum the results.
- **Example**: Hexadecimal "1A3F" to decimal is 1 x 16^3 + 10 x 16^2 + 3 x 16^1 + 15 x 16^0 = 4096 + 2560 + 48 + 15 = 6719.

### Octal to Binary
- **Description**: Convert an octal (base-8) number to a binary (base-2) representation.
- **Method**: Convert each octal digit to its corresponding 3-bit binary representation.
- **Example**: Octal "157" to binary is "001 101 111", resulting in "001101111".

### Decimal to Binary
- **Description**: Convert a decimal (base-10) number to a binary (base-2) representation.
- **Method**: Use repeated division by 2 and collect the remainders. Read remainders from bottom to top.
- **Example**: Decimal "10" to binary is 10 divided by 2 repeatedly, resulting in remainders 0, 1, 0, 1, yielding "1010".

### Hexa to Binary
- **Description**: Convert a hexadecimal (base-16) number to a binary (base-2) representation.
- **Method**: Convert each hexadecimal digit to its corresponding 4-bit binary representation.
- **Example**: Hexadecimal "1A3F" to binary is "0001 1010 0011 1111", resulting in "0001101000111111".

### Binary to Octal
- **Description**: Convert a binary (base-2) number to an octal (base-8) representation.
- **Method**: Group the binary digits into sets of three and convert each group to its octal equivalent.
- **Example**: Binary "110101101" to octal is "001 101 101", yielding octal "155".

### Decimal to Octal
- **Description**: Convert a decimal (base-10) number to an octal (base-8) representation.
- **Method**: Use repeated division by 8, collect the remainders, and read them from bottom to top.
- **Example**: Decimal "78" to octal is remainders 6, 1, 1, resulting in "116".

### Hexa to Octal
- **Description**: Convert a hexadecimal (base-16) number to an octal (base-8) representation.
- **Method**: Convert hexadecimal to binary, then binary to octal.
- **Example**: Hexadecimal "1A3F" to octal is converted to binary "0001101000111111", then grouped into sets of three to yield octal "15077".

### Binary to Hexa
- **Description**: Convert a binary (base-2) number to a hexadecimal (base-16) representation.
- **Method**: Group binary digits into sets of four and convert each group to its hexadecimal equivalent.
- **Example**: Binary "110101101110" to hexadecimal is "1101 0110 1110", yielding hexadecimal "D6E".

### Octal to Hexa
- **Description**: Convert an octal (base-8) number to a hexadecimal (base-16) representation.
- **Method**: Convert octal to binary, then binary to hexadecimal.
- **Example**: Octal "157" to hexadecimal is converted to binary "001101111", then converted to hexadecimal "37".

### Decimal to Hexa
- **Description**: Convert a decimal (base-10) number to a hexadecimal (base-16) representation.
- **Method**: Use repeated division by 16, collect the remainders, and read them from bottom to top.
- **Example**: Decimal "255" to hexadecimal results in remainders 15, 15, yielding hexadecimal "FF".
