interface Drawable3{
    void draw();
    default void msg(){System.out.println("default method");}
}
class Rectangle11 implements Drawable3{
    public void draw(){System.out.println("drawing rectangle");}
}
class TestInterfaceDefault{
    public static void main(String args[]){
        Drawable3 d=new Rectangle11();
        d.draw();
        d.msg();
    }}