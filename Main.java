import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Masukkan jumlah siswa: ");
        int studentLenght = input.nextInt();
        input.nextLine();

        for(int i = 0; i < studentLenght ; i++) {
            System.out.println("\nData siswa ke-" + (i + 1));
            
            System.out.print("Nama : ");
            String name = input.nextLine();
            
            System.out.print("Nilai : ");
            double score = input.nextLine();
            
            Student student = new Student(name, score);
            student.add(student);
        }

        for(Student student : students) {
            students.checkPassed();
        }

        double totalScore = 0;
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        System.out.println("\n=== HASIL DATA SISWA ===");

        for (Student student : students) {
            System.out.println("Nama  : " + student.name);
            System.out.println("Nilai : " + student.score);

            if (student.passed) {
                System.out.println("Status: Lulus");
                jumlahLulus++;
            } else {
                System.out.println("Status: Tidak Lulus");
                jumlahTidakLulus++;
            }

            totalScore += student.score;
            System.out.println();
        }

        double average = totalScore / students.size();

        System.out.println("=== HASIL AKHIR ===");
        System.out.println("Rata-rata nilai     : " + average);
        System.out.println("Jumlah lulus        : " + jumlahLulus);
        System.out.println("Jumlah tidak lulus  : " + jumlahTidakLulus);

        input.close();
    }
}
