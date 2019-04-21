import entitas.*;
import keluar.*;
import java.util.*;

/**
 *
 * @author Acer
 */
public class Aplikasi {
    private static SuratKeluar keluar;
    private static Scanner scanner;
    
    public static void main(String[] args) {
        keluar = new SuratKeluar();
        scanner = new Scanner(System.in);
        
        int opsi = 5;
        do {
            showMenu();
            try {
                scanner = new Scanner(System.in);
                opsi = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.err.println("Maaf, Inputan data salah, coba teliti lagi!");
                opsi = 0;
            } catch(NoSuchElementException nsee) {

            }
            prosesOpsi(opsi);
        } while(opsi != 5);
    }
        private static void prosesOpsi(int pilihan) {
        switch(pilihan) {
            case 1:
                showFormTambahData();
                break;
            case 2:
                showFormEditData();
                break;
            case 3:
                showDeleteData();
                break;
            case 4:
                keluar.lihatSemuaData();
                break;
            case 5:
                System.out.println("Terima kasih");
        }
    }
        private static void showDeleteData() {
        scanner = new Scanner(System.in);
        System.out.println("\nForm Hapus Data");
        System.out.print("NO SURAT : ");
        String noSur = scanner.nextLine();
        keluar.deleteData(noSur);
    }
        private static void showFormEditData() {
            scanner = new Scanner(System.in);
            String no_surat, nama, isi;

            System.out.println("\nForm Ubah Data");
            System.out.print("NO SURAT : ");
            no_surat = scanner.nextLine();
            System.out.print("NAMA : ");
            nama = scanner.nextLine();
            System.out.print("ISI SURAT : ");
            isi = scanner.nextLine();
            
            keluar.updateData(new Surat(no_surat, nama, no_surat));
           
    }
        private static void showFormTambahData() {
        scanner = new Scanner(System.in);
        String no_s, nama, isi;

        System.out.println("\nForm Entry Data");
        System.out.print("NO SURAT : ");
        no_s = scanner.nextLine();
        System.out.print("NAMA : ");
        nama = scanner.nextLine();
        System.out.print("ISI SURAT : ");
        isi = scanner.nextLine();
        keluar.addData(new Surat(no_s, nama, isi));    
    }
        private static void showMenu() {
        System.out.println("CRUD SURAT KELUAR");
        System.out.println("1. Tambah Surat");
        System.out.println("2. Ubah Surat");
        System.out.println("3. Hapus Surat");
        System.out.println("4. Tampilkan Surat");
        System.out.println("5. KELUAR");
        System.out.println("-------------------");
        System.out.print  ("pilihan > ");
    }
}
