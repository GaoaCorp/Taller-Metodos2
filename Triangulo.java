public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    //metodo1
    public double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    //metodo2
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    //metodo3
    public double calcularHipotenusa() {
        if (esTrianguloRectangulo()) {
            if (lado1 > lado2 && lado1 > lado3) {
                return Math.sqrt(lado1 * lado1 - lado3 * lado3 + lado2 * lado2);
            } else if (lado2 > lado1 && lado2 > lado3) {
                return Math.sqrt(lado2 * lado2 - lado1 * lado1 + lado3 * lado3);
            } else {
                return Math.sqrt(lado3 * lado3 - lado1 * lado1 + lado2 * lado2);
            }
        } else {
            return -1;
        }
    }

    private boolean esTrianguloRectangulo() {
        double[] ladosOrdenados = {lado1 * lado1, lado2 * lado2, lado3 * lado3};
        java.util.Arrays.sort(ladosOrdenados);
        return ladosOrdenados[2] == ladosOrdenados[0] + ladosOrdenados[1];
    }


    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }

}

