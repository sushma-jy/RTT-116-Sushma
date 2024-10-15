package Module303_8;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(){

    }
    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    //**************************************************
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    //****************************************************
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    //*******************************************
    public String toString(){
        return "Square height: " + height + " width: " + width;
    }
    public int calculateArea(){
        return width * height;
    }
    //******************************************************
    public static void main(String[] args){
        Rectangle r1=new Rectangle();
        System.out.println(r1.toString());
        System.out.println(r1.calculateArea());
        Rectangle r2=new Rectangle(10,20);
        System.out.println(r2.toString());
        System.out.println(r2.calculateArea());
    }
}
