public class functii {
    //functie = logica delimitata care poate fi refolosita

    //o functie simpla care ne printeaza ceva pe ecran,nu ne da niciun raspuns(nu da return) si nu are parametrii

    public static void printGreeting (){
        System.out.println("Bine ati venit");
    }
    // o funct care saluta clientul in funct de numele lui
    //nu are return
    //are nevoie de parametrii

    public static void printGreetingByName(String nume,String prenume){
        System.out.println("Buna ziua  " + nume  +  prenume);
    }

    // o funct care calculeaza meida a 3 numere
    //are return
    //are nevoie de parametrii

    //ce tip de date va avea raspunsul - double

    public static double media (double a , double b , double c){
        double media = (a + b + c)/3;
        return media;

    }
    // o funct care ne da valorile lui pi
    //are raspuns?- da - are return
    //are nevoie de parametrii?
    //nu

    public static double piValue(){

        //constanta - variabila care nu poate fi suprascrisa

        final double PI = 3.14;
        return PI;
        }




    public static void main(String[] args) {
        //intra clientul 1
        printGreeting(); //se apeleaza functia

        //intra clientul 2
        printGreeting();

        //apelam o functie cu parametrii oferind argumente
        printGreetingByName("Circiumaru","Ruxandra");
        printGreetingByName("Circiumaru","Ofelia");

        System.out.println(media(2,5,7));
        double media1 = media(12342,5637,786);
        double media2 = media(675,987,8564);
        System.out.println(media1);
        System.out.println(media2);

        System.out.println(piValue());
        }

    }


