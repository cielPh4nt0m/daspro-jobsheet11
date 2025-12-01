public class kubus13 {
  
    //menghitung volume kubus (fungsi)
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }
    //menghitung luas permukaan kubus (fungsi)
    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }
    public static void main(String[] args) {
        int sisi =  4; //pemisalan 

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
