import org.upiiz.ipn.Director;
import org.upiiz.ipn.Docente;
import org.upiiz.ipn.Empleado;

public class Main {

    // https://github.com/JesusGonzalez7777/Ejercicio_14_C-A-Herencia_Abstracta-Empleados.git

    public static void main(String[] args) {
        //Docente
        Docente docente1 = new Docente("Lucia", "261019", "Zacatecas", "Alimentos");
        //Metodos en negrita - Metodos propios de la clase
        //Metodos "normales" - Metodos heredados
        docente1.setPrecioPorHora(400);
        docente1.setHorasTrabajadas(40);
        docente1.mostrarInformacion();
        docente1.setBono(5000);
        docente1.setAguinaldo(30000);
        System.out.println("Salario anual: " + docente1.calcularSalarioAnual());

        //Director
        Director director1 = new Director("Jason", "261020", "Zacatenco", "2026-2034");
        director1.setSueldoBase(27000);
        director1.mostrarInformacion();
        director1.setBono(7000);
        director1.setAguinaldo(77000);
        System.out.println("Salario anual: " + director1.calcularSalarioAnual());


    }
}

