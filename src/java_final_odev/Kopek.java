package java_final_odev;

/**
 *
 * @author ilker
 */
public class Kopek extends Hayvan {

    @Override
    public void hayvanSesi() {
        System.out.println("Köpeğin çıkardığı ses : Hav ");
    }

    @Override
    void yap() {
        System.out.println("Kopek abstract method deeme");
    }

}
