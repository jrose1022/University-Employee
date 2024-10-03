import java.util.LinkedList;

public class FacultyMember extends Employee {
/* extends for inheritance, gusto kasi natin i-inherit yung mga datatype sa employee file*/

    private LinkedList<Employee> adminList;
    private LinkedList<Employee> ClerkList;
    private LinkedList<Employee> Professor_FULLTIME_List;
    private LinkedList<Employee> Professor_PARTTIME_List;
    /* Lahat ng linked list ay paglalagayan ng info na iseset*/

    public FacultyMember() { //constructor to ng mga list
        adminList = new LinkedList<>();
        ClerkList = new LinkedList<>();
        Professor_FULLTIME_List = new LinkedList<>();
        Professor_PARTTIME_List = new LinkedList<>();


        addAdmin("Adrian Lleva", 45678, "Psycology");
        addAdmin("Justin Reyes", 24156, "Engineering");
        addClerk("Marc Wilson Metillo",34567,"Engineering");
        addClerk("Danielle Yvan Senador",76251,"Psycology");
        addProfessorFULLTIME("John Ranielle Lorenzo", 23456, "Marketing");
        addProfessorFULLTIME("Julierose Obias", 12345,"Medical Laboratory Science");
        addProfessorPARTTIME("Alexis Miguel", 567891,"Engineering");
        addProfessorPARTTIME("Calvin Manaor", 134567,"Marketing");
    }




    public void addAdmin(String name, int employeeID, String Department) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee admin = new Employee();
        admin.setName(name);
        admin.setEmployeeID(employeeID);
        admin.setDepartment(Department);
        adminList.add(admin); //dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addClerk(String name, int employeeID, String Department) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee clerk = new Employee();
        clerk.setName(name);
        clerk.setEmployeeID(employeeID);
        clerk.setDepartment(Department);
        ClerkList.add(clerk); //dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addProfessorFULLTIME(String name, int employeeID, String Department) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee professorFULLTIME = new Employee();
        professorFULLTIME.setName(name);
        professorFULLTIME.setEmployeeID(employeeID);
        professorFULLTIME.setDepartment(Department);
        Professor_FULLTIME_List.add(professorFULLTIME); //dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addProfessorPARTTIME(String name, int employeeID, String Department) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee professorPARTTIME = new Employee();
        professorPARTTIME.setName(name);
        professorPARTTIME.setEmployeeID(employeeID);
        professorPARTTIME.setDepartment(Department);
        Professor_PARTTIME_List.add(professorPARTTIME); //dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }


    public void printFacultyFullTime() { //method pang print

        System.out.println("\nFull-Time Professor List:");
        for (Employee professorFULLTIME : Professor_FULLTIME_List) {
            //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
            System.out.println("");

            /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
            System.out.println(("Name: " + professorFULLTIME.getName() + " \nEmployee ID: " + professorFULLTIME.getEmployeeID()
                    + "\n" + "Department: "+ professorFULLTIME.getDepartment()) );
        }

    }

    public void printFacultyPartTime() {//method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nPart-Time Professor List:");
        for (Employee professorPARTTIME : Professor_PARTTIME_List) {
            System.out.println("");

            /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
            System.out.println(("Name: "+professorPARTTIME.getName() + " \nEmployee ID: " + professorPARTTIME.getEmployeeID()
                    + "\n" + "Department: "+ professorPARTTIME.getDepartment()) );
        }

    }

    public void printFacultyClerk() { //method pang print
        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nClerk:");
        for (Employee clerk : ClerkList) {
            System.out.println("");

            /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
            System.out.println(("Name: "+clerk.getName() + " \nEmployee ID: " + clerk.getEmployeeID()
                    + "\n" + "Department: "+ clerk.getDepartment()) );
        }

    }

    public void printFacultyAdmin() { //method pang print
        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nAdmin:");
        for (Employee admin : adminList) {
            System.out.println("");

            /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
            System.out.println(("Name: " + admin.getName() + " \nEmployee ID: " + admin.getEmployeeID()
                    + "\n" + "Department: "+ admin.getDepartment()) );
        }

    }
}