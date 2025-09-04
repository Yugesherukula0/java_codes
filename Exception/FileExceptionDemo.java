package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        try (Scanner fileScanner = new Scanner(file)) {  // Auto-closes fileScanner
            System.out.println("File content:");
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } 
        catch (FileNotFoundException e) {
            System.err.println("❌ Error: File not found! Please check the file name.");
        } 
        catch (Exception e) {
            System.err.println("❌ Unexpected error: " + e.getMessage());
        }

        sc.close();
    }
}

