package BT7;
import BT6.BigNum;

public class Fraction {
    private BigNum numerator;
    private BigNum denominator;

    public Fraction(BigNum numerator, BigNum denominator) {
        if (denominator.getNumber().equals("0")) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();  
    }

    public Fraction(String numerator, String denominator) {
        if (denominator.equals("0")) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = new BigNum(numerator);
        this.denominator = new BigNum(denominator);
        reduce();  
    }

    public Fraction(Integer numerator, Integer denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = new BigNum(String.valueOf(numerator));
        this.denominator = new BigNum(String.valueOf(denominator));
        reduce(); 
    }

    public BigNum getNumerator() {
        return this.numerator;
    }

    public void setNumerator(BigNum numerator) {
        this.numerator = numerator;
        reduce();  
    }

    public BigNum getDenominator() {
        return this.denominator;
    }

    public void setDenominator(BigNum denominator) {
        if (denominator.getNumber().equals("0")) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.denominator = denominator;
        reduce(); 
    }

    private void reduce() {
        BigNum gcd = this.numerator.gcd(this.denominator);

        this.numerator = this.numerator.divide(gcd);
        this.denominator = this.denominator.divide(gcd);

        if (this.denominator.getNumber().startsWith("-")) {
            this.numerator = new BigNum("-" + this.numerator.getNumber());
            this.denominator = new BigNum(this.denominator.getNumber().substring(1));  
        }
    }

    public Fraction add(Fraction other) {
        BigNum newNumerator = this.numerator.multiply(other.getDenominator())
                                            .add(other.getNumerator().multiply(this.denominator));
        BigNum newDenominator = this.denominator.multiply(other.getDenominator());
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        BigNum newNumerator = this.numerator.multiply(other.getDenominator())
                                            .subtract(other.getNumerator().multiply(this.denominator));
        BigNum newDenominator = this.denominator.multiply(other.getDenominator());
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        BigNum newNumerator = this.numerator.multiply(other.getNumerator());
        BigNum newDenominator = this.denominator.multiply(other.getDenominator());
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.getNumerator().getNumber().equals("0")) {
            throw new IllegalArgumentException("Cannot divide by a fraction with a numerator of zero.");
        }
        BigNum newNumerator = this.numerator.multiply(other.getDenominator());
        BigNum newDenominator = this.denominator.multiply(other.getNumerator());
        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public String toString() {
        return this.numerator.toString() + "/" + this.denominator.toString();
    }
}
