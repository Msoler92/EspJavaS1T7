package n1exercici2.classes;

public class Treballador {
    protected String nom;
    protected String cognom;
    protected float preuHora;

    public Treballador (String nom, String cognom, float preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public float calcularSou(int hores) {
        return hores*preuHora;
    }
}
