package java_final_odev;

/**
 * @author ilker
 */
public class Calisan {

    private String adi, soyadi;
    private int yas;
    private double maas;

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public void yazdir() {
        System.out.println("Ad Soyad :" + adi + " " + soyadi);
        System.out.println("Yaş :" + yas);
        System.out.println("Maaş :" + maas);
    }

}
