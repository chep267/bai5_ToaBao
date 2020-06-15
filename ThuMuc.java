package bth_5;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThuMuc extends file{

    public void mo(File file) {

        System.out.println(file.getAbsolutePath());

        if (file.isDirectory()) {

            File[] children = file.listFiles();

            for (File child : children) {
                // Đệ quy (Recursive)
                this.mo(child);
                this.run(child);
            }
        }
    }
}

class file {
    file vb;
    file thucthi;

    public void run(File f){
        if (!f.isFile()) {
            System.out.print("\n\n\n"+f.getName()+" la file thuc thi.\n");
        }
        if (f.getAbsolutePath().endsWith(".txt")) {
            System.out.print("\n\n\n"+f.getName()+" la file van ban.\n");
        }
    }

}
