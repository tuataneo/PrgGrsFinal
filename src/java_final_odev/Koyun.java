package java_final_odev;

/**
 *
 * @author ilker
 */
public class Koyun extends Hayvan {

    @Override
    public void hayvanSesi() {
        System.out.println("Koyunun çıkardığı ses : Mee");
    }

    @Override
    void yap() {
         System.out.println("Koyun abstract method deeme");
    }

}
