package toabao;

abstract class NhanVien {

    String name; //ten Nhan vien

    NhanVien() {}

    NhanVien(String st) {
        name = st;
    }

    //In the nhan vien
    public void inThe() {
        System.out.println("\tHo ten: " + name);
    }

    public void inThongTin() {
    }

}
