
package pemrograman_berbasis_desktop.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pemrograman_berbasis_desktop.entity.Barang;

public class BarangTableModel extends AbstractTableModel
{
    private List<Barang> rows;
    public BarangTableModel(List<Barang> list)
    {
        rows = list;
    }
    
    public int getRowCount()
    {
        return rows.size();
    }
    public int getColumnCount()
    {
        return 4; // jumlah kolom
    }
    
    public Object getValueAt (int rowIndex, int columnIndex)
    {
        Barang perkiraan = rows.get (rowIndex);
        switch (columnIndex)
        {
            case 0 : 
                return perkiraan.getKode();
            case 1 :
                return perkiraan.getNama();
            case 2 :
                return perkiraan.getSatuan();
            case 3 :
                return perkiraan.getHarga_satuan();
            default :
                return null;
        }
    }
    
    public String getColumnName(int column)
    {
        switch(column)
        {
            case 0 :
                return "Kode";
            case 1 :
                return "Nama";
            case 2 :
                return "Satuan";
            case 3 :
                return "Harga Satuan";
            default :
                return null;
                
        }
    }
    
    public Class<?> getColumnClass (int columnIndex)
    {
        switch(columnIndex)
        {
            case 0 :
                return String.class;
            case 1 :
                return String.class;
            case 2 :
                return String.class;
            case 3 :
                return Integer.class;
            default :
                return super.getColumnClass(columnIndex);
                
        }
    }
    
    public void setRows (List<Barang> list)
    {
        rows = list;
    }
    
    public List<Barang> getRows()
    {
        return rows;
    }
        
}
