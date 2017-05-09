/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class Circle {
    private int x;
    private int y;
    private int r;
    public static final double pi =Math.PI;
    public static int numberOfCreatedCircles=0;
    
    Circle(){
        this.x=0;
        this.y=0;
        this.r=5;
        numberOfCreatedCircles++;
    }
    
    Circle(int x,int y, int r){
        this.x=x;
        this.y=y;
        this.r=r;
        numberOfCreatedCircles++;
    }
    
    Circle(int x ,int y) {
        this();
        this.x=x;
        this.y=y;
        
    }
    
    public Circle(Circle def){
        this(def.x,def.y,def.r);
        
    }
    
    public void setCoords(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setRadius(int r){
        this.r=r;
    }
    public int getX(){               
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    public int getRadius(){
        return this.r;
    }
    
    public void printCircleDetails(){
        System.out.printf(" I'm a circle at point (%d,%d) with radius %d \n",this.x,this.y,this.r);
    }
    
    public double calculateArea(double pi){
        double area = pi*this.r*this.r;
        return area;
    }
    public double calculatePerimeter(double pi){
        double perimeter = 2*pi*this.r;
        return perimeter;
    }
}
