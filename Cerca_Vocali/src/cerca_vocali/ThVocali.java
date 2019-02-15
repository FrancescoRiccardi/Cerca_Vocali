/*
*@author riccardi_francesco
*
*/
package cerca_vocali;
/*
*@author riccardi_francesco
*
*@brief la classe contiene il thread e svolge la ricerca
*
*/
public class ThVocali extends Thread {
    DatiCondivisi Dati = new DatiCondivisi();
   
    
    /*
    *@author riccardi_francesco
    *
    *conterrà la vocale da cercare
    *
    */
    char v;
    /*
    *@author riccardi_francesco
    *
    *conterrà la lunghezza della frase
    *
    */
    int l;
    
    
    public ThVocali( char V){
        
        this.v=V;
    }
    

    /*
    *@author riccardi_francesco
    *
    *@brief calcola la lunghezza della frase, con un for e un if confronta tutte le lettere della frase alla vocale da cercare, e se la trova la stampa
    *
    */
    public void run() {
        
        l=Dati.getFrase().length();
        System.out.println("yuppi");
        for (int i=0;i<l;i++){
            System.out.println("yeh");
            if (Dati.getFrase().charAt(i)==v){
                 System.out.println("yeh");
                if(v=='a'){
                    Dati.Contaa++;
                }
                if(v=='e'){
                    Dati.Contae++;
                }
                if(v=='i'){
                    Dati.Contai++;
                }
                if(v=='o'){
                    Dati.Contao++;
                }
                if(v=='u'){
                    Dati.Contau++;
                }
                
            }
        }
        
    }
}
