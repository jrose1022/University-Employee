import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        boolean looping = true;
        int choice;

        FacultyMember facultyMember = new FacultyMember(); //TO ACCESS FACULTY MEMBER CLASS FILE
        TechnicalSupport TC = new TechnicalSupport(); // TO ACCESS TECHNICAL Class file
        HealthServiceStaff HSS = new HealthServiceStaff(); //to access Health Service Staff

        while (looping) {

            try {

                System.out.println("\nUnivesity Employees");
                System.out.println("[1] Faculty Member \n[2] Technical Support \n[3] Health Service Staff\n" +
                        "[4] Exit");

                choice = input.nextInt();

                switch (choice) { //Faculty, Technical, Health Staff

                    case 1: //Faculty Members
                        System.out.println("\nFaculty Members: \n");
                        System.out.println("[1]Professor \n[2]Instructor\n");

                        choice = input.nextInt();

                        switch (choice) { //switch ng kabuoan ng choices ng prof at instructor

                            case 1://Full and Part Time Prof

                                System.out.println("\nProfessor: \n\n[1] Full Time\n[2] Part Time ");
                                choice = input.nextInt();

                                switch (choice) {
                                    case 1:
                                        facultyMember.printFacultyFullTime(); //tinawag yung pang printmethod na full time sa faculty member class.
                                        break;
                                    case 2:
                                        facultyMember.printFacultyPartTime(); //tinawag yung pang printmethod na part time sa faculty member class.
                                        break;
                                }

                            break;

                            case 2: //Instructor

                                System.out.println("\nInstructor: \n\n[1] Admin\n[2] Clerk ");
                                choice = input.nextInt();
                                switch (choice) {
                                    case 1:
                                        facultyMember.printFacultyAdmin(); //tinawag yung pang printmethod na admin sa faculty member class.
                                        break;
                                    case 2:
                                        facultyMember.printFacultyClerk(); //tinawag yung pang printmethod na clerk sa faculty member class.
                                        break;
                                }
                            break;
                        }
                    break;

                    case 2: //Technical Support
                        System.out.println("\nTechnical Support: \n");
                        System.out.println("[1] IT Professionals \n[2] Lab Technician\n");

                        choice = input.nextInt();

                        switch (choice) {

                            case 1://System Administrator and Network Engineer
                                System.out.println("\nIT Professionals: \n");
                                System.out.println("\n[1] System Administrator\n[2] Network Engineer ");
                                choice = input.nextInt();

                                switch (choice) {
                                    case 1:
                                        TC.printTechnicalSupportSystemAdministrator(); //tinawag yung pang printmethod na System Admin sa Tech supp class.
                                        break;
                                    case 2:
                                        TC.printTechnicalSupportNetworkEngineer(); //tinawag yung pang printmethod na Network Eng sa Tech supp class.
                                        break;
                                }
                            break;

                            case 2://Laboratory Managers & Research Technician
                                System.out.println("\nLab Technician: \n");
                                System.out.println("[1] Laboratory Managers\n[2] Research Technician\n");

                                choice = input.nextInt();

                                switch (choice) {

                                    case 1:
                                        TC.printTechnicalSupportLaboratoryManagers(); //tinawag yung pang printmethod na Lab Managers sa Tech supp class.
                                        break;

                                    case 2:
                                        TC.printTechnicalSupportResearchTechnician();//tinawag yung pang printmethod na Research Tech sa Tech supp class.
                                        break;
                                }
                            break;
                        }
                   break;

                    case 3: // Health Service Staff
                        System.out.println("\nHealth Service Staff: \n");
                        System.out.println("[1] Medical Personnel \n[2] Mental Health Professionals\n");

                        choice = input.nextInt();

                        switch (choice) {

                            case 1://  Doctors and Nurses
                                System.out.println("\nMedical Personnel: \n");
                                System.out.println("\n[1] Doctors \n[2] Nurses ");
                                choice = input.nextInt();

                                switch (choice) {
                                    case 1:
                                        HSS.printHealthServiceStaffDoctor(); //tinawag yung pang printmethod na Doctor sa HSS class.
                                        break;
                                    case 2:
                                        HSS.printHealthServiceStaffNurse(); //tinawag yung pang printmethod na Nurse sa HSS class.
                                        break;
                                }
                            break;

                            case 2://Psych and Therapist
                                System.out.println("\nMental Health Professionals: \n");
                                System.out.println("[1] Psyciatrists\n[2] Therapist\n");

                                choice = input.nextInt();

                                switch (choice) {

                                    case 1:
                                        HSS.printHealthServiceStaffPsychiatrist(); //tinawag yung pang printmethod ng Psych sa HSS class.
                                        break;

                                    case 2:
                                        HSS.printHealthServiceStaffTherapist(); //tinawag yung pang printmethod na Therapist sa HSS class.
                                        break;
                                }
                            break;
                        }
                    break;

                    case 4:
                        System.out.println("Thank you for using this application!");
                        return;


                    default:
                        System.out.println("Please input the correct selection!"); //pang salo pag wala sa choices yung ininput nila
                }

            } catch (Exception e){
                System.out.println("Out of Bounds! Input the correct response!"); //pang salo pag out of this world ininput
                input.next();
            }

        }

    }
}