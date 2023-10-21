package n1exercici1.classes;

public class TreballadorPresencial extends Treballador{

    private static float benzina =  50;
    public TreballadorPresencial(String nom, String cognoms, float preuHora) {
        super(nom, cognoms, preuHora);
    }

    @Override
    public float calcularSou(int hores) {
        return hores*preuHora + benzina;
    }
}
