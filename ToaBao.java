package ToaBao;

import java.util.Scanner;
import java.lang.*;

public class ToaBao extends NhanVien{
    String tenTB; //ten toa bao
    int n; //so nhan vien
    NhanVien[] ds = new NhanVien[1000];
    ToaBao (String st, int n1){
        tenTB = st;
        n = n1;
    }


    //Them Nhan vien:
    public NhanVien themNV(){
        Scanner sc = new Scanner(System.in);
        String bodem;
        String ten; int sbd; String cv;
        int chon = 0;
        do{
            System.out.print("\nHay chon: \n\t1.Them nha bao           2.Them nhan vien        :   ");
            chon = sc.nextInt(); bodem = sc.nextLine();
            if(chon!=1 && chon!=2){
                System.out.print("\nHay chon lai! ");
            }
        }while (chon!=1 && chon!=2);

        if(chon==1){
            System.out.print("\nNhap ten: ");
            ten = sc.nextLine();
            System.out.print("\nNhap so bai dang: ");
            sbd = sc.nextInt(); bodem = sc.nextLine();

            NhanVien a = new NhaBao(ten, sbd);
            return a;
        }
        else if(chon==2){
            System.out.print("\nNhap ten: ");
            ten = sc.nextLine();
            System.out.print("\nNhap chuc vu: ");
            cv = sc.nextLine();

            NhanVien a = new NhanVienVanPhong(ten, cv);
            return a;
        }
        return null;
    }



//    //Sa thai:
//    public void saThaiNhanVien(int m){
//        Scanner sc = new Scanner(System.in);
//        int dem =0;
//        do {
//            System.out.print("\nNhap ten nhan vien can xoa: ");
//            String ten = sc.nextLine(); String bodem;
//
//            for (int i = 0; i < m; i++) {
//                if(ds[i].name.equals(ten)){
//                    dem++;
//                    for (i = i; i < m-1; i++) {
//                        ds[i] = ds[i+1];
//                    }
//                    break;
//                }
//            }
//            if(dem==0){
//                System.out.print("\nKhong co nhan vien ban vua nhap! Xin hay chon lai! ");
//            }else{
//                System.out.print("\nDone! Ban da xoa nhan vien "+ten);
//            }
//        }while (dem==0);
//    }
//
//
//    //Chuyen, bo sung:
//    public void chuyen(int n){
//        Scanner sc = new Scanner(System.in);
//        int dem =0; int vt;  String bodem;
//        do {
//            System.out.print("\nNhap vi tri can chuyen: ");
//            vt = sc.nextInt();
//            bodem = sc.nextLine();
//
//            if(vt<=0 || vt>n) {
//                System.out.print("\nKhong co vi tri da chon! Xin hay chon lai! ");
//            }else {
//
//            }
//        }while (vt<=0 || vt>n);
//    }

//    //In danh sach toan bo:
//    public void inDS( int n){
//        for(int i=0; i<n; i++){
//            System.out.print("\nNhan vien : "+(i+1));
//            ds[i].inThe();
//        }
//    }

    //Thong tin toa bao:
    public void thongtin(int n){
        System.out.print("\nTen toa bao : "+tenTB );
        System.out.print("\nSo nhan vien: "+n );
        for(int i=0; i<n; i++){
            System.out.print("\nNhan vien : "+(i+1));
            ds[i].inThe();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tb; int n; String bodem;

        //Nhap toa bao:
        System.out.print("\nNhap ten toa bao: ");
        tb = sc.nextLine();
        System.out.print("\nNhap so nhan vien: ");
        n = sc.nextInt();

        ToaBao toabao = new ToaBao(tb,n);
        for(int i=0; i<n; i++){
            toabao.ds[i] = toabao.themNV();
        }

        toabao.thongtin(n);



//        toabao.ds[n++] = toabao.themNV();
//
//        toabao.thongtin(n);
    }
}
