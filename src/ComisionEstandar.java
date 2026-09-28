public class ComisionEstandar implements EstrategiaComision {

    public double calcularComision(double montoVenta) {
        return montoVenta * 0.05;
    }
}