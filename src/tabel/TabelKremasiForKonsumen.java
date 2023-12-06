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
public class TabelKremasiForKonsumen extends AbstractTableModel {
    
    private List<Kremasi> list;

    public TabelKremasiForKonsumen(List<Kremasi> list) {
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
                return list.get(rowIndex).getDataMayat().getNamaMayat();
            case 1:
                return list.get(rowIndex).getDataMayat().getNoTelepon();
            case 2:
                return list.get(rowIndex).getDataMayat().getStatus();
            case 3:
                return list.get(rowIndex).getLayanan().getNamaLayanan();
            case 4:
                return list.get(rowIndex).getLayanan().getHargaLayanan();
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
            case 12:
                return list.get(rowIndex).getDataMayat().getTanggalMasuk();
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
                return " No Telepon Keluarga";
            case 2:
                return " Status";
            case 3:
                return " Nama Layanan";
            case 4:
                return " Harga Layanan";
            case 5:
                return " Waktu Kremasi";
            default:
                return null;
        }
    }
}
