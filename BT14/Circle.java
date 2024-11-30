package BT14;

class Circle extends Shape2D {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return roundToTwoDecimalPlaces(2 * Math.PI * r);
    }

    @Override
    public double area() {
        return roundToTwoDecimalPlaces(Math.PI * r * r);
    }

    @Override
    public String toString() {
        return String.format("Circle [r=%.2f]", r);
    }

    // Helper method for rounding
    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}


