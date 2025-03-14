import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Register stdDB = new Register();
        try (Scanner rgb = new Scanner(System.in)) {
            int reg = 0;
            do {
                String id, name, address;
                int amount, sumamount;
                float gpa;

                System.out.print("*****MAIN MANU******\n");
                System.out.println("1 : Insert data");
                System.out.println("2 : Delete data ");
                System.out.println("3 : Update data ");
                System.out.println("4 : Show data");
                System.out.println("0 : Exit");
                reg = rgb.nextInt();

                switch (reg) {
                    case 1:
                        int i = 0;
                        do {

                            System.out.print("*****MAIN MANU******\n");
                            System.out.println("1 : Insert Faculty Table");
                            System.out.println("2 : Insert Branch Table");
                            System.out.println("3 : Insert Subject Table");
                            System.out.println("4 : Insert Academic Table");
                            System.out.println("5 : Insert Student Table");
                            i = rgb.nextInt();
                            switch (i) {
                                case 1:
                                    System.out.println("**********Insert Faculty Table*********");
                                    System.out.print("Enter ID (Limit 8): ");
                                    id = rgb.next();
                                    System.out.print("Enter Name : ");
                                    name = rgb.next();
                                    stdDB.insertfaculty(id, name);
                                    break;
                                case 2:
                                    System.out.println("**********Insert Branch Table*********");
                                    System.out.print("Enter Branch ID (Limit 8): ");
                                    id = rgb.next();
                                    System.out.print("Enter Name : ");
                                    name = rgb.next();
                                    stdDB.insertbranch(id, name);
                                    break;
                                case 3:
                                    System.out.println("**********Insert Subject Table*********");
                                    System.out.print("Enter Subject ID (Limit 8) :");
                                    id = rgb.next();
                                    System.out.print("Enter Name");
                                    name = rgb.next();
                                    System.out.print("Enter amount");
                                    amount = rgb.nextInt();
                                    stdDB.insertsubject(id, name, amount);
                                    break;
                                case 4:
                                    System.out.println("**********Insert Academic Table*********");
                                    System.out.print(" Enter id ");
                                    id = rgb.next();
                                    System.out.print(" Enter Sumamount ");
                                    sumamount = rgb.nextInt();
                                    System.out.print(" Enter Gpa ");
                                    gpa = rgb.nextFloat();
                                    stdDB.insertacademic(id,sumamount, gpa);
                                    break;
                                case 5:
                                    System.out.println("**********Insert Student Table*********");
                                    System.out.print(" Enter ID (Limit 8)");
                                    id = rgb.next();
                                    System.out.print(" Enter Name ");
                                    name = rgb.next();
                                    System.out.print(" Enter Address ");
                                    address = rgb.next();
                                    stdDB.insertstudent(id, name, address);
                                    break;

                                default:
                                    break;
                            }

                        } while (i != 0);
                        break;
                    case 3:
                        do {

                            System.out.print("*****Update MAIN MANU******\n");
                            System.out.println("1 : Update Faculty Table");
                            System.out.println("2 : Update Branch Table");
                            System.out.println("3 : Update Subject Table");
                            System.out.println("4 : Update Academic Table");
                            System.out.println("5 : update Student Table");
                            i = rgb.nextInt();
                            switch (i) {
                                case 1:
                                    System.out.println("**********Update Faculty Table*********");
                                    System.out.print("Enter ID (Limit 8): ");
                                    id = rgb.next();
                                    System.out.print("Enter Name : ");
                                    name = rgb.next();
                                    stdDB.Updatefaculty(id, name);
                                    break;
                                case 2:
                                    System.out.println("**********Update Branch Table*********");
                                    System.out.print("Enter Branch ID (Limit 8): ");
                                    id = rgb.next();
                                    System.out.print("Enter Name : ");
                                    name = rgb.next();
                                    stdDB.Updatebranch(id, name);
                                    break;
                                case 3:
                                    System.out.println("**********Update Subject Table*********");
                                    System.out.print("Enter Subject ID (Limit 8) :");
                                    id = rgb.next();
                                    System.out.print("Enter Name");
                                    name = rgb.next();
                                    System.out.print("Enter amount");
                                    amount = rgb.nextInt();
                                    stdDB.Updatesubject(id, name, amount);
                                    break;
                                case 4:
                                    System.out.println("**********Update Academic Table*********");
                                    System.out.print(" Enter Sumamount ");
                                    sumamount = rgb.nextInt();
                                    System.out.print(" Enter Gpa ");
                                    gpa = rgb.nextFloat();
                                    stdDB.Updatecademic(sumamount, gpa);
                                    break;
                                case 5:
                                    System.out.println("**********Insert Student Table*********");
                                    System.out.print(" Enter ID (Limit 8)");
                                    id = rgb.next();
                                    System.out.print(" Enter Name ");
                                    name = rgb.next();
                                    System.out.print(" Enter Address ");
                                    address = rgb.next();
                                    stdDB.Updatestudent(id, name, address);
                                    break;

                                default:
                                    break;
                            }

                        } while (i != 0);

                        break;
                        case 2:
                        do {
                            System.out.print("*****Delete MAIN MANU******\n");
                            System.out.println("1 : Delete Faculty Table");
                            System.out.println("2 : Delete Branch Table");
                            System.out.println("3 : Delete Subject Table");
                            System.out.println("4 : Delete Academic Table");
                            System.out.println("5 : Delete Student Table");
                            i = rgb.nextInt();
                        switch (i) {
                        case 1:
                            System.out.println("**********Delete Faculty Table*********");
                            System.out.print("Enter ID (Limit 8): ");
                            id = rgb.next();

                            stdDB.Deletefaculty(id);
                            break;
                        case 2:
                            System.out.println("**********Delete Branch Table*********");
                            System.out.print("Enter Branch ID (Limit 8): ");
                            id = rgb.next();
                            stdDB.Deletebranch(id);
                            break;
                        case 3:
                            System.out.println("**********Delete Subject Table*********");
                            System.out.print("Enter Subject ID (Limit 8) :");
                            id = rgb.next();
                            stdDB.Deletesubject(id);
                            break;
                        case 4:
                            System.out.println("**********Delete Academic Table*********");
                            System.out.print(" Enter id ");
                            id = rgb.next();
                            stdDB.Deletecademic(id);
                            break;
                        case 5:
                            System.out.println("**********Delete Student Table*********");
                            System.out.print(" Enter ID (Limit 8)");
                            id = rgb.next();
                            stdDB.Deletestudent(id);
                            break;

                        default:
                 break;
                }

            } while (i != 0);
                  break;
                    case 4:
                        do {
                            System.out.print("\n*****Show  MAIN MANU******\n");
                            System.out.println("1 : Show Faculty Table");
                            System.out.println("2 : Show Branch Table");
                            System.out.println("3 : Show Subject Table");
                            System.out.println("4 : Show Academic Table");
                            System.out.println("5 : Show Student Table");
                            i = rgb.nextInt();
                            switch (i) {
                                case 1:
                                    System.out.println("**********Show Faculty Table*********");
                                    System.out.print("Enter ID (Limit 8): ");
                                    id = rgb.next();
                                    System.out.print("Enter Name : ");
                                    name = rgb.next();
                                    stdDB.displayfaculty();
                                    break;
                                case 2:
                                    System.out.println("**********Show Branch Table*********");
                                    System.out.print("Enter Branch ID (Limit 8): ");
                                    id = rgb.next();
                                    System.out.print("Enter Name : ");
                                    name = rgb.next();
                                    stdDB.displaybranch();
                                    break;
                                case 3:
                                    System.out.println("**********Show Subject Table*********");
                                    System.out.print("Enter Subject ID (Limit 8) :");
                                    id = rgb.next();
                                    System.out.print("Enter Name");
                                    name = rgb.next();
                                    System.out.print("Enter amount");
                                    amount = rgb.nextInt();
                                    stdDB.displaysubject();
                                    break;
                                case 4:
                                    System.out.println("**********Show Academic Table*********");
                                    System.out.print(" Enter ID (Limit 8)");
                                    System.out.print(" Enter Sumamount ");
                                    sumamount = rgb.nextInt();
                                    System.out.print(" Enter Gpa ");
                                    gpa = rgb.nextFloat();
                                    stdDB.displayacademic();
                                    break;
                                case 5:
                                    System.out.println("**********Show Student Table*********");
                                    System.out.print(" Enter ID (Limit 8)");
                                    id = rgb.next();
                                    System.out.print(" Enter Name ");
                                    name = rgb.next();
                                    System.out.print(" Enter Address ");
                                    address = rgb.next();
                                    stdDB.displaystudent();
                                    break;

                                default:
                                    break;
                            }

                        } while (i != 0);
                        break;

                    default:
                        break;
                }

            } while (reg != 0);
        }

        // stdDB.insertfaculty("65143038", "cmru");
        // stdDB.insertbranch("56100501", "Technology");
        // stdDB.insertsubject("56100501", "Technology", "3");
        // stdDB.insertacademic("3", "4.00");
        // stdDB.insertstudent("56100501", "panupong", "maerim cgienmai");

        // display

        // stdDB.displayfaculty();
        // stdDB.displaybranch();
        // stdDB.displaysubject();
        // stdDB.displayacademic();
        // stdDB.displaystudent();

        // Update

        // stdDB.Updatefaculty("65143038", "uuu");
        // stdDB.Updatestudent("56100501", "manatchai", "79/65");
        // stdDB.Updatebranch("56100501", "COM");
        // stdDB.Updatesubject("56100501", "web", "2");
        // stdDB.Updatecademic("1", "3.45");

    }

}