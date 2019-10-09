package nguyenduchung.ndh.oop01092019;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Hocvien {

    //1: Thuoc tinh
    private String ten;
    private String tuoi;
    //3: cau truc
    public Hocvien(){

    }

    public Hocvien(String ten,String tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
    }
    //2: Hanh vi
    public void setTen(String ten){
        if(ten.matches("[0-9]+")){
          return;
        }else{
            this.ten=ten;
        }
    }
    public String getTen(){
        return ten;
    }

    public void luatuoi(){
        if(Integer.parseInt(this.tuoi)<18){
            Log.d("BBB","Trẻ trâu");
        }else{
            Log.d("BBB","Người lớn");
        }

    }

}
