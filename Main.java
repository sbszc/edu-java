import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person{
    long id;
    Person(long id){
        this.id = id;
    }

    long getId(){
        return this.id;
    }
    void setId(long id){
        this.id = id;
    }
}

class Employee extends Person{
    int salary;
    Employee(long id, int salary){
        super(id);
        this.salary = salary;
    }

    int getSalary(){
        return this.salary;
    }
    void setSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{\"id\":" + id + ", \"salary\":" + salary + "}";
    }
}

public class Main {
    Integer a = 464565464;
    public static void main(String[] args) {
        Supplier sp = () -> System.out.println(this);

        Employee empl = new Employee(1, 1000);
        System.out.println(empl.toString());
    }
}