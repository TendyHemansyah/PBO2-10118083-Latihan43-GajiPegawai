/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118083.latihan43.gajipegawai;

/**
 *
 * @author 
 * Nama     : Tendy Hermansyah
 * Kelas    : IF-2
 * Nim      : 10118083
 * Deskripsi Tugas : Gaji Pegawai * 
 */
public class PBO2_10118083_Latihan43_GajiPegawai {
    
    private static int totalgaji;
    
    public static void main(String[] args) {
        GajiPegawai gp = new GajiPegawai();
        gp.setNama("Rizki Adam Kurniawan");
        gp.setAlamat("Jalan Semar dlm No72/66");
        gp.setUangTransport(250000);
        gp.setUangTunjangan(300000);
        gp.setGajiPokok(4500000);
        
        totalgaji = gp.totalGaji(gp.getUangTunjangan(), gp.getUangTransport(), gp.getGajiPokok());
        
        gp.tampilData(gp.getNama(), gp.getAlamat(), gp.getUangTransport(), gp.getUangTunjangan(), gp.getGajiPokok(),totalgaji);
        
    }
}
