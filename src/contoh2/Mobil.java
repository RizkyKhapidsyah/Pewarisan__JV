package contoh2;

public class Mobil extends Kendaraan {
    public Mobil() {
        //super("SomeJenis", "SomeMerek");
        //super();
        //super.jenis = "Jenis";
        System.out.println("Inside Mobil: Constructor");
    }

    public String getJenis() {
        System.out.println("Jenis : " + Jenis);
        return Jenis;
    }

    public static void main(String[] args) {
        Mobil RizkyKhapidsyah = new Mobil();
    }
}
