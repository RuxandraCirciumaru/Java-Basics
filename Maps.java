import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        //declaram un map
        Map<String, Integer> map = new HashMap<String, Integer>();
        //adaugam elem
        map.put("Ion", 10);
        map.put("Ana", 9);
        map.put("Ela", 7);

        //Aflu notele
        System.out.println("Ana are nota : " + map.get("Ana"));

        //suprascriere/ actualizare valori

        map.replace("Ela", 10);
        System.out.println("Ela si-a marit nota la  " + map.get("Ela") );

        //declaram si initializam
        Map<String, Integer> luni = new HashMap<String, Integer>();
        {
            {
                luni.put("Jan", 1);
                luni.put("Feb", 2);
            }}




    }
}
