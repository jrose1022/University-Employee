import java.util.LinkedList;

public class HealthServiceStaff extends Employee {
    /* extends for inheritance, gusto kasi natin i-inherit yung mga datatype sa employee file*/

    private LinkedList<Employee> DoctorList;
    private LinkedList<Employee> NurseList;
    private LinkedList<Employee> PsychiatristList;
    private LinkedList<Employee> TherapistList;
    /* Lahat ng linked list ay paglalagayan ng info na iseset*/


    public HealthServiceStaff() { //constructor to ng mga list
        DoctorList = new LinkedList<>();
        NurseList = new LinkedList<>();
        PsychiatristList = new LinkedList<>();
        TherapistList = new LinkedList<>();
        addDoctor("Dr. Jerome Nazario M.D", 179131 );
        addDoctor("Dr. Joyce Jade Corpuz M.D.", 25262 );
        addNurse("Kate Villanueva R.N.", 132581);
        addNurse("Juneiah Paredes R.N.",80128);
        addPsychiatrist("Dr. Mark Deyto M.D.",874221 );
        addPsychiatrist("Dr. Joshua Demesa M.D.",986246 );
        addTherapist("Jervy Polistico LCSW",767935 );
        addTherapist("Dexter Lomogbad LCSW",982613);
    }


    public void addDoctor(String name, int employeeID) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee Doctor= new Employee();
        Doctor.setName(name);
        Doctor.setEmployeeID(employeeID);
        DoctorList.add(Doctor); //dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addNurse(String name, int employeeID) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee Nurse = new Employee();
        Nurse.setName(name);
        Nurse.setEmployeeID(employeeID);
        NurseList.add(Nurse);//dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addPsychiatrist(String name, int employeeID) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee Psychiatrist = new Employee();
        Psychiatrist.setName(name);
        Psychiatrist.setEmployeeID(employeeID);
        PsychiatristList.add(Psychiatrist);//dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addTherapist(String name, int employeeID) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee addTherapist = new Employee();
        addTherapist.setName(name);
        addTherapist.setEmployeeID(employeeID);
        TherapistList.add(addTherapist);//dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }


    public void printHealthServiceStaffPsychiatrist() { //method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\n Psychiatrist:");

        /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
        for (Employee  Psychiatrist : PsychiatristList) {
            System.out.println("");
            System.out.println("Name: " +  Psychiatrist.getName() + " \nEmployee ID: " +  Psychiatrist.getEmployeeID()
                    + "\n" );
        }

    }

    public void printHealthServiceStaffTherapist() { //method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nTherapist:");

        /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
        for (Employee Therapist : TherapistList) {
            System.out.println("");
            System.out.println("Name: "+Therapist.getName() + " \nEmployee ID: " + Therapist.getEmployeeID()
                    + "\n") ;
        }

    }

    public void printHealthServiceStaffNurse() { //method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nNurse:");

        /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
        for (Employee Nurse : NurseList) {
            System.out.println("");
            System.out.println("Name: "+Nurse.getName() + " \nEmployee ID: " + Nurse.getEmployeeID()
                    + "\n");
        }

    }

    public void printHealthServiceStaffDoctor() { //method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nDoctors:");

        /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
        for (Employee Doctor : DoctorList) {
            System.out.println("");
            System.out.println("Name: " + Doctor.getName() + " \nEmployee ID: " + Doctor.getEmployeeID()
                    + "\n" );
        }

    }
}