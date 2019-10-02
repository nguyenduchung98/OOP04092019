package nguyenduchung.ndh.oop01092019;

import android.util.Log;

public class Hocvien {

    //1: Thuoc tinh
    public String ten;
    public String tuoi;
    //3: cau truc
    public Hocvien(String ten,String tuoi){
        this.ten = ten;
        this.tuoi = tuoi;
    }
    //2: Hanh vi
    public void luatuoi(){
        if(Integer.parseInt(this.tuoi)<18){
            Log.d("BBB","Trẻ trâu");
        }else{
            Log.d("BBB","Người lớn");
        }

    }

}
