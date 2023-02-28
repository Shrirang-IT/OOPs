public class Student {

    private String name ;
    private String city ;

    private String Branch;


    public Student(){               //parameterized constructor called in empty constructor
        this("Shrirang","Pune","IT");
    }

    public Student(String name,String city,String Branch ){
        this.name=name;
        this.city=city;
        this.Branch=Branch;
    }
    // getters
    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getBranch() {
        return Branch;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setBranch(String branch) {
        Branch = branch;
    }




}
