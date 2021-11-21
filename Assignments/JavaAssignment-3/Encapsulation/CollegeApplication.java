
import java.util.ArrayList;
import java.util.List;

public class CollegeApplication {

    public static void main(String[] args) {

        College college1 = new College();
        college1.setColgName("Amity");
        List<String> college1Dept = new ArrayList<>();
        college1Dept.add("CS");
        college1Dept.add("IT");
        college1Dept.add("Mech");
        college1Dept.add("ECE");
        college1.setColgDept(college1Dept);
        college1.displayColgDetails(college1);

        College college2 = new College();
        college2.setColgName("NSIT");
        List<String> college2Dept = new ArrayList<>();
        college2Dept.add("CS");
        college2Dept.add("Chem");
        college2Dept.add("ICE");
        college2Dept.add("ECE");
        college2Dept.add("Civil");
        college2.setColgDept(college2Dept);
        college2.displayColgDetails(college2);

        College college3 = new College();
        college2.setColgName("NSIT");
        List<String> college3Dept = new ArrayList<>();
        college3Dept.add("CS");
        college3Dept.add("Chem");
        college3Dept.add("ICE");
        college3Dept.add("ECE");
        college3Dept.add("Civil");
        college3.setColgDept(college3Dept);
        college3.displayColgDetails(college3);

        College college4 = new College();
        college4.setColgName("IPU");
        List<String> college4Dept = new ArrayList<>();
        college4Dept.add("CS");
        college4Dept.add("Chem");
        college4Dept.add("ICE");
        college4Dept.add("Civil");
        college4.setColgDept(college4Dept);
        college4.displayColgDetails(college4);

        College college5 = new College();
        college5.setColgName("NIIT");
        List<String> college5Dept = new ArrayList<>();
        college5Dept.add("IT");
        college5Dept.add("Chem");
        college5Dept.add("BioTech");
        college5Dept.add("ECE");
        college5Dept.add("Civil");
        college5.setColgDept(college5Dept);
        college5.displayColgDetails(college5);


    }


}


