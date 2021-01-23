package Greeting;
public class Greetings extends Message
{
    public Greetings(String aLanguage, String aText) {
        super(aLanguage, aText);

    }
        void display()
    {
        System.out.println(super.getLanguage() + "  "+ super.getText() + super.getFriendly());
    }
}