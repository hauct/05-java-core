package bai7;

public class SinhVienIT extends SinhVien {
    Double scoreJava;
    Double scoreHTML;

    SinhVienIT(Double scoreJava, Double scoreHTML){
        this.scoreJava = scoreJava;
        this.scoreHTML = scoreHTML;       
    }

    @Override
    double getDiem() {
        Double ketQua = (this.scoreJava*2 + this.scoreHTML)/3;
        return ketQua;
    }
    
}