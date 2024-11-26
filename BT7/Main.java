package BT7;
import BT6.BigNum;
public class Main {
	public static void main(String[] args) {
		Fraction num1 = new Fraction(new BigNum("3"),new BigNum("7"));	
		Fraction num2 = new Fraction("1", "2");
		Fraction num3 = new Fraction(3,4);
		Fraction num4 = num1.add(num3);
		System.out.println("Result: " + num4);
	}
}
