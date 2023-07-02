public class Array {
    public static void main(String[] args) {
        //declarare si initializare cand stim valorile

        String[] students = {"Ada", "Ion", "Ela", "Mari", "Ana"};//array de stringuri
        int[] numbers = {1, 34, 99};//array de inturi

        System.out.println(students[4]);

        students[4] = "Sebi";
        System.out.println(students[4]);
        System.out.println(students.length);
        System.out.println(students[4] + " " + students[0]);//concatenare de stringuri
        System.out.println(students.length + 5);//adunare

        //sa printam tot timpul ultimul element indiferent de marime
        System.out.println("Last place: " + students[students.length - 1]);

        //declarare si alocare de memorie-unde nu stim valorile initiale

        int[] note = new int[5];
        note[0]= 8;





    }
}
