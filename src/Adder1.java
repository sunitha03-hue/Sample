import java.util.*;

class Adder1{
    static void add(int a, int b) {
        int c;
        c=(a+b);
        System.out.println(c);
    }

    }
class TestOverloading2{
    public static void main(String[] args){
        Adder1.add(11,11);
        //System.out.println(Adder.add(11,11,11));
    }}  