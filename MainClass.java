package jamal;

import java.util.Scanner;

public class MainClass
{
  public static void main(String[] args) {
   
      Scanner inputUser = new Scanner(System.in);
      
      double menitDalamTahun = 60 * 24 * 365;
      
      System.out.println("Masukan Angka Dalam Menit : ");
      
      double angka = inputUser.nextDouble();
      
      long tahun = (long) (angka/menitDalamTahun);
      int hari = (int) (angka/60/24) % 365;
      
      System.out.println((int)angka+ " menit adalah sekitar "+tahun+" Tahun dan "+hari+" hari");
  }
}
