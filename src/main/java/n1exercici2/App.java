package n1exercici2;

import n1exercici2.classes.Treballador;
import n1exercici2.classes.TreballadorOnline;
import n1exercici2.classes.TreballadorPresencial;

public class App {
    public static void main (String[] args) {

        System.out.println("Creem tres versions del mateix treballador: una genèrica, una presencial, i una online, amb les mateixes dades.");
        Treballador treballador = new Treballador("Manel", "Sole", 10);
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Manel", "Sole", 10);
        TreballadorOnline treballadorOnline = new TreballadorOnline("Manel", "Sole",   10);

        System.out.println("Comprovem que el mètode calcular sou retorna valors diferents per cada versió.");
        System.out.println("Treballador: " + treballador.calcularSou(40));
        System.out.println("Treballador presencial: " + treballadorPresencial.calcularSou(40));
        System.out.println("Treballador online: " + treballadorOnline.calcularSou(40));

        callDeprecatedMethod(treballadorOnline);
    }

    @SuppressWarnings("deprecation")
    public static void callDeprecatedMethod(TreballadorOnline treballadorOnline) {
        treballadorOnline.deprecatedMethod();
    }
}
