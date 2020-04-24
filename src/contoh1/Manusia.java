package contoh1;

public class Manusia {
    protected String Nama;
    protected String Alamat;

    /* Default Constructor */
    public Manusia() {
        System.out.println("Inside contoh1.Manusia:Constructor");
        Nama = "";
        Alamat = "";
    }

    /* Constructor Dengan Dua Parameter
    public contoh1.Manusia(String Nama, String Alamat) {
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
     */

    /*
    Method Accessor
     */

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }


}
