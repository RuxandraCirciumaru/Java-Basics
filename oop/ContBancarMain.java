package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        //desktop

        //initializam obiecte de tip cont bancar,sunt instante ale clase de tip contBancar
        contBancar cont1 = new contBancar("Ruxandra","Ro001");
        contBancar cont2 = new contBancar("Elena","Ro002");
        cont1.interogareSold();
        cont2.interogareSold();

        //activam conturile
        cont1.ActivareCont(7777);
        cont2.ActivareCont(6666);
        cont1.interogareSold();
        cont2.interogareSold();
        cont2.ActivareCont(8888);
        cont2.interogareSold();
        cont1.ActivareCont(8888);
        cont1.interogareSold();

        //alimentam conturile
        cont2.alimentareCont(398);
        cont1.alimentareCont(450);
        cont1.alimentareCont(435);

        //negative test
        cont2.plataCard(400);//nu
        //pozitive test
        cont1.plataCard(500);//da






    }
}
