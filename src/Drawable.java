interface Drawable1{
    void draw();
}
//Implementation: by second user
class Rectangle2 implements Drawable1{
    public void draw(){System.out.println("drawing rectangle");}
}
class Circle implements Drawable1{
    public void draw(){System.out.println("drawing circle");}
}
//Using interface: by third user
class TestInterface1{
    public static void main(String args[]){
        Drawable1 d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()
        d.draw();
    }}
