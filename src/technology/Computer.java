package technology;

public abstract class Computer{
    public abstract void wave();
    String Language;
    String text;

    public Computer(String aLanguage, String aText) {
        Language = aLanguage;
        text = aText;
    }
    public String getLanguage() {
        return Language;
    }

    public String getText() {
        return text;
    }

    public void display()
    {
        System.out.println(Language + " "+text);
    }
}
