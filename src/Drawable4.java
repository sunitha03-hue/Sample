interface Drawable4{
    void draw();
    static int cube(int x){return x*x*x;}
}
class Rectangle implements Drawable4{
    public void draw(){System.out.println("drawing rectangle");}
}

class TestInterfaceStatic{
    public static void main(String args[]){
        Drawable4 d=new Rectangle();
        d.draw();
        System.out.println(Drawable4.cube(3));
    }}
