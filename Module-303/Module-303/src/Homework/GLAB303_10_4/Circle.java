package Homework.GLAB303_10_4;

public class Circle extends Shape implements Movable {
    protected double radius;
    private int x, y;
    private final double PI = Math.PI;

    /** Constructs a MovablePoint instance at the given x and y */
    public Circle(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, double height) {
        this.radius = radius;
        super.height = height;
    }
    @Override
    public double getArea() {
        //double area = PI * this.radius * this.radius;
        double area = PI * Math.pow(this.radius, 2);
        return area;
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() +  "] ";
    }

    public String getCoordinate()
    {
        return  "(" + x + "," + y + ")";
    }
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
