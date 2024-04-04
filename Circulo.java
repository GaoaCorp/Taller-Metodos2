public class Circulo {
    private double radio;
    private static final double PI = 3.14159;

    public Circulo(double radio) {
        this.radio = radio;
    }

    //metodo1
    public double calcularArea() {
        return PI * radio * radio;
    }

    //metodo2
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }


    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

}

