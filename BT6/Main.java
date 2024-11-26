package BT6;

public class Main {
	public static void main(String[] args) {
    BigNum num1 = new BigNum("123456789012345678901234567890");
    BigNum num2 = new BigNum("987654321098765432109876543210");
    BigNum result = num1.add(num2);
    BigNum result2 = num2.subtract(num1);
    System.out.println("Sum: " + result);
    System.out.println("Subtract: " + result2);
	}
}
