package week4.OOPS;
class point{
    private int x;
    private int y;

    public point(){
        x = 0;
        y = 0;
    }

    public point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void setX(int x){
      this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setXY(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void display(){
        System.out.println("Point = (" + x + ", " + y + ")");
    }


}

public class main2{
    public static void main(String[]args){
        point p1 = new point();
        p1.display();

        point p2 = new point(10,20);
        p2.display();

        p2.setXY(30,40);
        p2.display();

    }
}