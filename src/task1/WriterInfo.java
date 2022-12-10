package task1;
public class WriterInfo {
  public static void main(String[]args) {
      Triangle tr1=new Triangle(10,12,11,13);
      System.out.println("------------------------------------------\nTriangle 1- "+tr1);
      Triangle tr2=new Triangle(9,8,7,10);
      System.out.println("Triangle 2- "+tr2);
      Rectangle rect1=new Rectangle(10,11);
      System.out.println("------------------------------------------\nRectangle 1- "+rect1);
      Rectangle rect2=new Rectangle(12,14);
      System.out.println("Rectangle 2- "+rect2);
      Circle c1=new Circle(12);
      System.out.println("------------------------------------------\nCircle 1- "+c1);
      Circle c2=new Circle(11);
      System.out.println("Circle 2- "+c2);
      Figure[]figures=new Figure[]{tr1,tr2,rect1,rect2,c1,c2};
      System.out.println("------------------------------------------\nSum of perimeters= "+Figure.sumPerimeters(figures)+";\n------------------------------------------");
  }
}
