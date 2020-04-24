package contoh2;

public class Kendaraan {
    protected String Jenis;
    protected String Merek;

    /* Default Constructor */
    public Kendaraan() {
        System.out.println("Inside Kendaraan: Constructor");
        Jenis = "";
        Merek = "";
    }

    /**
     * Constructor dengan dua parameter
     */

    public Kendaraan(String Jenis, String Merek) {
        this.Jenis = Jenis;
        this.Merek = Merek;
    }

    /**
     * Method Accessor
     */

    public String getJenis() {
        System.out.println("Jenis: " + Jenis);
        return Jenis;
    }

    public String getMerek(){
        return Merek;
    }

    public void setJenis(String jenis) {
        this.Jenis = jenis;
    }

    public void setMerek(String merek) {
        Merek = merek;
    }
}
