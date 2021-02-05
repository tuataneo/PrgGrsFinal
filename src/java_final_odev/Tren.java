package java_final_odev;

/**
 *
 * @author ilker
 */
public class Tren extends Arac {

    boolean isYolcuTren;
    int vagonSayisi;

    public Tren(boolean isYolcuTren, int vagonSayisi, String marka, String model, String yakit, int yakitKapasitesi, double kalanYakit) {
        super(marka, model, yakit, yakitKapasitesi, kalanYakit);
        this.isYolcuTren = isYolcuTren;
        this.vagonSayisi = vagonSayisi;
    }

    void vagonEkle(int vagon) {
        vagonSayisi += vagon;
    }
}
