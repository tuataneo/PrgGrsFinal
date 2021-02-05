package java_final_odev;

/**
 *
 * @author ilker
 */
public class Araba extends Arac {

    int koltukSayisi;

    public Araba(int koltukSayisi, String marka, String model, String yakit, int yakitKapasitesi, double kalanYakit) {
        super(marka, model, yakit, yakitKapasitesi, kalanYakit);
        this.koltukSayisi = koltukSayisi;
    }
    
    
}
