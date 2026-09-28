public class Main {
    public static void main(String[] args) {
        Vendedor v = new Vendedor("Jairo", 1000);
        v.cambiarEstrategia(new ComisionEstandar());
        v.mostrarDetalle();
    }
}