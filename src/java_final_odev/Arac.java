package java_final_odev;

/**
 *
 * @author ilker
 */
public class Arac {

    String marka;
    String model;
    String yakit;
    int yakitKapasitesi;
    double kalanYakit;

    public Arac(String marka, String model, String yakit, int yakitKapasitesi, double kalanYakit) {
        this.marka = marka;
        this.model = model;
        this.yakit = yakit;
        this.yakitKapasitesi = yakitKapasitesi;
        this.kalanYakit = kalanYakit;
    }

    void yakitEkle(double miktar) {
        if (miktar + kalanYakit < yakitKapasitesi) {
            yakitKapasitesi += miktar;
        }
    }

}
