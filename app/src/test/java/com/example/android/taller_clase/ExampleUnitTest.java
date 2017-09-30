package com.example.android.taller_clase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    //TEST ZAPATOS CORRECTOS

    //TEST ZAPATOS TIPO HOMBRES
       //TEST TIPO ZAPATILLA
    @Test
    public void Validando_valor_Hombre_zapatilla_nike_correcto() throws Exception {
        assertEquals(120000, Metodos.Validar(0,0,0,1),0);
    }
    @Test
    public void Validando_valor_Hombre_zapatilla_adidas_correcto() throws Exception {
        assertEquals(140000, Metodos.Validar(0,0,1,1),0);
    }
    @Test
    public void Validando_valor_Hombre_zapatilla_puma_correcto() throws Exception {
        assertEquals(130000, Metodos.Validar(0,0,2,1),0);
    }
    //TEST TIPO CLASICO
    @Test
    public void Validando_valor_Hombre_clasico_nike_correcto() throws Exception {
        assertEquals(50000, Metodos.Validar(0,1,0,1),0);
    }
    @Test
    public void Validando_valor_Hombre_clasico_adidas_correcto() throws Exception {
        assertEquals(80000, Metodos.Validar(0,1,1,1),0);
    }
    @Test
    public void Validando_valor_Hombre_clasico_puma_correcto() throws Exception {
        assertEquals(100000, Metodos.Validar(0,1,2,1),0);
    }
    //TEST ZAPATOS TIPO MUJERES
        //TEST TIPO ZAPATILLA
    @Test
    public void Validando_valor_mujeres_zapatilla_nike_correcto() throws Exception {
        assertEquals(100000, Metodos.Validar(1,0,0,1),0);
    }
    @Test
    public void Validando_valor_mujeres_zapatilla_adidas_correcto() throws Exception {
        assertEquals(130000, Metodos.Validar(1,0,1,1),0);
    }
    @Test
    public void Validando_valor_mujeres_zapatilla_puma_correcto() throws Exception {
        assertEquals(110000, Metodos.Validar(1,0,2,1),0);
    }
    //TEST TIPO CLASICO
    @Test
    public void Validando_valor_mujeres_clasico_nike_correcto() throws Exception {
             assertEquals(60000, Metodos.Validar(1,1,0,1),0);
         }
    @Test
    public void Validando_valor_mujeres_clasico_adidas_correcto() throws Exception {
        assertEquals(70000, Metodos.Validar(1,1,1,1),0);
    }
    @Test
    public void Validando_valor_mujeres_clasico_puma_correcto() throws Exception {
        assertEquals(120000, Metodos.Validar(1,1,2,1),0);
    }


    //TEST ZAPATOS INCORRECTOS

    //TEST ZAPATOS TIPO HOMBRES
    //TEST TIPO ZAPATILLA
    @Test
    public void Validando_valor_Hombre_zapatilla_nike_incorrecto() throws Exception {
        assertNotEquals(140000, Metodos.Validar(0,0,0,1),0);
    }
    @Test
    public void Validando_valor_Hombre_zapatilla_adidas_incorrecto() throws Exception {
        assertNotEquals(145000, Metodos.Validar(0,0,1,1),0);
    }
    @Test
    public void Validando_valor_Hombre_zapatilla_puma_incorrecto() throws Exception {
        assertNotEquals(110000, Metodos.Validar(0,0,2,1),0);
    }
    //TEST TIPO CLASICO
    @Test
    public void Validando_valor_Hombre_clasico_nike_incorrecto() throws Exception {
        assertNotEquals(10000, Metodos.Validar(0,1,0,1),0);
    }
    @Test
    public void Validando_valor_Hombre_clasico_adidas_incorrecto() throws Exception {
        assertNotEquals(87000, Metodos.Validar(0,1,1,1),0);
    }
    @Test
    public void Validando_valor_Hombre_clasico_puma_incorrecto() throws Exception {
        assertNotEquals(190000, Metodos.Validar(0,1,2,1),0);
    }
    //TEST ZAPATOS TIPO MUJERES
    //TEST TIPO ZAPATILLA
    @Test
    public void Validando_valor_mujeres_zapatilla_nike_incorrecto() throws Exception {
        assertNotEquals(160000, Metodos.Validar(1,0,0,1),0);
    }
    @Test
    public void Validando_valor_mujeres_zapatilla_adidas_incorrecto() throws Exception {
        assertNotEquals(140000, Metodos.Validar(1,0,1,1),0);
    }
    @Test
    public void Validando_valor_mujeres_zapatilla_puma_incorrecto() throws Exception {
        assertNotEquals(100000, Metodos.Validar(1,0,2,1),0);
    }
    //TEST TIPO CLASICO
    @Test
    public void Validando_valor_mujeres_clasico_nike_incorrecto() throws Exception {
        assertNotEquals(50000, Metodos.Validar(1,1,0,1),0);
    }
    @Test
    public void Validando_valor_mujeres_clasico_adidas_incorrecto() throws Exception {
        assertNotEquals(90000, Metodos.Validar(1,1,1,1),0);
    }
    @Test
    public void Validando_valor_mujeres_clasico_puma_incorrecto() throws Exception {
        assertNotEquals(190000, Metodos.Validar(1,1,2,1),0);
    }
}