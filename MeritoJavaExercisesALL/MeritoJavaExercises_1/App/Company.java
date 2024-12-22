package App;
import java.util.List;
public class Company {
    private String name;
    private List<Employee> employees;

    public Company(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public List<Employee> getEmployees(){
        return employees;
    }
}
