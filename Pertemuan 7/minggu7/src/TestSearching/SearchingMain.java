package TestSearching;
public class SearchingMain {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        Searching pencarian = new Searching(data, 8);
        
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        
        int cari = 30;
        
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);
        if(posisi != -1){
            System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
        } else {
            System.out.println("data " + cari + " tidak ditemukan");
        }
        
//        System.out.println("==============================");
//        System.out.println("menggunakan binary search");
//        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
//        pencarian.Tampilpoisisi(cari, posisi);
    }
}
