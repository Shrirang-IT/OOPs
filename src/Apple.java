public class Apple extends Fruit{

    private String season;

    public Apple(String color, String taste, String season) {
        super(color, taste);
        this.season=season;
    }


    @Override
    public String toString() {
        return "Apple{" +
                "season='" + season + '\'' +super.toString()+
                '}';
    }

    void display(){
        super.display();
        System.out.println("season =  "+season);
    }
}
