package conexion;

import java.sql.Connection;

public class pruevaconexion {

    public static void main(String[] args) {

        Connection conexion = java.conectar();

        if (conexion != null) {

            System.out.println("================================");
            System.out.println("CONEXION EXITOSA");
            System.out.println("Ecoguanume esta conectado a MySQL");
            System.out.println("================================");

        } else {

            System.out.println("================================");
            System.out.println("ERROR DE CONEXION");
            System.out.println("No se pudo conectar a MySQL");
            System.out.println("================================");
        }
    }
}