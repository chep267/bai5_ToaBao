package ToaBao;

import java.util.Scanner;
import java.lang.*;

public class ToaBao extends NhanVien{
    String tenTB; //ten toa bao
    int n,m; //so nha bao va so nhan vien
    NhaBao[] ds1 = new NhaBao[n];
    NhanVienVanPhong[] ds2 = new NhanVienVanPhong[m];
    ToaBao (int n1, int m1){
        n = n1;
        m = m1;
    }


    //Them Nha bao:
    public NhaBao themNB(){
        Scanner sc = new Scanner(System.in);
        String bodem = sc.nextLine();
        NhaBao a = new NhaBao();
        System.out.print("\nNhap ten: ");
        a.name = sc.nextLine();
        System.out.print("\nNhap tuoi: ");
        a.age = sc.nextInt();
        System.out.print("\nNhap sdt: ");
        a.phone = sc.nextInt();
        System.out.print("\nNhap so bai dang: ");
        a.sobd = sc.nextInt(); bodem = sc.nextLine();
        return a;
    }
    //Them Nhan vien van phong:
    public NhanVienVanPhong themNV(){
        Scanner sc = new Scanner(System.in);
        String bodem = sc.nextLine();
        NhanVienVanPhong a = new NhanVienVanPhong();
        System.out.print("\nNhap ten: ");
        a.name = sc.nextLine();
        System.out.print("\nNhap tuoi: ");
        a.age = sc.nextInt();
        System.out.print("\nNhap sdt: ");
        a.phone = sc.nextInt(); bodem = sc.nextLine();
        System.out.print("\nNhap chuc vu: ");
        a.chucvu = sc.nextLine();
        return a;
    }


    //Sa thai:
    public void saThaiNhanVien(int m){
        Scanner sc = new Scanner(System.in);
        int dem =0;
        do {
            System.out.print("\nNhap ten nhan vien can xoa: ");
            String ten = sc.nextLine(); String bodem;

            for (int i = 0; i < m; i++) {
                if(ds2[i].name.equals(ten)){
                    dem++;
                    for (i = i; i < m-1; i++) {
                        ds2[i] = ds2[i+1];
                    }
                    break;
                }
            }
            if(dem==0){
                System.out.print("\nKhong co nhan vien ban vua nhap! Xin hay chon lai! ");
            }else{
                System.out.print("\nDone! Ban da xoa nhan vien "+ten);
            }
        }while (dem==0);
    }
    public void saThaiNhaBao(int n){
        Scanner sc = new Scanner(System.in);
        int dem =0;
        do {
            System.out.print("\nNhap ten nhan vien can xoa: ");
            String ten = sc.nextLine(); String bodem;

            for (int i = 0; i < n; i++) {
                if(ds1[i].name.equals(ten)){
                    dem++;
                    for (i = i; i < n-1; i++) {
                        ds1[i] = ds1[i+1];
                    }
                    break;
                }
            }
            if(dem==0){
                System.out.print("\nKhong co nhan vien ban vua nhap! Xin hay chon lai! ");
            }else{
                System.out.print("\nDone! Ban da xoa nhan vien "+ten);
            }
        }while (dem==0);
    }



    //Chuyen, bo sung:
    public void chuyen(int n){
        Scanner sc = new Scanner(System.in);
        int dem =0; int vt;  String bodem;
        do {
            System.out.print("\nNhap vi tri can chuyen: ");
            vt = sc.nextInt();
            bodem = sc.nextLine();

            if(vt<=0 || vt>n) {
                System.out.print("\nKhong co vi tri da chon! Xin hay chon lai! ");
            }else {

            }
        }while (vt<=0 || vt>n);
    }

    //In danh sach toan bo:
    public void inDS( int n, int m){
        for(int i=0; i<n; i++){
            System.out.print("\nNha bao thu : "+(i+1));
            ds1[i].inThe();
        }
        System.out.print("------------------------");
        for(int i=0; i<m; i++){
            System.out.print("\nNhan vien thu : "+(i+1));
            ds2[i].inThe();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tb; int n, m; String bodem;

        //Nhap toa bao:
        System.out.print("\nNhap ten toa bao: ");
        tb = sc.nextLine();
        System.out.print("\nNhap so nha bao, nhan vien: ");
        n = sc.nextInt(); m = sc.nextInt();
        bodem = sc.nextLine();


        ToaBao toabao = new ToaBao(n,m);



    }
}
