public class Variabile {
    public static void main(String[] args) {
        String marcaMasina = "Volvo";
        String modelMasina = "XC60";

        System.out.println("Am cumparat o masina marca" +  marcaMasina   + " si este modelul  " + modelMasina);

        //suprascriere

        modelMasina = "XC60 facelift";
        System.out.println("Am cumparat o masina marca" +  marcaMasina   + " si este modelul  " + modelMasina);

        String nume = "Circiumaru";
        String prenume = "Ruxandra";
        int varsta = 24;
        System.out.println(prenume  + " " + nume + "cu varsta de " + varsta);//am concatenat stringuri

        //declarare variabile

        String laptop;

        //initializare variabile

        laptop = "Asus";

        System.out.println(laptop);



    }
}
