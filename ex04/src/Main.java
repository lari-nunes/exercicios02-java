import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int reg = sc.nextInt();

        for(int x=0; x<reg; x++){
            System.out.println();
            System.out.println("Emplyoee #" + (x +1)+ ":");
            System.out.print("Id: " );
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary );

            list.add(emp);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);

        if(pos == null){
            System.out.print("Not id found!");
        } else{
            System.out.println("Enter the porcentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employess:");
        for(Employee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }
    public static Integer position(List<Employee> list, int id){
        for(int x=0; x<list.size(); x++){
            if(list.get(x).getId() == id){
                return x;
            }
        }
        return null;
    }
}