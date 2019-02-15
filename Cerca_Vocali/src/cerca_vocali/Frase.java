/*
*@author riccardi_francesco
*
*@version 1.1
*
*/
package cerca_vocali;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Frase {
/*
*@author riccardi_francesco
*
*@brief serve per richiamare i thread presenti nella classe, passando la vocale da cercare e la frase in cui cercare
*
*/
public static void main(String[] args) throws IOException, InterruptedException {
        DatiCondivisi Dati = new DatiCondivisi();
    
        /*
        *@author riccardi_francesco
        *
        *frase è l'attributo che conterrà la frase scritta
        */
        /*
        *@author riccardi_francesco
        *
        *serve per poter scrivere da tastiera la frase
        *
        */
        BufferedReader console=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Inserisci la frase di cui cercare le vocali");
        /*
        *@author riccardi_francesco
        *
        *legge la frase inserita da tastiera
        *
        */
        Dati.frase=console.readLine();
        
        /*
        *@author riccardi_francesco
        *
        *@brief inizializzo i thread con contenuta la frase e la vocale da cercare
        *
        */
        ThVocali th = new ThVocali('a' );
        ThVocali th1 = new ThVocali('e' );
        ThVocali th2 = new ThVocali('i' );
        ThVocali th3 = new ThVocali('o');
        ThVocali th4 = new ThVocali('u');
        ThVisualizza th5 = new ThVisualizza(Dati);
        /*
        *@author riccardi_francesco
        *
        *@brief eseguo i 5 thread in modo da cercare le vocali
        *
        */
        
        th.start();th1.start();th2.start();th3.start();th4.start();th5.start();
        th.join();th1.join();th2.join();th3.join();th4.join();
        
        
        
        
    }
    
}
