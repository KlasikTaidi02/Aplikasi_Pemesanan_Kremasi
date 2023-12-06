/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Konsumen;
/**
 -
 * @author User
 */
public class TabelKonsumen extends AbstractTableModel {
    
    private List<Konsumen> list;
    
    public TabelKonsumen(List<Konsumen> list)
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
        return 4;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch(columnIndex)
        {
            case 0:
                return list.get(rowIndex).getIdKonsumen();
            case 1:
                return list.get(rowIndex).getUsernameKonsumen();
            case 2:
                return list.get(rowIndex).getPasswordKonsumen();
            case 3:
                return list.get(rowIndex).getNamaKonsumen();
            case 4:
                return list.get(rowIndex).getNomorTelepon();
            case 5:
                return list.get(rowIndex).getJumlahMayat();
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
                return " Id";
            case 1:
                return " Username";
            case 2:
                return " Password";
            case 3:
                return " Nama";
            case 4:
                return " Nomor Telepon";
            case 5: 
                return " Jumlah Mayat";
            default:
                return null;        
        }
    }
}