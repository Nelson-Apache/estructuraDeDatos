package edu.com.uniquindio.talleres;

import java.util.TreeSet;

public class Empresa {

    private TreeSet<Producto> productos;

    public Empresa() {
        this.productos = new TreeSet<Producto>();
    }

    public void agregarProducto(Producto producto) {
        producto.getNombre();
        productos.add(producto);
    }

    public Producto buscarProductoPorCodigo(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((productos == null) ? 0 : productos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Empresa other = (Empresa) obj;
        if (productos == null) {
            if (other.productos != null)
                return false;
        } else if (!productos.equals(other.productos))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "productos=" + productos +
                '}';
    }
}
