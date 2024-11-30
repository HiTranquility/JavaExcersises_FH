package BT14;

class Cone extends Shape3D {
    private double r, h;

    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double perimeter() {
        return -1; // No perimeter for Cone
    }
    public double getR() { return r; }
    public void setR(double r) { this.r = r; }

    public double getH() { return h; }
    public void setH(double h) { this.h = h; }

    @Override
    public double area() {
        return roundToTwoDecimalPlaces(Math.PI * r * (r + Math.sqrt(r * r + h * h)));
    }

    @Override
    public double volume() {
        return roundToTwoDecimalPlaces((1.0 / 3.0) * Math.PI * r * r * h);
    }

    @Override
    public String toString() {
        return String.format("Cone [r=%.2f, h=%.2f]", r, h);
    }

    // Helper method for rounding
    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}


