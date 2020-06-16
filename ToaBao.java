package ToaBao;

import java.util.Scanner;
import java.lang.*;

public class ToaBao {
    int[] loaiNV;
    String tenTB;
    String[] tenNV;
    String[] tenNB;
    String[]  chucvu;
    int[] sobaidang;

    ToaBao(int n){
        loaiNV = new int[n];
        tenNV = new String[n];
        chucvu = new String[n];
        sobaidang = new int[n];
    }
    public void intheNV(int n){
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhan vien thu: "+(i+1));
            System.out.print("\n\tHo ten: "+tenNV[i]);
            if(loaiNV[i]==2){
                System.out.print("\n\tLoai nhan vien : nhan vien hanh chinh");
                System.out.print("\n\tChuc vu: "+ chucvu[i]);
            }else if(loaiNV[i]==1){
                System.out.print("\n\tLoai nhan vien : nha bao");
                System.out.print("\n\tSo bai dang: "+ sobaidang[i]);
            }
        }
    }

    public void innv(int n){
        for (int i = 0; i < n; i++) {
            if(loaiNV[i]==2){
                System.out.print("\n\tHo ten: "+tenNV[i]);
                System.out.print("\n\tChuc vu: "+ chucvu[i]);
            }
        }
    }
    public void innb(int n){
        for (int i = 0; i < n; i++) {
            if(loaiNV[i]==1){
                System.out.print("\n\tHo ten: "+tenNV[i]);
                System.out.print("\n\tSo bai dang: "+ sobaidang[i]);
            }
        }
    }
    public void them(int n){
        Scanner sc = new Scanner(System.in);
        int d; String bodem;
        System.out.print("\nNhap thong tin nhan vien moi: ");
        System.out.print("\n\tNhap ho ten: ");
        tenNV[n]= sc.nextLine();
        do{
            System.out.print("\n\tChon loai nv: \n\t\t1. Nha bao\n\t\t2.Nhan vien hanh chinh\n\t\tBan chon:  ");
            d = sc.nextInt();
            bodem = sc.nextLine();
            switch (d){
                case 1:
                    loaiNV[n] = d;
                case 2:
                    loaiNV[n] = d;
            }
            if (d!=1 && d!=2){
                System.out.print("\nChuc vu khong co! Hay chon lai!");
            }
        }while (d!=1 && d!=2);

        if(d==1){
            System.out.print("\n\tNhap so bai viet: ");
            sobaidang[n]= sc.nextInt();
            bodem = sc.nextLine();
        }
        if(d==2){
            System.out.print("\n\tNhap chuc vu: ");
            chucvu[n]= sc.nextLine();
        }
    }

    public void xoa(int n){
        System.out.print("\nDanh sach nv hien tai: ");
        intheNV(n);
        Scanner sc = new Scanner(System.in);
        int dem =0;
        do {
            System.out.print("\nNhap ten nhan vien can xoa: ");
            String ten = sc.nextLine(); String bodem;
            System.out.print("\nLoai nhan vien la: \n\t\t1. Nha bao\n\t\t2.Nhan vien hanh chinh\n\t\tBan chon:  ");
            int cv = sc.nextInt();
            bodem = sc.nextLine();
            for (int i = 0; i < n; i++) {
                if(tenNV[i].equals(ten) && loaiNV[i] == cv){
                    dem++;
                    for (i = i; i < n-1; i++) {
                        tenNV[i] = tenNV[i+1];
                        loaiNV[i] = loaiNV[i+1];
                        sobaidang[i] = sobaidang[i+1];
                        chucvu[i] = chucvu[i+1];
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

    public void chuyen(int n){
        System.out.print("\nDanh sach nv hien tai: ");
        intheNV(n);
        System.out.print("\nBan muon chuyen vi tri nao: ");
        Scanner sc = new Scanner(System.in);
        int dem =0; int vt;
        do {
            System.out.print("\nNhap vi tri can chuyen: ");
            vt = sc.nextInt();
            String bodem = sc.nextLine();

            if(vt<=0 || vt>n) {
                System.out.print("\nK co vi tri da chon! Xin hay chon lai! ");
            }else {
                vt--;
                if(loaiNV[vt]==1) {
                    loaiNV[vt] = 2;
                    sobaidang[vt] = 0;
                    chucvu[vt] = "nha vien hoc viec";
                }else if(loaiNV[vt]==2) {
                    loaiNV[vt] = 1;
                    chucvu[vt] = "nha bao";
                    sobaidang[vt] = 0;
                }
                System.out.print("\nBan da chuyen thanh cong! \nDanh sach moi la: ");
                intheNV(n);
            }
        }while (vt<=0 || vt>n);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToaBao a = new ToaBao(100);
        System.out.print("\nNhap ten toa bao: ");
        a.tenTB = sc.nextLine();
        int n; String bodem;
        System.out.print("\nNhap so nhan vien: ");
        n = sc.nextInt();
        bodem = sc.nextLine();
        int d;
        for (int i = 0; i < n; i++) {
            System.out.print("\nNhap thong tin nhan vien thu : "+(i+1));
            System.out.print("\n\tNhap ho ten: ");
            a.tenNV[i]= sc.nextLine();

            do{
                System.out.print("\n\tChon loai nv: \n\t\t1. Nha bao\n\t\t2.Nhan vien hanh chinh\n\t\tBan chon:  ");
                d = sc.nextInt();
                bodem = sc.nextLine();
                switch (d){
                    case 1:
                        a.loaiNV[i] = d;
                    case 2:
                        a.loaiNV[i] = d;
                }
                if (d!=1 && d!=2){
                    System.out.print("\nChuc vu khong co! Hay chon lai!");
                }
            }while (d!=1 && d!=2);

            if(d==1){
                System.out.print("\n\tNhap so bai viet: ");
                a.sobaidang[i]= sc.nextInt();
                bodem = sc.nextLine();
                a.chucvu[i] = "khong";
            }
            if(d==2){
                System.out.print("\n\tNhap chuc vu: ");
                a.chucvu[i]= sc.nextLine();
                a.sobaidang[i] = 0;
            }
        }
        System.out.print("\n---------------------------\n");
        System.out.print("\nIn the nhan vien: ");
        a.intheNV(n);
        System.out.print("\nDanh sach nhan vien: ");
        a.innv(n);
        System.out.print("\nDanh sach nha bao: ");
        a.innb(n);


        System.out.print("\n\n---------------------------\n");
        a.them(n); n++;
        System.out.print("\nDanh sach moi: ");
        a.intheNV(n);

        System.out.print("\n\n---------------------------\n");
        a.xoa(n); n--;
        System.out.print("\nDanh sach moi: ");
        a.intheNV(n);


        System.out.print("\n\n---------------------------\n");
        a.chuyen(n);
    }
}
