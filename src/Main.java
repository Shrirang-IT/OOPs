

public class Main {
    public static void main(String[] args) {
        /*
        Customer customer = new Customer("Shrirang","shrirangbhalerao12@gmail.com");
        System.out.println("Name : "+customer.getName() + "  email : "+customer.getEmail()+" credit limit :  "+customer.getCreditLimit());
        Customer customer1 = new Customer(customer,"sbb.it@gmail.com",20000);
        // copy constructor
        System.out.println("Name : "+customer1.getName() + "  email : "+customer1.getEmail()+" credit limit :  "+customer1.getCreditLimit());
*/

        Student student=new Student("Shrirang",1);
        display(student);

        Education education= new Education("Shrirang",1,"IT",89);
        display(education);


    }

    public  static void display(Student student)
    {
        System.out.println("In display function");
        System.out.println(student);
    }

}