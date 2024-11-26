package BT7;
import BT6.BigNum;

public class Fraction {
    private BigNum numerator;
    private BigNum denominator;

    // Constructor for Fraction with BigNum
    public Fraction(BigNum numerator, BigNum denominator) {
        if (denominator.getNumber().equals("0")) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();  // Automatically reduce the fraction
    }

    // Constructor for Fraction with String inputs
    public Fraction(String numerator, String denominator) {
        if (denominator.equals("0")) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = new BigNum(numerator);
        this.denominator = new BigNum(denominator);
        reduce();  // Automatically reduce the fraction
    }

    // Constructor for Fraction with Integer inputs
    public Fraction(Integer numerator, Integer denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = new BigNum(String.valueOf(numerator));
        this.denominator = new BigNum(String.valueOf(denominator));
        reduce();  // Automatically reduce the fraction
    }

    // Getter for numerator
    public BigNum getNumerator() {
        return this.numerator;
    }

    // Setter for numerator
    public void setNumerator(BigNum numerator) {
        this.numerator = numerator;
        reduce();  // Automatically reduce the fraction
    }

    // Getter for denominator
    public BigNum getDenominator() {
        return this.denominator;
    }

    // Setter for denominator
    public void setDenominator(BigNum denominator) {
        if (denominator.getNumber().equals("0")) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
        reduce();  // Automatically reduce the fraction
    }

    // Reduce the fraction by dividing both numerator and denominator by their GCD
    private void reduce() {
        BigNum gcd = this.numerator.gcd(this.denominator);

        // Divide numerator and denominator by GCD
        this.numerator = this.numerator.divide(gcd);
        this.denominator = this.denominator.divide(gcd);

        // Adjust signs if the denominator is negative
        if (this.denominator.getNumber().startsWith("-")) {
            this.numerator = new BigNum("-" + this.numerator.getNumber());
            this.denominator = new BigNum(this.denominator.getNumber().substring(1));  // Make denominator positive
        }
    }

    // Add method to add two fractions
    public Fraction add(Fraction other) {
        BigNum newNumerator = this.numerator.multiply(other.getDenominator())
                                            .add(other.getNumerator().multiply(this.denominator));
        BigNum newDenominator = this.denominator.multiply(other.getDenominator());
        return new Fraction(newNumerator, newDenominator);
    }

    // Subtract method to subtract two fractions
    public Fraction subtract(Fraction other) {
        BigNum newNumerator = this.numerator.multiply(other.getDenominator())
                                            .subtract(other.getNumerator().multiply(this.denominator));
        BigNum newDenominator = this.denominator.multiply(other.getDenominator());
        return new Fraction(newNumerator, newDenominator);
    }

    // Multiply method to multiply two fractions
    public Fraction multiply(Fraction other) {
        BigNum newNumerator = this.numerator.multiply(other.getNumerator());
        BigNum newDenominator = this.denominator.multiply(other.getDenominator());
        return new Fraction(newNumerator, newDenominator);
    }

    // Divide method to divide two fractions
    public Fraction divide(Fraction other) {
        if (other.getNumerator().getNumber().equals("0")) {
            throw new IllegalArgumentException("Cannot divide by a fraction with a numerator of zero.");
        }
        BigNum newNumerator = this.numerator.multiply(other.getDenominator());
        BigNum newDenominator = this.denominator.multiply(other.getNumerator());
        return new Fraction(newNumerator, newDenominator);
    }

    // Override toString to return the fraction as a string
    @Override
    public String toString() {
        return this.numerator.toString() + "/" + this.denominator.toString();
    }
}
