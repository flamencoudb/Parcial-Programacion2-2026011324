public abstract class Empleado {
    String nombre;
    double ventasMes;
    EstrategiaComision estrategia;

    public Empleado(String nombre, double ventasMes, EstrategiaComision estrategia) {
        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    public void cambiarEstrategia(EstrategiaComision nueva) {
        this.estrategia = nueva;
    }

    public abstract void mostrarDetalle();
}