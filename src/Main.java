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


        System.out.println("----------------------------------");
        Titulo titulo = new Titulo("");
        Titulo t1 = new Titulo("Counter Strike 2");
        Titulo t2 = new Titulo("Fortnite");
        Titulo t3 = new Titulo("Minecraft");
        Titulo t4 = new Titulo("Gta v");
        Titulo t5 = new Titulo("Among Us");

        List<Titulo> listaDeJogos = new ArrayList<>();
        listaDeJogos.add(t1);
        listaDeJogos.add(t2);
        listaDeJogos.add(t3);
        listaDeJogos.add(t4);
        listaDeJogos.add(t5);

        System.out.println(listaDeJogos);
        Collections.sort(listaDeJogos);

        System.out.println("Exibindo jogos depois de realizar a ordenação através do sort");
        System.out.println(listaDeJogos);

    }
};
