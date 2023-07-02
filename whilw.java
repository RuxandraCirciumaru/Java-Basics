public class whilw {
    public static void main(String[] args) {
        // while - loop sau un ciclu repetitiv. o zona de cod care se repeta atat timp cat o conditie e true

        //problema : masina merge cat timp are benzina

        int litrii_benzina = 10 ;

        while (litrii_benzina > 0 ){
            //acceleram
            System.out.println("Vruum");
            //scade benzina
            litrii_benzina = litrii_benzina - 1;
            //aprindem becul cand avem mai putin de 3 litri

            if (litrii_benzina <= 3){
                System.out.println("Se aprinde becul rosu");
            }

        }
        System.out.println("Nu mai avem benzina");
    }
}
