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
            }
        }

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
            }
            if(d==2){
                System.out.print("\n\tNhap chuc vu: ");
                a.chucvu[i]= sc.nextLine();
            }
        }

        System.out.print("\nDanh sach nhan vien: ");
        a.intheNV(n);

    }
}
