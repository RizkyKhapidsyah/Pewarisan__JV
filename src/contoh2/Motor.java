package contoh2;

public class Motor extends Kendaraan {
    public String getJenis() {
        System.out.println("Jenis : " + Jenis);
        return Jenis;
    }

    public static void main(String[] args) {
        Kendaraan ref;
        Mobil mobilObject = new Mobil();
        Motor motorObject = new Motor();

        ref = mobilObject;
        String temp = ref.getJenis();

        System.out.println(temp);

        ref = motorObject;
        temp = ref.getMerek();
        System.out.println(temp);
    }
}
