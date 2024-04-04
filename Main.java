public class Main {
        public static void main(String[] args) {

            // Pruebas para la clase Persona
            System.out.println("Pruebas para la clase Persona:");
            Persona persona = new Persona(30);
            persona.calcularEdadDetallada();

            System.out.println();

            // Pruebas para la clase Cuadrado
            System.out.println("Pruebas para la clase Cuadrado:");
            Cuadrado cuadrado = new Cuadrado(5);
            System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
            System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());


            // Pruebas para la clase Circulo
            System.out.println("Pruebas para la clase Circulo:");
            Circulo circulo = new Circulo(5);
            System.out.println("Área del círculo: " + circulo.calcularArea());
            System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());


            // Pruebas para la clase Triangulo
            System.out.println("Pruebas para la clase Triangulo:");
            Triangulo triangulo = new Triangulo(3, 4, 5);
            System.out.println("Área del triángulo: " + triangulo.calcularArea());
            System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
            System.out.println("Hipotenusa del triángulo: " + triangulo.calcularHipotenusa());
        }
    }

