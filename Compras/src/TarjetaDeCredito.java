import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TarjetaDeCredito {
    private double limite ;
    private double saldo;
    private List<Compras> listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }
    public boolean haceCompra(Compras compra){
        if (this.saldo >= compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getListaDeCompras() {
        return listaDeCompras;
    }
}
