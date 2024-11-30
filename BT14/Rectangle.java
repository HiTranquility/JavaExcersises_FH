package BT14;

class Rectangle extends Shape2D {
    private double w, h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public double perimeter() {
        return roundToTwoDecimalPlaces(2 * (w + h));
    }

    @Override
    public double area() {
        return roundToTwoDecimalPlaces(w * h);
    }

    @Override
    public String toString() {
        return String.format("Rectangle [w=%.2f, h=%.2f]", w, h);
    }

    // Helper method for rounding
    private double roundToTwoDecimalPlaces(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}


