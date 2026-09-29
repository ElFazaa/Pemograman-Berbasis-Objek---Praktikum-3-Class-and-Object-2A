package id.ac.polban.pbo.kantin.app;

import id.ac.polban.pbo.kantin.model.Mahasiswa;
import id.ac.polban.pbo.kantin.model.MenuItem;
import id.ac.polban.pbo.kantin.model.Pesanan;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("241001", "Asep");
        Mahasiswa m2 = new Mahasiswa("241002", "Siti");

        MenuItem nasi = new MenuItem("M01", "Nasi Goreng", 18000);
        MenuItem kopi = new MenuItem("M02", "Kopi Susu", 12000);
        kopi.tandaiHabis(); 

        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        Pesanan p3 = new Pesanan(m1, nasi, 0); 

        System.out.println("[RINGKASAN PESANAN]");
        
        System.out.println("Pesanan #" + p1.getNomor() + 
            " | Pemesan: " + p1.getPemesan().getNama() + 
            " | Menu: " + p1.getMenu().getNama() + " x" + p1.getJumlah() +
            " | Total: Rp" + p1.hitungTotal() +
            " | Status: " + (p1.dapatDiproses() ? "DAPAT DIPROSES" : "DITOLAK"));

        System.out.println("Pesanan #" + p2.getNomor() + 
            " | Pemesan: " + p2.getPemesan().getNama() + 
            " | Menu: " + p2.getMenu().getNama() + " x" + p2.getJumlah() +
            " | Total: Rp" + p2.hitungTotal() +
            " | Status: " + (p2.dapatDiproses() ? "DAPAT DIPROSES" : "DITOLAK"));

        System.out.println("Pesanan #" + p3.getNomor() + 
            " | Pemesan: " + p3.getPemesan().getNama() + 
            " | Menu: " + p3.getMenu().getNama() + " x" + p3.getJumlah() +
            " | Total: Rp" + p3.hitungTotal() +
            " | Status: " + (p3.dapatDiproses() ? "DAPAT DIPROSES" : "DITOLAK"));
            
        System.out.println("\n[CHALLENGE A] Kasir - relationship uses-a");
        Kasir kasir = new Kasir();
        System.out.print("Pesanan #1 diproses: ");
        kasir.proses(p1);
        System.out.print("Pesanan #2 diproses: ");
        kasir.proses(p2);
        System.out.print("Pesanan #3 diproses: ");
        kasir.proses(p3);
    }
}