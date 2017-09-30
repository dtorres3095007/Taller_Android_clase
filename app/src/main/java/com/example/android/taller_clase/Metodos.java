package com.example.android.taller_clase;

/**
 * Created by android on 30/09/2017.
 */

public class Metodos {

    public static double Validar(int opcion_genero,int opcion_tipo,int opcion_marca,int num){
      double valor = 0;

            if (opcion_genero == 0) {
                if (opcion_tipo == 0) {
                    if (opcion_marca == 0) {
                        valor = 120000;
                    } else if (opcion_marca == 1) {
                        valor = 140000;
                    } else if (opcion_marca == 2) {
                        valor = 130000;
                    }
                } else {
                    if (opcion_marca == 0) {
                        valor = 50000;
                    } else if (opcion_marca == 1) {
                        valor = 80000;
                    } else if (opcion_marca == 2) {
                        valor = 100000;
                    }
                }
            } else {
                if (opcion_tipo == 0) {
                    if (opcion_marca == 0) {

                        valor = 100000;
                    } else if (opcion_marca == 1) {
                        valor = 130000;
                    } else if (opcion_marca == 2) {
                        valor = 110000;
                    }
                } else {
                    if (opcion_marca == 0) {
                        valor = 60000;
                    } else if (opcion_marca == 1) {
                        valor = 70000;
                    } else if (opcion_marca == 2) {
                        valor = 120000;
                    }
                }
            }
            return valor;


    }

    public static boolean ValidarCampos(String num){
        if(num.length() == 0) return false;
        if(Integer.parseInt(num) < 1) return false;
        return true;
    }
}
