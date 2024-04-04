import java.time.LocalDate;
import java.time.Period;

public class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    //metodo
    public void calcularEdadDetallada() {
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = fechaActual.minusYears(edad);
        Period periodo = Period.between(fechaNacimiento, fechaActual);

        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int días = periodo.getDays();

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }
}



