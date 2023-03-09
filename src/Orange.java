public class Orange extends Apple  {

    private String seed ;

    public Orange(String color, String taste, String season, String seed) {
        super(color, taste, season);
        this.seed = seed;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "seed='" + seed + '\'' + super.toString()+
                '}';
    }

    void display(){
        super.display();
        System.out.println("seed =  "+seed);
    }
}
