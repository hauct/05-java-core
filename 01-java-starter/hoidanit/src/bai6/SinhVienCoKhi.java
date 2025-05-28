package bai6;

public class SinhVienCoKhi extends SinhVien {
    public  String skill;
    public SinhVienCoKhi(String skill, String id, String name, double price, double tax) {
        super(id, name, price, tax);
        this.skill = skill;
    }
}
