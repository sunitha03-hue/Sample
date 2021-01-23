class Bike{
    final void run1(){System.out.println("running");}
}

class Honda3 extends Bike{
 //   void run1(){System.out.println("running safely with 100kmph");}

    public static void main(String args[]){
        Honda3 honda= new Honda3();
        honda.run1();
    }
}  