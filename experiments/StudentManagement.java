
 import java.io.*;
 import java.util.*;

 class Student {
     int rollNo;
     String name;
     String course;
     int year;
     int marks;

     public Student(int rollNo, String name, String course, int year, int marks) {
         this.rollNo = rollNo;
         this.name = name;
         this.course = course;
         this.year = year;
         this.marks = marks;
     }

     @Override
     public String toString() {
         return rollNo + "," + name + "," + course + "," + year + "," + marks;
     }

     public static Student fromString(String line) {
         String[] parts = line.split(",");
         return new Student(
             Integer.parseInt(parts[0]),
             parts[1],
             parts[2],
             Integer.parseInt(parts[3]),
             Integer.parseInt(parts[4])
         );
     }
 }

 public class StudentManagement {
     private static final String FILE_NAME = "students.txt";

     // 1. Add new student
     public static void addStudent(Student s) throws IOException {
         try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
             bw.write(s.toString());
             bw.newLine();
         }
     }

     // 2. Display all students
     public static void displayAll() throws IOException {
         try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
             String line;
             while ((line = br.readLine()) != null) {
                 Student s = Student.fromString(line);
                 System.out.println(s.rollNo + " | " + s.name + " | " + s.course + " | " + s.year + " | " + s.marks);
             }
         }
     }

     // 3. Search by roll number
     public static Student searchByRoll(int roll) throws IOException {
         try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
             String line;
             while ((line = br.readLine()) != null) {
                 Student s = Student.fromString(line);
                 if (s.rollNo == roll) return s;
             }
         }
         return null;
     }

     // 4. Update marks
     public static void updateMarks(int roll, int newMarks) throws IOException {
         File inputFile = new File(FILE_NAME);
         File tempFile = new File("temp.txt");

         try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
              BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
             
             String line;
             while ((line = br.readLine()) != null) {
                 Student s = Student.fromString(line);
                 if (s.rollNo == roll) {
                     s.marks = newMarks; // update marks
                 }
                 bw.write(s.toString());
                 bw.newLine();
             }
         }

         inputFile.delete();
         tempFile.renameTo(inputFile);
     }

     // 5. Delete student
     public static void deleteStudent(int roll) throws IOException {
         File inputFile = new File(FILE_NAME);
         File tempFile = new File("temp.txt");

         try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
              BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile))) {
             
             String line;
             while ((line = br.readLine()) != null) {
                 Student s = Student.fromString(line);
                 if (s.rollNo != roll) { // skip deleting
                     bw.write(s.toString());
                     bw.newLine();
                 }
             }
         }

         inputFile.delete();
         tempFile.renameTo(inputFile);
     }

     public static void main(String[] args) throws IOException {
         Scanner sc = new Scanner(System.in);

         while (true) {
             System.out.println("\n--- Student Management Menu ---");
             System.out.println("1. Add Student");
             System.out.println("2. Display All Students");
             System.out.println("3. Search by Roll No");
             System.out.println("4. Update Marks");
             System.out.println("5. Delete Student");
             System.out.println("6. Exit");
             System.out.print("Enter choice: ");
             int choice = sc.nextInt();

             switch (choice) {
                 case 1:
                     System.out.print("Enter roll no: ");
                     int roll = sc.nextInt();
                     sc.nextLine();
                     System.out.print("Enter name: ");
                     String name = sc.nextLine();
                     System.out.print("Enter course: ");
                     String course = sc.nextLine();
                     System.out.print("Enter year: ");
                     int year = sc.nextInt();
                     System.out.print("Enter marks: ");
                     int marks = sc.nextInt();
                     addStudent(new Student(roll, name, course, year, marks));
                     break;

                 case 2:
                     displayAll();
                     break;

                 case 3:
                     System.out.print("Enter roll no: ");
                     int searchRoll = sc.nextInt();
                     Student s = searchByRoll(searchRoll);
                     if (s != null) {
                         System.out.println("Found: " + s.rollNo + " | " + s.name + " | " + s.course + " | " + s.year + " | " + s.marks);
                     } else {
                         System.out.println("Student not found!");
                     }
                     break;

                 case 4:
                     System.out.print("Enter roll no: ");
                     int rollUpdate = sc.nextInt();
                     System.out.print("Enter new marks: ");
                     int newMarks = sc.nextInt();
                     updateMarks(rollUpdate, newMarks);
                     System.out.println("Marks updated.");
                     break;

                 case 5:
                     System.out.print("Enter roll no: ");
                     int rollDelete = sc.nextInt();
                     deleteStudent(rollDelete);
                     System.out.println("Student deleted.");
                     break;

                 case 6:
                     sc.close();
                     System.exit(0);
             }
         }
     }
 }
