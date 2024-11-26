package BT6;

public class BigNum {
    private String number;  // Change to String for simpler operations

    // Constructor that accepts various types
    public BigNum(Object number) {
        if (number instanceof String) {
            this.number = (String) number;
        } else if (number instanceof Integer) {
            this.number = String.valueOf(number);
        } else if (number instanceof BigNum) {
            this.number = ((BigNum) number).getNumber();
        } else {
            throw new IllegalArgumentException("Invalid type for BigNum.");
        }
    }

    // Getter for number
    public String getNumber() {
        return this.number;
    }

    // Add method (returns a new BigNum) with sign handling
    public BigNum add(BigNum other) {
        // Handle addition when one of the numbers is negative
        if (this.number.startsWith("-") && !other.number.startsWith("-")) {
            return other.subtract(new BigNum(this.number.substring(1)));
        } else if (!this.number.startsWith("-") && other.number.startsWith("-")) {
            return this.subtract(new BigNum(other.number.substring(1)));
        } else if (this.number.startsWith("-") && other.number.startsWith("-")) {
            return new BigNum("-" + addAbsoluteValues(this.number.substring(1), other.number.substring(1)));
        }

        return new BigNum(addAbsoluteValues(this.number, other.number));
    }

    // Helper to add absolute values (ignores signs)
    private String addAbsoluteValues(String n1, String n2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        n1 = new StringBuilder(n1).reverse().toString();
        n2 = new StringBuilder(n2).reverse().toString();
        int maxLength = Math.max(n1.length(), n2.length());

        for (int i = 0; i < maxLength; i++) {
            int digit1 = i < n1.length() ? n1.charAt(i) - '0' : 0;
            int digit2 = i < n2.length() ? n2.charAt(i) - '0' : 0;
            int sum = digit1 + digit2 + carry;

            result.append(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

    // Subtract method with sign handling
    public BigNum subtract(BigNum other) {
        if (this.number.startsWith("-") && !other.number.startsWith("-")) {
            return new BigNum("-" + addAbsoluteValues(this.number.substring(1), other.number));
        } else if (!this.number.startsWith("-") && other.number.startsWith("-")) {
            return new BigNum(addAbsoluteValues(this.number, other.number.substring(1)));
        } else if (this.number.startsWith("-") && other.number.startsWith("-")) {
            return new BigNum(other.number.substring(1)).subtract(new BigNum(this.number.substring(1)));
        }

        return new BigNum(subtractAbsoluteValues(this.number, other.number));
    }

    // Helper to subtract absolute values
    private String subtractAbsoluteValues(String n1, String n2) {
        StringBuilder result = new StringBuilder();
        int borrow = 0;

        n1 = new StringBuilder(n1).reverse().toString();
        n2 = new StringBuilder(n2).reverse().toString();
        int maxLength = Math.max(n1.length(), n2.length());

        for (int i = 0; i < maxLength; i++) {
            int digit1 = i < n1.length() ? n1.charAt(i) - '0' : 0;
            int digit2 = i < n2.length() ? n2.charAt(i) - '0' : 0;
            int diff = digit1 - digit2 - borrow;

            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result.append(diff);
        }

        // Remove trailing zeros
        while (result.length() > 1 && result.charAt(result.length() - 1) == '0') {
            result.deleteCharAt(result.length() - 1);
        }

        return result.reverse().toString();
    }

    // Multiply method
    public BigNum multiply(BigNum other) {
        String n1 = this.number.startsWith("-") ? this.number.substring(1) : this.number;
        String n2 = other.number.startsWith("-") ? other.number.substring(1) : other.number;

        BigNum result = new BigNum("0");

        for (int i = n1.length() - 1; i >= 0; i--) {
            int digit1 = n1.charAt(i) - '0';
            BigNum partialProduct = new BigNum("0");

            for (int j = n2.length() - 1; j >= 0; j--) {
                int digit2 = n2.charAt(j) - '0';
                partialProduct = partialProduct.add(new BigNum(String.valueOf(digit1 * digit2)));
            }

            result = result.add(new BigNum(partialProduct.number + "0".repeat(n1.length() - 1 - i)));
        }

        if ((this.number.startsWith("-") && !other.number.startsWith("-")) ||
            (!this.number.startsWith("-") && other.number.startsWith("-"))) {
            result = new BigNum("-" + result.number);
        }

        return result;
    }

    // New mod method to return the remainder
    public BigNum mod(BigNum other) {
        BigNum dividend = new BigNum(this.number);
        while (dividend.compareTo(other) >= 0) {
            dividend = dividend.subtract(other);
        }
        return dividend;
    }

    // Compare method
    public int compareTo(BigNum other) {
        if (this.number.length() > other.number.length()) return 1;
        if (this.number.length() < other.number.length()) return -1;
        return this.number.compareTo(other.number);
    }

    // GCD method with corrected algorithm
    public BigNum gcd(BigNum other) {
        BigNum a = this;
        BigNum b = other;

        while (!b.getNumber().equals("0")) {
            BigNum temp = a;
            a = b;
            b = temp.mod(b);
        }
        return a;
    }

    @Override
    public String toString() {
        return this.number;
    }

    public BigNum divide(BigNum other) {
        String dividend = (String) this.number;
        String divisor = (String) other.number;

        if (divisor.equals("0")) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        StringBuilder quotient = new StringBuilder();
        BigNum remainder = new BigNum("0");

        for (int i = 0; i < dividend.length(); i++) {
            remainder = new BigNum(remainder.getNumber() + dividend.charAt(i));

            int count = 0;
            while (remainder.compareTo(other) >= 0) {
                remainder = remainder.subtract(other);
                count++;
            }
            quotient.append(count);
        }

        // Remove leading zeros in the quotient
        while (quotient.length() > 1 && quotient.charAt(0) == '0') {
            quotient.deleteCharAt(0);
        }

        return new BigNum(quotient.toString());
    }
}
