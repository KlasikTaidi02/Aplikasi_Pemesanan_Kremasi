/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Pegawai;

public class TabelTampilPegawai extends AbstractTableModel{
    
    private List<Pegawai> list;
    
     public TabelTampilPegawai(List<Pegawai> list)
    {
        this.list = list;
    }
    
    @Override
    public int getRowCount()
    {
        return list.size();
    }
    
    @Override
    public int getColumnCount()
    {
        return 6;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch(columnIndex)
        {
            case 0:
                return list.get(rowIndex).getIdPegawai();
            case 1:
                return list.get(rowIndex).getUsernamePegawai();
            case 2:
                return list.get(rowIndex).getPasswordPegawai();
            case 3:
                return list.get(rowIndex).getNamaPegawai();
            case 4:
                return list.get(rowIndex).getNoHP();
            case 5:
                return list.get(rowIndex).getTanggalMasuk();
            default:
                return null;       
        }  
    }
    
    @Override
    public String getColumnName(int column)
    {
        switch(column)
        {
            case 0:
                return " Id Pegawai";
            case 1:
                return " Username Pegawai";
            case 2:
                return " Password Pegawai";
            case 3:
                return " Nama Pegawai";
            case 4:
                return " No Telepon";
            case 5:
                return " Tanggal Masuk";
            default:
                return null;        
        }
    }
}
