package week4.OOPS;
class box{
    protected double length;
    protected double breadth;

    public box(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return length*breadth;
    }
}

class box3d extends box{
    private double height;

    public box3d(double length,double breadth,double height){
        super(length,breadth);
        this.height = height;
    }

    public double volume(){
        return length*breadth*height;
    }

}

public class main3{
    public static void main(String[]args){  
        box b = new box(10,5);
        System.out.println("area"+ b.area());

        box3d b3 = new box3d(10, 5, 4);
        System.out.println("Area = " + b3.area());
        System.out.println("Volume = " + b3.volume());
    }
}