
package pemrograman_berbasis_desktop.entity;


public class Barang 
{
    private String kode;
    private String nama;
    private String satuan;
    private int harga_satuan;

    public String getKode() 
    {
        return kode;
    }

    public void setKode(String kode) 
    {
        this.kode = kode;
    }

    public String getNama() 
    {
        return nama;
    }

    public void setNama(String nama) 
    {
        this.nama = nama;
    }

    public String getSatuan() 
    {
        return satuan;
    }

    public void setSatuan(String satuan) 
    {
        this.satuan = satuan;
    }

    public int getHarga_satuan() 
    {
        return harga_satuan;
    }

    public void setHarga_satuan(int harga_satuan) 
    {
        this.harga_satuan = harga_satuan;
    }
    
    
}
