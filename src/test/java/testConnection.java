import java.util.Scanner;

public class testConnection {

}
class Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("возраст?");
        int age = scanner.nextInt();
        System.out.println("What year is it today?");
        int year = scanner.nextInt();
        int years = year - age;
        System.out.println("Your age: " + years);
    }
}