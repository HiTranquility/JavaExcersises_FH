package BT14;

class Triangle extends Shape2D {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return roundToTwoDecimalPlaces(a + b + c);
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return roundToTwoDecimalPlaces(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    @Override
    public String toString() {
        return String.format("Triangle [a=%.2f, b=%.2f, c=%.2f]", a, b, c);
    }

    // Helper method for rounding
    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}

