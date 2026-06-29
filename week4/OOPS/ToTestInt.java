package week4.OOPS;
interface test{
    int  square(int n);
}

class arithmatic implements test{
  public int square(int n){
       return n*n;
    }
}
  public class ToTestInt{
        public static void main(String[]args){
            arithmatic obj = new arithmatic();
            int result = obj.square(5);
            System.out.println("square"+result);
        } 
  }

