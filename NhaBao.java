package toa_bao;

class NhaBao extends NhanVien{
    int sobd; // so bai dang cua nha bao

    NhaBao(){}

    NhaBao (String ten, int sbd){
        super(ten);
        sobd = sbd;
    }

    @Override
    public void inThe() {
        super.inThe();
        System.out.print("\n\tLoai nhan vien: Nha bao");
        System.out.print("\n\tSo bai dang: "+sobd);
    }

    //in kieu 2:
    public void inThongTin() {
        super.inThe();
        System.out.print("\n\tSo bai dang: "+sobd);
    }

    // get, set:
    int getSoBaiDang() {
        return sobd;
    }

    void setSoBaiDang( int so) {
        sobd = so;
    }

    String getChucVu() {
        return null;
    }

}
