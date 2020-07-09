package ToaBao;

class NhaBao extends NhanVien{
    int sobd;

    NhaBao(){}
    NhaBao (String ten, int sbd){
        super(ten);
        sobd = sbd;
    }

    @Override
    public void inThe() {
        super.inThe();
        System.out.print("\n\tSo bai dang: "+sobd);
    }


    // get, set:
    public int get() {return sobd;}
    public void set( int so) {sobd = so;}
}
