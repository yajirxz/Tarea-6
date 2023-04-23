package Alumno;

public class Main {
    public static void main(String[] args){
        AlumnoDeportistaArtista ada = new AlumnoDeportistaArtista();
        ada.setNombre("Yahir");
        ada.setArtes("Pintura");
        ada.setDeporte("Futbol");
        System.out.println(ada);
        ada.Ensayar("Oleo");
        ada.Entrenar();
        ada.Competir("Ecatepec");
    }
}
