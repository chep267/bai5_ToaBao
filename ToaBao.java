package toa_bao;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class ToaBao extends NhanVien{
    String tenTB; //ten toa bao

    ArrayList<NhanVien> ds = new ArrayList<NhanVien>(); // Danh sach nhan vien

    ToaBao(){}
    ToaBao (String st){
        tenTB = st;
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



    //Sa thai:
    public ArrayList<NhanVien> saThaiNhanVien(){
        Scanner sc = new Scanner(System.in);
        int dem =0; String bodem; String ten; int vt=0;
        do {
            System.out.print("\nNhap ten nhan vien can xoa: ");
            ten = sc.nextLine();
            for (int i = 0; i < ds.size(); i++) {
                if(ds.get(i).name.equals(ten)){
                    dem++;
                }
            }
            if(dem==0){
                System.out.print("\nKhong co nhan vien ban vua nhap! Xin hay chon lai! ");
            }else{
                System.out.print("\nCo "+dem+" nhan vien ten "+ten+" o cac vi tri thu ");
                for (int i = 0; i < ds.size(); i++) {
                    if(ds.get(i).name.equals(ten)){
                        System.out.print(" "+(i+1));
                    }
                }
                System.out.print("\nBan muon xoa vi tri nao? ");
                vt = sc.nextInt();
                ds.remove(vt-1);
                System.out.print("\nDone! Ban da xoa nhan vien thu "+vt+" :"+ten);
            }
        }while (dem==0);

        return ds;
    }


    // bo sung:
    public void bosung(){
        ds.add(themNV());
    }


    //Thong tin toa bao:
    public void thongtin(int n){
        System.out.print("\nTen toa bao : "+tenTB );
        System.out.print("\nSo nhan vien: "+n );
        for(int i=0; i<n; i++){
            System.out.print("\nNhan vien : "+(i+1));
            ds.get(i).inThe();
        }
    }


    //In danh sach nha bao:
    public void inNhaBao(){
        int i=1;
        System.out.print("\nDanh sach nha bao la: ");
        for(NhanVien nv : ds){
            if(nv.getSoBaiDang()>=0){
                System.out.print("\nNha bao "+(i++)+" : ");
                nv.inThongTin();
            }
        }
    }

    //In danh sach nhan vien:
    public void inNhanVien(){
        System.out.print("\nDanh sach nhan vien van phong la: ");
        int i=1;
        for(NhanVien nv : ds){
            if(nv.getChucVu()!=null){
                System.out.print("\nNhan Vien "+(i++)+" : ");
                nv.inThongTin();
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bodem;



        ToaBao toabao = new ToaBao("Dan tri");
        toabao.thongtin(toabao.ds.size());

        System.out.print("\n-----------------------\n");
//        //bo sung:
//        int n=0;
//        System.out.print("\nNhap so nhan vien muon them: ");
//        n = sc.nextInt(); bodem = sc.nextLine();
//        for (int i=0; i<n; i++){
//            toabao.bosung(toabao.ds);
//        }
//        toabao.thongtin(toabao.ds.size());

        for (int i=0; i<6; i=i+2){
            toabao.ds.add( new NhanVienVanPhong("nam","chuyen vien"));
            toabao.ds.add( new NhaBao("ha",i));
        }
        toabao.thongtin(toabao.ds.size());


       System.out.print("\n-----------------------\n");
       //sa thai:
       toabao.ds = toabao.saThaiNhanVien(toabao.ds);
       toabao.thongtin(toabao.ds.size());

        //In Nha bao va nhan vien rieng:
        System.out.print("\n-----------------------\n");
        toabao.inNhaBao();
        System.out.print("\n-----------------------\n");
        toabao.inNhanVien();

    }
}
