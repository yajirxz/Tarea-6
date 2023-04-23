package Alumno;

public class Alumno extends Persona{
    private int NumeroCuenta;
    private String Carrera;
    private double Promedio;

    public Alumno() {
    }

    public Alumno(int numeroCuenta, String carrera, double promedio) {
        NumeroCuenta = numeroCuenta;
        Carrera = carrera;
        Promedio = promedio;
    }

    public Alumno(String nombre, int edad, int numeroCuenta, String carrera, double promedio) {
        super(nombre, edad);
        NumeroCuenta = numeroCuenta;
        Carrera = carrera;
        Promedio = promedio;
    }

    public int getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        NumeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double promedio) {
        Promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "NumeroCuenta=" + NumeroCuenta +
                ", Carrera='" + Carrera + '\'' +
                ", Promedio=" + Promedio +
                '}';
    }
}
