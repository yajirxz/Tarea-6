package Figura;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cuadrado");
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Área del cuadrado= " + cuadrado.CalcularArea());
        //n
        System.out.println("Círculo");
        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Área del círculo= " + circulo.CalcularArea());

    }
}
