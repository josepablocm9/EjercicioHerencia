package Ejercio_AeroValle;

public class AgenteVentas extends Empleados {
    private double ventasRealizadas;
    private static final double BONO_POR_VENTA = 250.0;

    public AgenteVentas(String nombre, String id, double salarioBase, double ventasRealizadas) {
        super(nombre, id, salarioBase); 
        this.ventasRealizadas = ventasRealizadas;
    }

@Override 
    public double calcularSalario() {
        return super.calcularSalario() + (ventasRealizadas * BONO_POR_VENTA);
    }
}
