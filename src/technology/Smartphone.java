package technology;

public class Smartphone extends Computer
{
    public Smartphone(String aLanguage, String aText) {
        super(aLanguage, aText);
    }

    public void wave()
    {
        System.out.println("Second Waving");
    }

}