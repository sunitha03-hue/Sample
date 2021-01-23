class Students1{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    Students1(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object  
public class TestStaticMethod{
    public static void main(String args[]){
        Students1.change();//calling change method
        //creating objects
        Students1 s1 = new Students1(111,"Karan");
        Students1 s2 = new Students1(222,"Aryan");
        Students1 s3 = new Students1(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}  