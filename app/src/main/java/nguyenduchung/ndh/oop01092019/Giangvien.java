package nguyenduchung.ndh.oop01092019;

public class Giangvien extends Hocvien {
    private String diachi;

    public Giangvien(String ten ,String tuoi){
        super(ten,tuoi);
    }
    public Giangvien(String ten ,String tuoi,String diachi){
        super(ten,tuoi);
        this.diachi=diachi;
    }
    @Override
    public void setTen(String ten) {
        super.setTen(ten);

    }
}
