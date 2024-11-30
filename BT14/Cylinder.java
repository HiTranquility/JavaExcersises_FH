package BT14;

class Cylinder extends Cone {
    public Cylinder(double r, double h) {
        super(r, h);
    }

    @Override
    public double perimeter() {
        return -1; // No perimeter for Cylinder
    }

    @Override
    public double area() {
        return roundToTwoDecimalPlaces(2 * Math.PI * getR() * getH() + 2 * Math.PI * getR() * getR());
    }

    @Override
    public double volume() {
        return roundToTwoDecimalPlaces(Math.PI * getR() * getR() * getH());
    }

    @Override
    public String toString() {
        return String.format("Cylinder [r=%.2f, h=%.2f]", getR(), getH());
    }

    // Helper method for rounding
    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}


