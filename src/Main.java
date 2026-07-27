import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main{
    static void main() {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(5);
        numeros.add(23);
        numeros.add(11);
        numeros.add(7);
        numeros.add(50);
        numeros.add(0);
        numeros.add(101);
        numeros.add(3);
        numeros.add(4);
        numeros.add(4);
        System.out.println(numeros);

        Collections.sort(numeros);
        System.out.println("Lista de números depois da ordenação");
        System.out.println(numeros);

    }
};
