package Main;

public class MenuInfantil extends Menu{

    private Double precioBase;
    private int cantidadJuguetes;

     public MenuInfantil(Double precioBase, int cantidadJuguetes) {
        this.precioBase = precioBase;
        this.cantidadJuguetes = cantidadJuguetes;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public int getCantidadJuguetes() {
        return cantidadJuguetes;
    }

    public void setCantidadJuguetes(int cantidadJuguetes) {
        this.cantidadJuguetes = cantidadJuguetes;
    }

    @Override
    public double calcularPrecio() {
        Double precioTotal= precioBase + this.cantidadJuguetes*3;
        System.out.println("El precio total a pagar es: "+ precioTotal);
        return precioTotal;
    }


    @Override
    void armarMenu() {
        System.out.println("Recuerda adicionar " + getCantidadJuguetes() + " juguetes");
    }


}
