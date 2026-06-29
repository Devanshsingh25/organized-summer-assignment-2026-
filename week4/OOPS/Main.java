package week4.OOPS;

class outer{
    void display(){
        System.out.println("display method of outer class");

    };
    class inner{
        void display(){
          System.out.println("display method of inner class");
        };
    }
}

public class Main{
    public static void main(String[]args){
        outer obj1 = new outer();
        obj1.display();

        outer.inner obj2 = obj1.new inner();
        obj2.display();
        

    }
}


