package task1;
public final class Circle extends Figure{
    private double r;

    public Circle(double r) {

        this.r = r;
        calculatePerimeter();
        calculateSquare();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void calculateSquare() {
         double square=r*r*Math.PI;
         setSquare(square);
    }

    @Override
    public void calculatePerimeter() {
         double perimeter=2*r*Math.PI;
         setPerimeter(perimeter);
    }
}
