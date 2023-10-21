package n1exercici1.classes;

public class TreballadorOnline extends Treballador{
    private static final float TARIFA_PLANA = 40;
    public TreballadorOnline(String nom, String cognoms, float preuHora) {
        super(nom, cognoms, preuHora);
    }

    @Override
    public float calcularSou(int hores) {
        return hores*preuHora + TARIFA_PLANA;
    }
}
