/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.*;
/**
 *
 * @author Seto
 */
public class TabelKremasiForPembayaran extends AbstractTableModel {
    
    private List<Kremasi> list;

    public TabelKremasiForPembayaran(List<Kremasi> list) {
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
                return list.get(rowIndex).getDataMayat().getNamaMayat();
            case 1:
                return list.get(rowIndex).getLayanan().getNamaLayanan();
            case 2:
                return list.get(rowIndex).getLayanan().getHargaLayanan();
            case 3:
                return list.get(rowIndex).getDataMayat().getStatus();
            case 4:
                return list.get(rowIndex).getDataMayat().getNoTelepon();
            case 5:
                return list.get(rowIndex).getWaktuKremasi();
            case 6:
                return list.get(rowIndex).getIdKonsumen();
            case 7:
                return list.get(rowIndex).getIdKremasi();
            case 8:
                return list.get(rowIndex).getIdLayanan();
            case 9:
                return list.get(rowIndex).getIdMayat();
            case 10:
                return list.get(rowIndex).getIdPegawai();
            case 11:
                return list.get(rowIndex).getPembayaran();
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
                return " Nama Mayat";
            case 1:
                return " Nama Layanan";
            case 2:
                return " Harga Layanan";
            case 3:
                return " Status";
            case 4:
                return " Nomor Telepon";
            case 5:
                return " Waktu Kremasi";
            default:
                return null;
        }
    }
}
