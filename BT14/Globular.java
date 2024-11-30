package BT14;

class Globular extends Shape3D {
    private double r;

    public Globular(double r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return -1; // No perimeter for Globular
    }

    @Override
    public double area() {
        return roundToTwoDecimalPlaces(4 * Math.PI * r * r);
    }

    @Override
    public double volume() {
        return roundToTwoDecimalPlaces((4.0 / 3.0) * Math.PI * r * r * r);
    }

    @Override
    public String toString() {
        return String.format("Globular [r=%.2f]", r);
    }

    // Helper method for rounding
    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}


