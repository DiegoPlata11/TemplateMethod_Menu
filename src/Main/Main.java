package Main;

public class Main {

    public static void main(String[] args) {
        MenuInfantil menu1 = new MenuInfantil(30.0,3);
        MenuVegeteriano menu2 = new MenuVegeteriano(30.5,true,3);
        MenuVegeteriano menu3 = new MenuVegeteriano(30.5,false,2);
        MenuClasico menu4 = new MenuClasico(30.5);

        menu1.prepararMenu();
        menu2.prepararMenu();
        menu3.prepararMenu();
        menu4.prepararMenu();

    }
}
