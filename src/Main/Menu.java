package Main;

public abstract class Menu {

    final void prepararMenu(){
        alistarMateriaPrima();
        armarMenu();
        calcularPrecio();
        entregarPedido();
        fin();
    }

    private void fin() {
        System.out.println("____________________________");
    }

    abstract double calcularPrecio();
    private void entregarPedido() {
        System.out.println("Entregar el pedido al cliente");
    }
    abstract void armarMenu();

    private void alistarMateriaPrima() {
        System.out.println("Alistar la materia prima para preparar el menú");
    }
}
