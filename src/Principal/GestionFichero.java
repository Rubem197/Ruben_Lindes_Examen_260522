package Principal;

import java.io.*;
import java.util.*;

/**
 * Este metodo usa el Scanner para leer el fichero, lo guarda en una variable String llamada linea, luego la separo
 * por espacios y los voy guardando en el array de String con las partes de la linea, y eso lo voy insertando en la
 * lista cliente de la clase Hospital, para la tabla he tenido que inicializar la tabla y por cada columna, llamar
 * al objeto Concepto.
 */
public class GestionFichero {

    public static List<Hospital> listaSinDuplicados = new ArrayList<>();
    public static Set<Hospital> listaFarmacias = new HashSet<>();

    public static Set<Hospital> leerFichero() {

        Scanner sc = null;
        String linea;
        String[] parte;
        try {
            sc = new Scanner(new FileReader("facturasmezcladas.txt"));

            while (sc.hasNext()) {

                linea = sc.nextLine();
                parte = linea.split(" ");


                listaFarmacias.add(new Hospital(parte[0], parte[1], parte[2], parte[3],
                        new Concepto[]{new Concepto(parte[4], Double.parseDouble(parte[5]), Double.parseDouble(parte[6])),
                                new Concepto(parte[7], Double.parseDouble(parte[8]), Double.parseDouble(parte[9])),
                                new Concepto(parte[10], Double.parseDouble(parte[11]), Double.parseDouble(parte[12])),
                                new Concepto(parte[13], Double.parseDouble(parte[14]), Double.parseDouble(parte[15]))}));
            }

        } catch (Exception e) {

        } finally {
            sc.close();
        }
        
        return listaFarmacias;
    }


    /**
     * Este metodo muestra por pantalla la lista e insertara en el fichero la lista y para ello utiliza
     * el BufferedWriter y el FileWriter con el nombre del fichero que queramos crear, ahora hacemos un
     * for con la longitud de la lista y hasta que no llegue al fin del tamaño de la lista, insertara
     * una linea en el fichero.
     */
    public static void insertarDatos() {
        ObjectInputStream ois;
        System.out.println(listaSinDuplicados);
        try {

            for (int i = 0; i < listaSinDuplicados.size(); i++) {
            }
        } catch (Exception e) {

        } finally {

        }
    }

}
