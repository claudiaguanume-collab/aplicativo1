/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package presentacion;
import java.util.ArrayList;

public class Carrito {

    public static ArrayList<String> productos = new ArrayList<>();
    public static ArrayList<Integer> cantidades = new ArrayList<>();
    public static ArrayList<Double> precios = new ArrayList<>();

    public static void agregarProducto(String producto, double precio) {

        productos.add(producto);
        cantidades.add(1);
        precios.add(precio);
    }

    public static void vaciar() {

        productos.clear();
        cantidades.clear();
        precios.clear();
    }
}
/**
 *
 * @author JULIAN OCHOA
 */
