/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cerca_vocali;

/**
 *
 * @author riccardi_francesco
 */
public class DatiCondivisi {
    String frase;
    int Contaa, Contae ,Contao ,Contai ,Contau;
    char a , e , i , o , u ;

    public DatiCondivisi(String frase, int Contaa, int Contae, int Contao, int Contai, int Contau) {
        this.frase = frase;
        this.Contaa = Contaa;
        this.Contae = Contae;
        this.Contao = Contao;
        this.Contai = Contai;
        this.Contau = Contau;
    }
    
    public DatiCondivisi() {
        this.frase = "";
        this.Contaa = 0;
        this.Contae = 0;
        this.Contao = 0;
        this.Contai = 0;
        this.Contau = 0;
    }

    public String getFrase() {
        return frase;
    }

    public int getContaa() {
        return Contaa;
    }

    public int getContae() {
        return Contae;
    }

    public int getContao() {
        return Contao;
    }

    public int getContai() {
        return Contai;
    }

    public int getContau() {
        return Contau;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setContaa(int Contaa) {
        this.Contaa = Contaa;
    }

    public void setContae(int Contae) {
        this.Contae = Contae;
    }

    public void setContao(int Contao) {
        this.Contao = Contao;
    }

    public void setContai(int Contai) {
        this.Contai = Contai;
    }

    public void setContau(int Contau) {
        this.Contau = Contau;
    }
    
    
    
    
}
