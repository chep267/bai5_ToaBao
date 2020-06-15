package bth_5;


import java.io.File;

public class Ktra {

    private void fetchChild(File file) {

        System.out.println(file.getAbsolutePath());

        if (file.isDirectory()) {

            File[] children = file.listFiles();

            for (File child : children) {
                // Đệ quy (Recursive)
                this.fetchChild(child);
            }
        }

    }

    public static void main(String[] args) {
        Ktra example = new Ktra();
        File f = new File("/home/dongnt");
        example.fetchChild(f);

    }

}
