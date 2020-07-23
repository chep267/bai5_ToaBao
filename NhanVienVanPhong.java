package toabao;

class NhanVienVanPhong extends NhanVien {

    String chucvu; //Chuc vu cua nhan vien

    NhanVienVanPhong(){}

    NhanVienVanPhong (String ten, String cv) {
        super(ten);
        chucvu = cv;
    }

    @Override
    public void inThe() {
        super.inThe();
        System.out.print("\n\tLoai nhan vien: Nhan vien van phong");
        System.out.print("\n\tChuc vu: " + chucvu);
    }

    //in kieu 2:
    public void inThongTin() {
        super.inThe();
        System.out.print("\n\tChuc vu: " + chucvu);
    }


    // get, set:

    String getChucVu() {return chucvu;}

    void setChucVu( String cv) {chucvu = cv;}

    int getSoBaiDang() {
        return -1;
    }
}