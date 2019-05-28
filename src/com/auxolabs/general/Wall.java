package com.auxolabs.general;

public class Wall
{
    double width;
    double height;
    Wall()
    {

    }
    Wall(double width,double height)
    {
        if(width<0 && height<0)
        {
            this.width=0;
            this.height=0;
        }
        else
        {
            this.width = width;
            this.height = height;
        }
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
    public double setWidth(double width)
    {
        if(width<0)
        {
            return 0;
        }
        this.width=width;
        return width;
    }
    public double setHeight(double height)
    {
        if(height<0)
        {
            return 0;
        }
        this.height=height;
        return height;
    }
    public double getArea()
    {
        double area = width*height;
        return area;
    }
    public static void main(String[] args)
    {
        Wall wall=new Wall(5,4);
        System.out.println("area="+wall.getArea());
        wall.setWidth(1.5);
        wall.setHeight(-1.45);
        System.out.println("width="+wall.getWidth());
        System.out.println("height="+wall.getHeight());
        System.out.println("area="+wall.getArea());

    }
}
