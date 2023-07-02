package oop;

import java.util.Random;

public class contBancar {

    //program file = definim logica unui cont bancar

    //proprietati = atribute =fields

    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 8888;
    int incercariActivare ;

    //constructor = are rolul de a impune date de start

    public contBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    //metode = actiunile clasei

    public void interogareSold(){
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ " + this.activ);
        System.out.println("Numar de incercari gresite: "  + this.incercariActivare);
        System.out.println("-----------------------------------------------------------------");
    }

    public void ActivareCont(int pinUtilizator){
        //modofica statusul activ in true doar daca pinul e corect

        System.out.println("Buna " + this.titularCont);
         if(pinUtilizator == this.pin){
             this.activ = true;
             System.out.println("Contul a fost activat cu succes");

         }else{
             System.out.println("Pin activare gresit");
             this.incercariActivare++; //incrementare

         }
    }

    public void alimentareCont(double suma_depusa){
        //la ce aveam in cont se adauga suma depusa(la this.sold)
        this.sold = this.sold + suma_depusa;
        System.out.println("Buna " + this.titularCont);
        System.out.println("Ati depus cu succes suma de " + suma_depusa +  "Aveti in cont suma de " + this.sold);

    }

    public void plataCard(double suma_cheltuita){
        System.out.println("Buna " + this.titularCont);
        //pot sa cheltuiesc doar ce am
        //daca suma cheltuita este mai mica sau egala cu soldul

        if(suma_cheltuita<= this.sold){
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai : " + this.sold);
        } else {
            System.out.println("Fonduri insufieciente");

        }
    }


}
