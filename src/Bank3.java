interface Bank3{
    float rateOfInterest();
}
class SBI2 implements Bank3{
    public float rateOfInterest(){return 9.15f;}
}
class PNB1 implements Bank3{
    public float rateOfInterest(){return 9.7f;}
}
class TestInterface2{
    public static void main(String[] args){
        Bank3 b=new SBI2();
        System.out.println("ROI: "+b.rateOfInterest());
    }}
