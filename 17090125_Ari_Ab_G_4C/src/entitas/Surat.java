/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitas;

/**
 *
 * @author Acer
 */
public class Surat {
    private String noSurat;
    private String namaPengirim;
    private String isiSurat;

    public String getNoSurat() {
        return noSurat;
    }

    public void setNoSurat(String noSurat) {
        this.noSurat = noSurat;
    }

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    public String getIsiSurat() {
        return isiSurat;
    }

    public void setIsiSurat(String isiSurat) {
        this.isiSurat = isiSurat;
    }

    public Surat(String noSurat, String namaPengirim, String isiSurat) {
        this.noSurat = noSurat;
        this.namaPengirim = namaPengirim;
        this.isiSurat = isiSurat;
    }
    
    public boolean equals(Object object) {
        Surat temp = (Surat) object;
        return noSurat.equals(temp.getNoSurat());
    }
    
    
}
