package studio7;

public class Rectangle {
    private double length; // a rectangle "has-a" length and a width
    private double width;

    // now that we have our instance variables, we must make a constructor to initialize them 
    // for every instance that the class is used.
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double area(){
        return this.length*this.width;
    }

    public double perimeter(){
        return (2*this.length) + (2*this.width);
    }

    public boolean square(){
        if(this.length==this.width){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        Rectangle A = new Rectangle(5,6);
        Rectangle B = new Rectangle(8,8);
        System.out.println(A.area());
        System.out.println(B.area());
        System.out.println(A.perimeter());
        System.out.println(B.perimeter());
        System.out.println(A.square());
        System.out.println(B.square());
    }

}
