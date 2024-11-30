package BT14;

public class Main {
	public static void main(String[] args) {
		Shape2D triangle = new Triangle(3, 4, 5);
		System.out.println(triangle);
		System.out.println("Perimeter: " + triangle.perimeter());
		System.out.println("Area: " + triangle.area());
		System.out.println();
		Shape2D rectangle = new Rectangle(3, 4);
		System.out.println(rectangle);
		System.out.println("Perimeter: " + rectangle.perimeter());
		System.out.println("Area: " + rectangle.area());
		System.out.println();
		Shape2D circle = new Circle(3);
		System.out.println(circle);
		System.out.println("Perimeter: " + circle.perimeter());
		System.out.println("Area: " + circle.area());
		System.out.println();
		Shape3D cone = new Cone(3, 5);
		System.out.println(cone);
		System.out.println("Perimeter: " + cone.perimeter());
		System.out.println("Area: " + cone.area());
		System.out.println("Volume: " + cone.volume());
		System.out.println();
		Shape3D cylinder = new Cylinder(3, 5);
		System.out.println(cylinder);
		System.out.println("Perimeter: " + cylinder.perimeter());
		System.out.println("Area: " + cylinder.area());
		System.out.println("Volume: " + cylinder.volume());
		System.out.println();
		Shape3D globular = new Globular(3);
		System.out.println(globular);
		System.out.println("Perimeter: " + globular.perimeter());
		System.out.println("Area: " + globular.area());
		System.out.println("Volume: " + globular.volume());
		}
}
