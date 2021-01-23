class Students2{
    int rollno;
    String name;
    float fee;
    Students2(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis2{
    public static void main(String args[]){
        Students2 s1=new Students2(111,"ankit",5000f);
        Students2 s2=new Students2(112,"sumit",6000f);
        s1.display();
        s2.display();
    }}
