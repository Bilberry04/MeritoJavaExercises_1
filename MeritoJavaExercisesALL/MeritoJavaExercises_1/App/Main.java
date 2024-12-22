package App;
import java.util.*;

public class Main {
    public static void main(String[] args){

        Person AndrzejPolny = new Person("Andrzej", "Polny");
        Person MikolajMaly = new Person("Mikolaj", "Maly");
        Person KacperSubduk = new Person("Kacper", "Subduk");

        Employee firstemployee = new Employee(AndrzejPolny, Departament.SALES);
        Employee secondemployee = new Employee(MikolajMaly, Departament.ADMINISTRATION);
        Employee thirdemployee = new Employee(KacperSubduk, Departament.FINANCE);

        List<Employee> employees = new ArrayList<>();

        employees.add(firstemployee);
        employees.add(secondemployee);
        employees.add(thirdemployee);

        Company company = new Company("Moja firma");

        System.out.println(company.getName());

        System.out.println("Panel administracyjny firmy " + company.getName());

        boolean done = false;

        while (!done) {
                Scanner userInput = new Scanner(System.in);
                System.out.println("[1] Sprawdzenie pracowników");
                System.out.println("[2] Utworzenie pracownika");
                System.out.println("[3] Usunięcie pracownika");
                System.out.println("[0] Wyjście");
                System.out.println("--------------------------------");
                String choice = userInput.nextLine();

                switch(choice){
                    case 0:
                        done = true;
                        break;

                    case 1:
                        System.out.println("Pracownicy: "+ company.getEmployees());
                        break;

                    case 2:
                        System.out.println("Wybierz departament: ");
                        String choide_departament = userInput.nextLine();

                    default:
                        System.out.println("Wprowadzono błędną wartość");
                }


                userInput.close();
                    done = true;

        }
        }
}





