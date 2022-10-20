package Main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuInfantilTest {

    @Test

    public void calcularPrecioMenuInfalntil_seEsperaCalculoCorrectodelPrecio(){
        //GIVEN
        MenuInfantil menu1 = new MenuInfantil(30.0,3);;
        Double resultadoEsperado = 39.0;

        //WHEN
        Double resultado = menu1.calcularPrecio();

        //THEN
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test

    public void calcularPrecioMenuInfalntil_seEsperaCalculoIncorrectodelPrecio(){
        //GIVEN
        MenuInfantil menu1 = new MenuInfantil(40.5,2);;
        Double resultadoErrado = 25.7;

        //WHEN
        Double resultado = menu1.calcularPrecio();

        //THEN
        Assertions.assertEquals(resultadoErrado, resultado);

    }


}