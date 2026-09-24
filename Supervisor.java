package Ejercio_AeroValle;

public class Supervisor extends Empleados {
    private int equipoSupervisado;
    private static final double BONO_POR_EQUIPO = 500.0;

public Supervisor(String nombre, String id, double salarioBase, int equipoSupervisado) {
    super(nombre, id, salarioBase);
    this.equipoSupervisado = equipoSupervisado;
}

@Override
    public double calcularSalario() {
        return super.calcularSalario() + (equipoSupervisado * BONO_POR_EQUIPO);
    }
}