public class Customer {

     String name;
     String email;

     double creditLimit;

    public Customer(String name, String email, double creditLimit) {
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }



    public Customer(Customer x,String email, double creditLimit) {
            this(x.name,email,creditLimit);
    }

    public Customer(String name, String email) {
        this(name,email,30000);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
