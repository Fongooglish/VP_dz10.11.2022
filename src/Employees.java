import java.util.HashMap;
import java.util.Objects;

public class Employees {
    private HashMap<String, Integer> employeesList;

    public Employees() {
        this.employeesList = employeesList;
    }

    public HashMap<String, Integer> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(HashMap<String, Integer> employeesList) {
        this.employeesList = employeesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return Objects.equals(employeesList, employees.employeesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeesList);
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeesList=" + employeesList +
                '}';
    }
}
