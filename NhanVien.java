package toabao;

abstract class NhanVien {

    String name; //ten Nhan vien

    NhanVien(){}

    NhanVien(String st){
        name = st;
    }

    //In the nhan vien
    public void inThe(){
        System.out.print("\n\tHo ten: "+name);
    }

    public void inThongTin() {
    }

    // get, set:
     abstract int getSoBaiDang( );
     abstract String getChucVu( );
}
