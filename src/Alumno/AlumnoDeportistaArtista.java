package Alumno;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private int IDActExt;
    private String Deporte;
    private String Artes;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(String nombre, int edad, int numeroCuenta, String carrera, double promedio, int IDActExt, String deporte, String artes) {
        super(nombre, edad, numeroCuenta, carrera, promedio);
        this.IDActExt = IDActExt;
        this.Deporte = deporte;
        this.Artes = artes;
    }

    public int getIDActExt() {
        return IDActExt;
    }

    public void setIDActExt(int IDActExt) {
        this.IDActExt = IDActExt;
    }

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String deporte) {
        Deporte = deporte;
    }

    public String getArtes() {
        return Artes;
    }

    public void setArtes(String artes) {
        Artes = artes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AlumnoDeportistaArtista{" +
                "IDActExt=" + IDActExt +
                ", Deporte='" + Deporte + '\'' +
                ", Artes='" + Artes + '\'' +
                '}';
    }

    @Override
    public int Ensayar(String Disciplina) {
        System.out.println("El alumno esta ensayando " + this.Artes);
        return 2;
    }

    @Override
    public boolean PresentarObra() {
        System.out.println(getNombre() + " esta presentando obra...");
        return true;
    }

    @Override
    public int Entrenar() {
        System.out.println(getNombre() + " esta entrenando el deporte " + Deporte);
        return 2;
    }

    @Override
    public boolean Competir(String Ubicacion) {
        System.out.println(getNombre() + " esta compitiendo en el deporte " + Deporte);
        return true;
    }
}
