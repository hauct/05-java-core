package bai7;

public class Video45 {
    public static void main(String[] args) {
        SinhVien st1 = new SinhVienIT(54.9, 13.9);
        st1.getDiem();
        System.out.println("Điểm của sinh viên IT: " + st1.getDiem());

        SinhVien st2 = new SinhVienCoKhi(54.9, 13.9);
        st2.getDiem();
        System.out.println("Điểm của sinh viên cơ khí: " + st2.getDiem());
    }
}
