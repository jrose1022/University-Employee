import java.util.LinkedList;

public class TechnicalSupport extends Employee {
    /* extends for inheritance, gusto kasi natin i-inherit yung mga datatype sa employee file*/

    private LinkedList<Employee> SystemAdministratorList;
    private LinkedList<Employee> NetworkEngineerList;
    private LinkedList<Employee> LaboratoryManagerList;
    private LinkedList<Employee> ResearchTechnicianList;
    /* Lahat ng linked list ay paglalagayan ng info na iseset*/


    public TechnicalSupport() { //constructor to ng mga list
        SystemAdministratorList = new LinkedList<>();
        NetworkEngineerList = new LinkedList<>();
        LaboratoryManagerList = new LinkedList<>();
        ResearchTechnicianList = new LinkedList<>();
        addSystemAdministrator("AJ Escober", 123525 );
        addSystemAdministrator("Charles Andrei Ambata", 253647 );
        addNetworkEngineer("Sean Casapao", 576541);
        addNetworkEngineer("JM Saria",876944);
        addLaboratoryManagers("Kris Millares",755941 );
        addLaboratoryManagers("Jerean Camerino",874864 );
        addResearchTechnician("Ryo Ito",784564 );
        addResearchTechnician("EJ Nool",741586 );
    }


    public void addSystemAdministrator(String name, int employeeID) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee SystemAdministrator= new Employee();
        SystemAdministrator.setName(name);
        SystemAdministrator.setEmployeeID(employeeID);
        SystemAdministratorList.add(SystemAdministrator); //dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addNetworkEngineer(String name, int employeeID) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee NetworkEngineer = new Employee();
        NetworkEngineer.setName(name);
        NetworkEngineer.setEmployeeID(employeeID);
        NetworkEngineerList.add(NetworkEngineer); //dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addLaboratoryManagers(String name, int employeeID) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee LaboratoryManagers = new Employee();
        LaboratoryManagers.setName(name);
        LaboratoryManagers.setEmployeeID(employeeID);
        LaboratoryManagerList.add(LaboratoryManagers);//dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }

    public void addResearchTechnician(String name, int employeeID) {
        /*Ininherit neto yung employee class wherein pwede ka mag set ng name, employee Id.*/
        Employee addResearchTechnician = new Employee();
        addResearchTechnician.setName(name);
        addResearchTechnician.setEmployeeID(employeeID);
        ResearchTechnicianList.add(addResearchTechnician);//dito niya i-add yung lahat at i-store kasi inadd mo na sa list mo
    }


    public void printTechnicalSupportLaboratoryManagers() { //method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\n Laboratory Managers:");

        /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
        for (Employee  LaboratoryManagers : LaboratoryManagerList) {
            System.out.println("");
            System.out.println("Name: " +  LaboratoryManagers.getName() + " \nEmployee ID: " +  LaboratoryManagers.getEmployeeID()
                    + "\n" );
        }

    }

    public void printTechnicalSupportResearchTechnician() { //method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nResearch Technician:");

        /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
        for (Employee ResearchTechnician : ResearchTechnicianList) {
            System.out.println("");
            System.out.println("Name: "+ResearchTechnician.getName() + " \nEmployee ID: " + ResearchTechnician.getEmployeeID()
                    + "\n") ;
        }

    }

    public void printTechnicalSupportNetworkEngineer() { //method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nNetwork Engineer:");

        /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
        for (Employee NetworkEngineer : NetworkEngineerList) {
            System.out.println("");
            System.out.println("Name: "+NetworkEngineer.getName() + " \nEmployee ID: " + NetworkEngineer.getEmployeeID()
                    + "\n");
        }

    }

    public void printTechnicalSupportSystemAdministrator() { //method pang print

        //iterate niya yung bawat laman ng list tapos i-assign niya yung employee object doon sa variable na sinet.
        System.out.println("\nSystem Administrator:");

        /*Diba nagencapsulate tayo sa taas kungsaan nag set tayo ng kung ano ano? dito na niya tatawagin yon.*/
        for (Employee SystemAdministrator : SystemAdministratorList) {
            System.out.println("");
            System.out.println("Name: " + SystemAdministrator.getName() + " \nEmployee ID: " + SystemAdministrator.getEmployeeID()
                    + "\n" );
        }

    }
}