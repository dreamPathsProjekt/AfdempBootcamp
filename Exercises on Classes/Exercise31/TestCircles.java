/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dreamPathsProjekt
 */
public class TestCircles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle testCircle = new Circle();
        
        testCircle.setCoords(1,1);
        testCircle.setRadius(10);
        testCircle.printCircleDetails();
        
        Circle testCircleol = new Circle(2,2,5);
        Circle testCircleol2 = new Circle(3,3);
        
        testCircleol.printCircleDetails();
        testCircleol2.printCircleDetails();
        
        double area1=testCircle.calculateArea(Math.PI);
        System.out.println(area1);
        double perimeter1=testCircle.calculatePerimeter(Math.PI);
        System.out.println(perimeter1);
        
        double area1c=testCircle.calculateArea(Circle.pi);
        System.out.println(area1c);
        double perimeter1c=testCircle.calculatePerimeter(Circle.pi);
        System.out.println(perimeter1c);
        
        Circle def = new Circle(5,5);
        Circle copyofdef = new Circle(def);
        
        def.printCircleDetails();
        copyofdef.printCircleDetails();
        
        def.setCoords(1, 1);
        def.printCircleDetails();
        copyofdef.printCircleDetails();
        System.out.println(cocentric(testCircle,def));
        System.out.println(Circle.numberOfCreatedCircles);//do not place count++ on copy constructors.
        
        
    }
    
    public static boolean cocentric(Circle c1,Circle c2){
        return (c1.getX()==c2.getX()&&c1.getY()==c2.getY()); 
    }
}
