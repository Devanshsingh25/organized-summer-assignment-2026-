interface libraryuser{
    void registeraccount();
    void requestbook();
}

class kidusers implements libraryuser{
    int age;
    String booktype;

  public  void registeraccount(){
        if(age<12){
            System.out.println("you have successfully registered under a kidusers account");
        }
        else{
            System.out.println("your age must be less than 12 to register as kid");
        }
    }

   public void requestbook(){
        if(booktype.equals("kids")){
            System.out.println("your book issued successfully please return the book under 10 days");
        }
        else{
            System.out.println("oops, you are only allowed to take kids book");
        }
    }
}


class Adultuser implements libraryuser{
    int age;
    String booktype;

   public void registeraccount(){
        if(age>12){
            System.out.println("you have successfully registered under an adultuser account");
        }
        else{
            System.out.println("your age must be greater than 12 to register as an adult");
        }
    }

   public void requestbook(){
        if(booktype.equals("fiction")){
            System.out.println("your book issued successfully please return the book under 7 days");
        }
        else{
            System.out.println("oops, you are only allowed to take fiction book");
        }
    }
}


public class Libraryinterfacedemo{
    public static void main(String[]args){
    kidusers k = new kidusers();
    k.age = 10;
    k.registeraccount();
    k.age = 18;
    k.registeraccount();
    k.booktype = "kids";
      k.requestbook();
    k.booktype = "fiction";
  
    k.requestbook();

    Adultuser a = new Adultuser();
    a.age = 5;
      a.registeraccount();
    a.age = 23;
      a.registeraccount();

    a.booktype = "kids";
       a.requestbook();
    a.booktype = "fiction";
    
    a.requestbook();

}
}