package toabao;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class ToaBao {

    String tenTB; //ten toa bao

    ArrayList<NhanVien> ds = new ArrayList<NhanVien>(); // Danh sach nhan vien

    ToaBao() {}

    ToaBao (String st) {
        tenTB = st;
    }


    //Them Nhan vien:
    //tu tao:
    public NhanVien themNV() {
        Scanner sc = new Scanner(System.in);
        String bodem;
        String ten; int sbd; String cv;
        int chon = 0;
        do{
            System.out.println("Hay chon: \n\t1.Them nha bao           2.Them nhan vien        :   ");
            chon = sc.nextInt(); bodem = sc.nextLine();
            if( (chon != 1) && (chon != 2) ) {
                System.out.println("Hay chon lai! ");
            }
        } while ( (chon != 1) && (chon != 2) );

        if( chon == 1 ) {
            System.out.println("Nhap ten: ");
            ten = sc.nextLine();
            System.out.println("Nhap so bai dang: ");
            sbd = sc.nextInt(); bodem = sc.nextLine();

            NhanVien a = new NhaBao(ten, sbd);
            return a;
        }
        else if( chon == 2 ) {
            System.out.println("Nhap ten: ");
            ten = sc.nextLine();
            System.out.println("Nhap chuc vu: ");
            cv = sc.nextLine();

            NhanVien a = new NhanVienVanPhong(ten, cv);
            return a;
        }
        return null;
    }

    //them auto:
    void themNV( NhanVien a ) {
        ds.add(a);
    }

    //Sa thai:
    void saThaiNhanVien() {
        Scanner sc = new Scanner(System.in);
        int dem =0; String bodem; String ten; int vt=0;
        do {
            System.out.println("Nhap ten nhan vien can xoa: ");
            ten = sc.nextLine();
            for (int i = 0; i < ds.size(); i++) {
                if( ds.get(i).name.equals(ten) ) {
                    dem++;
                }
            }
            if( dem == 0 ) {
                System.out.println("Khong co nhan vien ban vua nhap! Xin hay chon lai! ");
            }else{
                System.out.println("Co " + dem + " nhan vien ten " + ten + " o cac vi tri thu ");
                for (int i = 0; i < ds.size(); i++) {
                    if( ds.get(i).name.equals(ten) ) {
                        System.out.print(" " + (i+1) );
                    }
                }
                boolean flag = false;
                do{
                    System.out.println("Ban muon xoa vi tri nao? ");
                    vt = sc.nextInt();
                    for (int i = 0; i < ds.size(); i++) {
                        if( ds.get(i).name.equals(ten) ){
                            if( vt == i+1 ){
                                flag = true;
                            }
                        }
                    }
                    if( flag == false ) {
                        System.out.println("khong co, hay chon lai! ");
                    }

                } while ( flag == false );
                ds.remove(vt-1);
                System.out.println("Done! Ban da xoa nhan vien thu " + vt + " :" + ten);
            }
        } while ( dem==0 );
    }


    // bo sung:
    public void bosung() {
        ds.add( themNV() );
    }


    //Thong tin toa bao:
    public void thongtin() {

        System.out.println("Ten toa bao : " + tenTB );
        System.out.println("So nhan vien: " + ds.size() );

        for(int i=0; i<ds.size(); i++) {
            System.out.println( "Nhan vien : " + (i+1) );
            ds.get(i).inThe();
        }
    }


    //In danh sach nha bao:
    public void inNhaBao() {

        int i=1;
        System.out.println("Danh sach nha bao la: ");

        for
            (NhanVien nv : ds) {
            if( nv.getSoBaiDang() >= 0 ) {
                System.out.print("\nNha bao " + (i++) + " : ");
                nv.inThongTin();
            }
        }
    }

    //In danh sach nhan vien:
    public void inNhanVien() {

        System.out.println("Danh sach nhan vien van phong la: ");
        int i=1;
        for 
            (NhanVien nv : ds) {
            if( nv.getChucVu() != null ) {
                System.out.println("Nhan Vien " + (i++) + " : ");
                nv.inThongTin();
            }
        }
    }

}
