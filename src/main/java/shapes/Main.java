package shapes;

public class Main {

    public static void main(String[] args) {
        Square squareSide1 = new Square();
        squareSide1.sideLength = 10.0;
        Square squareSide2 = new Square();
        squareSide2.sideLength = 7.0;
        squareSide1.calculateArea();
        squareSide2.calculateArea();


         Circle radius1 = new Circle();
         radius1.radius = 4;
         Circle radius2 = new Circle();
         radius2.radius = 6;
         radius1.calculateArea();
         radius2.calculateArea();

         Triangle color1 = new Triangle();
         color1.color = "red";
         color1.triangleInfo();

         Triangle area1 = new Triangle();
         int base;
         int height;
         int result1 = area1.calculateArea(4, 5 / 2);
        System.out.println("this is the area of this red triangle: " + result1 + " cm");




















    }

}
