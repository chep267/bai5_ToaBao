package ToaBao;

class NhaBao extends NhanVien{
    int sobd;
    
    NhaBao(){}
    NhaBao (String ten, int tuoi, int sdt){
        name = ten;
        age = tuoi;
        phone = sdt;
    }

    @Override
    public void inThe() {
        super.inThe();
        System.out.print("\nSo bai dang: "+sobd);
    }


    // get, set:
    public int get() {return sobd;}
    public void set( int so) {sobd = so;}
}
