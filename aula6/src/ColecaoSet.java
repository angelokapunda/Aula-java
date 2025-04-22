import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

    public static void main(String[] args) {

        Set<String> frutas = new HashSet<>();

        frutas.add("Mação");
        frutas.add("Morango");
        frutas.add("Uva");
        frutas.add("Banana");
        frutas.add("Manga");
        frutas.add("mação");

        System.out.println("Morango existe na coleção ? " + frutas.contains("Morango"));

        frutas.remove("Morango");

        Iterator<String> iFrutas = frutas.iterator();

        while (iFrutas.hasNext()) {
            System.out.println(iFrutas.next());
        }

        ArrayList<String> frutasList = new ArrayList<>(frutas);
        frutasList.sort(null);
        System.out.println("Listando com arrayList ordenado: ******************************");
        for (String f: frutasList){
            System.out.println(f);
        }

        System.out.println(frutas);
    }
}
