package java_final_odev;

/**
 *
 * @author ilker
 */
public class Kamyon extends Arac {

    int yuklemeKapasitesi;
    int mevcutKapasite;

    public Kamyon(int yuklemeKapasitesi, int mevcutKapasite, String marka, String model, String yakit, int yakitKapasitesi, double kalanYakit) {
        super(marka, model, yakit, yakitKapasitesi, kalanYakit);
        this.yuklemeKapasitesi = yuklemeKapasitesi;
        this.mevcutKapasite = mevcutKapasite;
    }

    void kapasiteYukle(int yuk) {
        if (yuk + mevcutKapasite <= yuklemeKapasitesi) {
            mevcutKapasite += yuk;
        }
    }
}
