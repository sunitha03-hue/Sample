class Animals4{
    void eat(){System.out.println("eating...");}
}
class Dogs extends Animals4{
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work(){
        super.eat();
        bark();
    }
}
class TestSuper2{
    public static void main(String args[]){
        Dogs d=new Dogs();
        d.work();
    }}