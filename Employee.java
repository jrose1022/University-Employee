
public class Employee {

    private String Name;
    private int EmployeeID;
    private String department;

    // private data type encapsulated


    public void setDepartment(String newDepartment) { //setter
        this.department = newDepartment;
    }//setter

    public String getDepartment() { //getter
        return department;
    }


    public void setName( String newName){ //setter
        this.Name = newName;
    }

    public String getName(){ //getter
        return Name;
    }

    public void  setEmployeeID (int newEmployeeID){ //setter
        this.EmployeeID = newEmployeeID;
    }

    public int getEmployeeID(){ //getter
        return EmployeeID;
    }




}
