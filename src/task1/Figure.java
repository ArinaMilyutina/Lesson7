package task1;
public  class Figure {
    private double square;
    public  double perimeter;

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void calculateSquare(){
    }
    public void calculatePerimeter(){
    }
    public static double sumPerimeters(Figure[] figures){
        double sum=0;
        for(int i=0;i<6;i++){
            sum+=figures[i].perimeter;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "square=" + square +
                ", perimeter=" + perimeter +
                ";";
    }
}
