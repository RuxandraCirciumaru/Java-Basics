public class forLoop {
    public static void main(String[] args) {
        //for - structura repetitiva
        //problema : printam 101 dalmatieni

        for (int i = 0 ; i <=101 ; i++){
            System.out.println("Dalmatianul cu numarul : " + i );
        }

        //ne ajuta sa parcurgem un array prin intermediul indexuluui

        int [] numere = {5, 6, 9, 4}; /* numere de 0 = 5 */
        for(int i = 0 ; i < numere.length; i++){
            System.out.println("Elemtul are indexul : " + i + " si valoarea: " + numere[i]);
        }

        //for each - parcurge toate elem din array si ajunge direct la valoare, nu are treaba cu indexul

        for(int numar:numere){
            System.out.println("Numarul este : " + numar);
        }

        String [] culori = {"alb", "rosu", "galben" , "mov"};
        for ( String culoare: culori){
            System.out.println("Culoarea mea este : " + culoare );
        }

        //suma numerelor din array

        int s = 0;
        for(int numar : numere){
            s = s + numar;
        }
        System.out.println(s);

    }
}
