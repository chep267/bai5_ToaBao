package toabao;

import java.util.Scanner;

public class TestTaoBao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Khoi tao toa bao moi:
        ToaBao toabao = new ToaBao("Dan tri");
        toabao.thongtin();

        System.out.print("\n-----------------------\n");


        //Khoi tao nhan vien:
        for (int i=0; i<6; i=i+2) {
            toabao.themNV( new NhanVienVanPhong("nam","chuyen vien"));
            toabao.themNV( new NhaBao("ha",i));
        }
        toabao.thongtin();


        System.out.print("\n-----------------------\n");

        //sa thai:
        toabao.saThaiNhanVien();
        toabao.thongtin();

        //In Nha bao va nhan vien rieng:
        System.out.print("\n-----------------------\n");
        toabao.inNhaBao();
        System.out.print("\n-----------------------\n");
        toabao.inNhanVien();

    }
}
