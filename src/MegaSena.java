import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MegaSena {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 60; i++) {
            numeros.add(i);
        }

        Collections.shuffle(numeros);
        List<Integer> escolhidos = numeros.subList(0,6);

        List<Integer> crescente = new ArrayList<>();

        crescente.addAll(escolhidos);
        Collections.sort(crescente);


        System.out.println(crescente);
    }
}
