package n2i3exercici1.classes;

@JSONSerializable (destinationPath = "src/main/java/n2exercici1/output")
public class Treballador {
    protected String nom;
    protected String cognom;
    protected float preuHora;

    public Treballador(String nom, String cognom, float preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public String getNom() {
        return nom;
    }
    public String getCognom() {
        return cognom;
    }

    public float getPreuHora() {
        return preuHora;
    }


    public float calcularSou(int hores) {
        return hores*preuHora;
    }
}
