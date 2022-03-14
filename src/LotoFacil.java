import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LotoFacil{
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();

        for (int i = 1; i<=25; i++){
            numeros.add(i);
        }

        Collections.shuffle(numeros);
        List<Integer> escolhidos = numeros.subList(0,15);

        List<Integer> crescente = new ArrayList<Integer> ();
        crescente.addAll(escolhidos);
        Collections.sort(crescente);
        System.out.println(crescente);




    }

}


