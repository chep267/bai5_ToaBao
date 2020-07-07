package ToaBao;

class NhanVienVanPhong extends NhanVien{
    String chucvu;
   
    
    NhanVienVanPhong(){}
    NhanVienVanPhong (String ten, int tuoi, int sdt){
        name = ten;
        age = tuoi;
        phone = sdt;
    }

    @Override
    public void inThe() {
        super.inThe();
        System.out.print("\nChuc vu: "+chucvu);
    }


    // get, set:
    public String get() {return chucvu;}
    public void set( String cv) {chucvu = cv;}
}
