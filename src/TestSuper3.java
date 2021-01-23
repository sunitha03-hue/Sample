class Animal6{
    Animal6(){System.out.println("animal is created");}
}
class Dog6 extends Animal6{
    Dog6(){
        super();
        System.out.println("dog is created");
    }
}
class TestSuper3{
    public static void main(String args[]){
        Dog6 d=new Dog6();
    }}
