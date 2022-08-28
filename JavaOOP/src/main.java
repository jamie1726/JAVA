import java.util.*;

public class main {
    public static void main(String[] args)
    {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        int menuChoice = 3;
        do {
            System.out.println("\t\t\tStudent Records");
            System.out.println("\t\t1. Add Student\t2. View Students\t3. Exit");
            try {
                System.out.println("Enter choice: ");
                menuChoice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                continue;
            }
            if (menuChoice==1)
            {
                System.out.println("Full name:");
                String name = input.nextLine();
                int age = -1;
                do {
                    try {
                        System.out.println("Age:");
                        age = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a number!");
                        continue;
                    }
                } while (age <= 0);

                System.out.println("Gender:");
                String gender = input.nextLine();

                int idNo = -1;
                do {
                    try {
                        System.out.println("ID No:");
                        idNo = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Enter a number!");
                        continue;
                    }
                } while (idNo <= 0);

                Student student = new Student(name, age, gender, idNo);
                students.add(student);

            } else if (menuChoice==2) {
                System.out.println("Students:");
                for (Student student : students)
                {
                    System.out.println(student);
                }
            }
        } while (menuChoice<3);
    }

}