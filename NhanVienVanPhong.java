package toa_bao;

class NhanVienVanPhong extends NhanVien{
    String chucvu; //Chuc vu cua nhan vien

    NhanVienVanPhong(){}
    NhanVienVanPhong (String ten, String cv){
        super(ten);
        chucvu = cv;
    }

    @Override
    public void inThe() {
        super.inThe();
        System.out.print("\n\tLoai nhan vien: Nhan vien van phong");
        System.out.print("\n\tChuc vu: "+chucvu);
    }


    // get, set:
    public String get_ChucVu() {return chucvu;}
    public void set_ChucVu( String cv) {chucvu = cv;}
}
