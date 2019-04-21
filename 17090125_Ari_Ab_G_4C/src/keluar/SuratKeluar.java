/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keluar;
import java.util.*;
import entitas.*;

/**
 *
 * @author Acer
 */
public class SuratKeluar {
    private static List<Surat> data = new LinkedList<>();
    
        public void addData (Surat sk){
            data.add(sk);
            System.out.println("Data anda sudah di save!");
        }
        
        public void updateData (Surat sk){
            int index = data.indexOf(sk);
            if(index >= 0) {
            data.set(index, sk);
            System.out.println("Data telah berubah");
            }
        }
        public void deleteData (String id){
            int idx = data.indexOf(new Surat(id, "", ""));
            if (idx >= 0) {
                data.remove(idx);
                System.err.println("Data sudah di delete!");
            }
        }
        public void lihatSemuaData(){
            int i=1;
            System.out.println("\nData di List :");
            for(Surat sk : data) {
            System.out.println("data ke-" + i++);
            System.out.println("  ID : " + sk.getNoSurat());
            System.out.println("  NAMA : " + sk.getNamaPengirim());
            System.out.println("  ISI SURAT : " + sk.getIsiSurat());
        }
        }
    
}
