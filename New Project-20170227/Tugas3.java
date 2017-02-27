import java.util.Scanner;
public class Tugas3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukan angka yang kamu suka : ");
    byte number = scanner.nextByte();
    System.out.println("Angka yang anda masukan adalah angka " + number);
  }
}