package java_final_odev;

/**
 *
 * @author ilker
 */
public class FinalOdev {
    

    public static void main(String[] args) {
        Calisan mehmet = new Calisan();        
        mehmet.setAdi("Mehmet");
        mehmet.setSoyadi("Soy");
        mehmet.setYas(25);
        mehmet.setMaas(3500);
        System.out.println("Maas :"+mehmet.getMaas());
    }

}
