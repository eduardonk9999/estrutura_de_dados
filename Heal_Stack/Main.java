class Classe1 {
    Classe2[] classes = new Classe2[] {
        new Classe2(),
        new Classe2()
    };

    void listarValores() {
        for(Classe2 c: classes) {
            System.out.println(c.valor);
        }
        System.out.println("A SOMA DOS VALORES É" + somaValores("xpto", 2.5));
    }

    int somaValores(String param1, double param2) {
        int total = 0;
        for(Classe2 c: classes) {
            total += c.numero;
        }

        return total;
    }
}

class Classe2 {
    int numero = 2;
}

public class Main {
    public static void main(String[] args) {
        Classe1 c1 = new Classe1();
        c1.listarValores();
    }
}