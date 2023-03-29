package shapes;

public class Square {
    public double sideLength;
    public double areaOfSquare;



    public void calculateArea(){
       areaOfSquare = sideLength * sideLength;
        System.out.println("the area of this square is: " + this.sideLength * this.sideLength + " cm");



    }
}
