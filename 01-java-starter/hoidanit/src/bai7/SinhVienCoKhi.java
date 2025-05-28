package bai7;

public class SinhVienCoKhi extends SinhVien {
    Double scoreCNC;
    Double scorePLC;

    SinhVienCoKhi(Double scoreCNC, Double scorePLC){
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;       
    }

    @Override
    double getDiem() {
        Double ketQua = (this.scoreCNC*2 + this.scorePLC)/2;
        return ketQua;
    }

}
