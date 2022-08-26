/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PHANMINHTIEN
 */
public class SinhVienList extends SinhVien{
    public ArrayList<SinhVien> list = new ArrayList<>();
    
    
    public int add(SinhVien sv){
       list.add(sv);
       return 1;
    }
    
    public ArrayList<SinhVien> getAllSinhVien(){
       return list;
    }
    public int deleteSinhVienByID(String maSV){
        for(SinhVien sv : list){
            if(sv.getMaSV().equalsIgnoreCase(maSV)){
                list.remove(sv);
                return 1;
            }
        }
        return -1;
    }
    public SinhVien getSinhVienByID(String maSV){
        for(SinhVien sv : list){
            if(sv.getMaSV().equalsIgnoreCase(maSV)){
                return sv;
            }
        }
        return null;
    }
    public int updateSinhVienByID(SinhVien svNew){
        for(SinhVien sv : list){
            if(sv.getMaSV().equalsIgnoreCase(svNew.getMaSV())){
                sv.setTenSV(svNew.getTenSV());
                sv.setNgaySinh(svNew.getNgaySinh());
                sv.setDiaChi(svNew.getDiaChi());
                sv.setGioiTinh(svNew.isGioiTinh());
                sv.setHinhAnh(svNew.getHinhAnh());
                return 1;
            }
        }
        return -1;
    }
   
    public SinhVien getOneStudentByMaSV(String masv){
        for(SinhVien sv : list){
            if(sv.getMaSV().equalsIgnoreCase(masv)){
                return sv;
            }
        }
        return null;
    }
    

}

