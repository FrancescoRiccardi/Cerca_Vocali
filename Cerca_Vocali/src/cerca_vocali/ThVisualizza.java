package cerca_vocali;

/**
 *
 * @author riccardi_francesco
 */
public class ThVisualizza extends Thread {
    DatiCondivisi Dati;

    public ThVisualizza(DatiCondivisi Dati) {
        this.Dati = Dati;
    }
    
    
    
    public void run(){
        for (int i=0; i<Dati.Contaa;i++){
            System.out.println("a");
        }
        for (int i=0; i<Dati.Contae;i++){
            System.out.println("e");
        }
        for (int i=0; i<Dati.Contai;i++){
            System.out.println("i");
        }
        for (int i=0; i<Dati.Contao;i++){
            System.out.println("o");
        }
        for (int i=0; i<Dati.Contau;i++){
            System.out.println("u");
        }
}
}
