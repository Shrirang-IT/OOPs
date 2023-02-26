import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner sc =new Scanner(System.in);
        System.out. println("Enter values ");
        System.out.print("Name");
        student.setName(sc.next());
        System.out.print(student.getName());
    }
}