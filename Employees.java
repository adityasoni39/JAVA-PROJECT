class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class Employees {
    public static void main(String[] args) {

        Employee[] employees = {
            new Employee("kk", 4000),
            new Employee("aditya", 5000),
            new Employee("tanu", 6000),
            new Employee("drishti", 7000),
            new Employee("ritika", 20000)
        };

        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {

                if (employees[j].salary > employees[j + 1].salary) {

                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < employees.length; i++) {
            System.out.println(
                employees[i].name + " " + employees[i].salary
            );
        }
    }
}