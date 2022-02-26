import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList nama = new ArrayList();
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;
        int pil;
        String y; 
        //ARRAY 4 HURUF NAMA
        nama.add("r");
        nama.add("i");
        nama.add("n");
        nama.add("a");

        while(lanjut) {
            System.out.println("\n============================");
            System.out.println("       MENU ARRAY NAMA      ");
            System.out.println("============================");
            System.out.println("1. Tampilan Data Array Nama");
            System.out.println("2. Cek isEmpty() Array Nama");
            System.out.println("3. Cek Size Array Nama");
            System.out.println("4. Get Data Array Nama");
            System.out.println("5. Cek indexOf Array Nama");
            System.out.println("6. Remove Data Array Nama");
            System.out.println("7. Add Data Array Nama");
            System.out.println("============================\n");
                
            System.out.print("Inputkan pilihan menu (1-7) -> ");
            pil = input.nextInt();

            switch(pil) {
                case 1:
                //DATA 4 HURUF NAMA
                System.out.println("\n==DATA AWAL ARRAY NAMA==");
                System.out.println("-> "+nama);
                break;

                case 2:
                //IsEMPTY()
                boolean cek_array = nama.isEmpty();
                System.out.println("\n==CEK IsEMPTY() ARRAY NAMA==");
                if(cek_array) {
                    System.out.println("-> Data pada array nama masih kosong");
                }
                else {
                    System.out.println("-> Data pada array nama sudah terisi");
                    System.out.println("   Data array nama yang ada: " +nama);
                }
                break;

                case 3:
                //SIZE
                System.out.println("\n==SIZE ARRAY NAMA==");
                System.out.println("-> Array nama mempunyai ukuran sebanyak "+nama.size());
                break;

                case 4:
                //GET ARRAY
                System.out.println("\n==GET ARRAY NAMA==");
                System.out.println("Isi array pada indeks ke-0 = "+nama.get(0));
                System.out.println("Isi array pada indeks ke-2 = "+nama.get(2));
                System.out.println("Isi array pada indeks ke-6 = "+nama.get(6));
                System.out.println("Isi array pada indeks ke (-3) = "+nama.get(-3));
                break;

                case 5:
                //INDEXOF ARRAY
                System.out.println("\n==INDEX OF ARRAY NAMA==");
                System.out.println("Index dari nilai 'a' yaitu index ke-"+nama.indexOf("a"));
                System.out.println("Index dari nilai 'c' yaitu "+nama.indexOf("c"));
                System.out.println("Index dari nilai 'q' yaitu "+nama.indexOf("q"));
                break;

                case 6:
                //REMOVE ARRAY
                System.out.println("\n==REMOVE DATA ARRAY NAMA==");
                nama.remove(0);
                System.out.println("Data array pada indeks ke-0 terhapus! \nData array sekarang:" +nama);
                nama.remove(3);
                System.out.println("Data array pada indeks ke-3 terhapus! \nData array sekarang:" +nama);
                nama.remove(2);
                System.out.println("Data array pada indeks ke-2 terhapus! \nData array sekarang:" +nama);
                break;

                case 7:
                //ADD DATA
                System.out.println("\n==ADD DATA ARRAY NAMA==");
                nama.add(0, "e");
                nama.add(2, "f");
                nama.add(3, "g");
                nama.add(4, "h");
                nama.add(6, "h");
                nama.add(-3, "j");
                break;

                default:
                System.out.println(">>Maaf, inputan tidak tersedia! Silahkan input angka yang benar (1-7)<<");
            }
            System.out.print("\nApakah Anda ingin melanjutkan [y/n]? -> ");
            y = input.next();
            lanjut = y.equalsIgnoreCase("y");
        }
        System.out.println("\n==<Terima kasih>==\n");
    }
}