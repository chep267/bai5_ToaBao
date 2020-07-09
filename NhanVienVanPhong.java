package ToaBao;

class NhanVienVanPhong extends NhanVien{
    String chucvu;

    NhanVienVanPhong(){}
    NhanVienVanPhong (String ten, String cv){
        super(ten);
        chucvu = cv;
    }

    @Override
    public void inThe() {
        super.inThe();
        System.out.print("\n\tChuc vu: "+chucvu);
    }


    // get, set:
    public String get() {return chucvu;}
    public void set( String cv) {chucvu = cv;}
}
