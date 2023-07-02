import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {

        //declaram o lista goala

        List<String> fructe = new ArrayList<>();

        //adaugam elem in liste

        fructe.add("mar");
        fructe.add("pere");
        fructe.add("portocale");

        //cum se extrag elem din lista

        System.out.println(fructe.get(0));

        //cum se afla indexul unui elem
        System.out.println(fructe.indexOf("pere"));



        //scoatem un element
        fructe.remove("mar");

        //listam elemente
        System.out.println(Arrays.toString(fructe.toArray()));

        if (!fructe.isEmpty()){ //daca nu este goala lista
            System.out.println("avem fructe azi");
        }else {
            System.out.println("Nu avem fructe azi");
        }
        //eliminam elemente din liste
        fructe.clear();

        //declaram o lista si initializam o lista cand simt elem

        List<Integer> list = Arrays.asList(new Integer[]{1, 4, 7});
        System.out.println(Arrays.toString(list.toArray()));

        //declaram o lista dinamica
        String [] flori = {"lalea", "Bujor", "Crin"};
        List <String> floriList = new ArrayList<>(Arrays.asList(flori));
        floriList.add("Trandafir");
        System.out.println(Arrays.toString(floriList.toArray()));

        //aflam indexul unui elem

        int bujor_index = floriList.indexOf("Bujor");
        //stergem indexul
        floriList.remove(bujor_index);
        System.out.println(Arrays.toString(floriList.toArray()));




    }
}
