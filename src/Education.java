public class Education extends Student {

    private String branch;
    private  int percentage;


    public Education(String name, int roll_no, String branch, int percentage) {
        super(name, roll_no);
        this.branch = branch;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Education{" +
                "branch='" + branch + '\'' +
                ", percentage=" + percentage + super.toString()+
                '}';
    }
}
