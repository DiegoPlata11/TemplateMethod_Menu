package Main;

public class MenuClasico extends Menu{
    private Double precioBase;

    public MenuClasico(Double precioBase) {
        this.precioBase = precioBase;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    double calcularPrecio() {
        System.out.println("El precio total a pagar es: "+ getPrecioBase());

        return precioBase;
    }
    @Override
    void armarMenu() {
        System.out.println("Armar menu sin adiciones");

    }
}
