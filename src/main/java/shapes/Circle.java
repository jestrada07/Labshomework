package shapes;

public class Circle {
    public int radius;
    public double areaOfCircle;


    public void calculateArea(){
        areaOfCircle = Math.PI * (radius * radius);

        System.out.println("the area of this circle is: " + Math.PI * (this.radius * this.radius)+ " cm");

    }




}
