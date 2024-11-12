package Homework.GLAB303_10_2;

public class myRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());
        Shape sObj = new Shape();
        sObj.displayshapName();
        System.out.println(sObj instanceof Shape);
        System.out.println("+++++++++");
        Shape shapeCircleObj = new Circle(100);
        shapeCircleObj.displayshapName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj);
        System.out.println(shapeCircleObj instanceof Circle); // true
        System.out.println(sObj instanceof Circle);

        System.out.println("--------------------");
        Shape shapeRectangleObj = new Rectangle("Red");
        shapeRectangleObj.displayshapName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj);
        System.out.println(shapeRectangleObj instanceof Rectangle);
        System.out.println(sObj instanceof Rectangle);
        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue");
        shapeTriangleObj.displayshapName();
        shapeTriangleObj.setHeight(2);
        shapeTriangleObj.setBase(3);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj);


        System.out.println(shapeTriangleObj instanceof Triangle); // true
        System.out.println(sObj instanceof Triangle);
        System.out.println("--------------------");

        Cylinder cylinderShape = new Cylinder(3);
        cylinderShape.displayshapName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolumne());
        System.out.println(cylinderShape);
    }
}



