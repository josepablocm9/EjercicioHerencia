package Ejercio_AeroValle;

public class Piloto extends Empleados {
    private int horasVuelo;
    private static final double BONO_POR_HORA = 25.0;

public Piloto(String nombre, String id, double salarioBase, int horasVuelo) {
    super(nombre, id, salarioBase); // (1) constructor del padre
     this.horasVuelo = horasVuelo;
}

@Override
    public double calcularSalario() {
    // (2) reutiliza la lógica del padre y le suma el bono
    return super.calcularSalario() + (horasVuelo * BONO_POR_HORA);
    }
}
