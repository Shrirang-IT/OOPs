public class Fruit {

    private String color;
    private String taste;

    public Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    void display()
    {
        System.out.println("color = "+color+" , taste = "+taste);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                '}';
    }
}
