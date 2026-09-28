public class ComisionPersonalizada implements EstrategiaComision {

    public double calcularComision(double montoVenta) {
        int n = 5; // "Jairo" tiene 5 letras
        double porcentaje = 5 + n; // 5 + 5 = 10
        return montoVenta * porcentaje / 100;
    }
}