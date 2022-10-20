package Main;

public class MenuVegeteriano extends Menu{

    private Double precioBase;
    private boolean adicionarEspecias;
    private int cantidadSalsasVegetarianas;

    public MenuVegeteriano(Double precioBase, boolean adicionarEspecias, int cantidadSalsasVegetarianas) {
        this.precioBase = precioBase;
        this.adicionarEspecias = adicionarEspecias;
        this.cantidadSalsasVegetarianas = cantidadSalsasVegetarianas;
    }

    public Double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isAdicionarEspecias() {
        return adicionarEspecias;
    }

    public void setAdicionarEspecias(boolean adicionarEspecias) {
        this.adicionarEspecias = adicionarEspecias;
    }

    public int getCantidadSalsasVegetarianas() {
        return cantidadSalsasVegetarianas;
    }

    public void setCantidadSalsasVegetarianas(int cantidadSalsasVegetarianas) {
        this.cantidadSalsasVegetarianas = cantidadSalsasVegetarianas;
    }

    @Override
    public double calcularPrecio() {
        if (adicionarEspecias==true) {
            Double PrecioTotal = precioBase*1.01 + 2*cantidadSalsasVegetarianas;
            System.out.println("El precio total a pagar es: "+ PrecioTotal);
            return PrecioTotal;
        }
        else{
            Double PrecioTotal = precioBase + 2*cantidadSalsasVegetarianas;
            System.out.println("El precio total a pagar es: "+ PrecioTotal);
            return PrecioTotal;
        }

    }

    @Override
    void armarMenu() {
        if (adicionarEspecias==true){
            System.out.println("Adicionar especias y " +getCantidadSalsasVegetarianas() + " salsas vegetarianas");
        }
        else{
            System.out.println("Adicionar " +getCantidadSalsasVegetarianas() + " salsas vegetarianas");
        }



    }
}
