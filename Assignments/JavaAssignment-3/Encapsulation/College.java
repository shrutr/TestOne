import java.util.ArrayList;
import java.util.List;

public class College {
    private String colgName;
    private List<String> colgDept;

    public void setColgName(String colgName) {
        this.colgName = colgName;
    }

    public String getColgName() {
        return colgName;
    }

    public void setColgDept(List<String> colgDept) {
        this.colgDept = colgDept;
    }

    public List<String> getColgDept() {

        return colgDept;
    }

    public void displayColgDetails(College college) {

        System.out.println("Name of College: " + college.getColgName() + "\nCollege Departments: ");
        for (String index : college.getColgDept()) {
            System.out.println(index);
        }
    }
}
