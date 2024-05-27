public class Compras implements  Comparable<Compras>{
    private double valor;
    private String nombreProduc;

    public double getValor() {
        return valor;
    }

    public String getNombreProduc() {
        return nombreProduc;
    }

    public Compras( String nombreProduc , double valor) {
        this.valor = valor;
        this.nombreProduc = nombreProduc;
    }

    @Override
    public String toString() {
        return "Compra: valor= " + valor +
                ", Nombre de Producto='" + nombreProduc ;
    }

    @Override
    public int compareTo(Compras otra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otra.getValor()));
    }
}
