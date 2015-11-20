public class Rectangle {
    
    //variables of height 
    double width;
    double height;
    
    public static void main(String[] args) {
        
        //calling upon the methods to calculate height
        Rectangle r1 = new Rectangle();
        r1.setHeight(5.3);
        r1.setWidth(7.3);
        System.out.println(r1.getArea());
        
    }
    
    //method that sets height
    public void setHeight(double x) {height = x;}
    
    //method that sets width
    public void setWidth(double x) {width = x;}
    
    //method that returns area
    public double getArea() {
        double area = height*width;
        return area;
    }
    
}