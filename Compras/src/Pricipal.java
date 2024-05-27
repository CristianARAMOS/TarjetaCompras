import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Scanner;
import java.util.SortedMap;

public class Pricipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el limite de credito de la tarjeta");
        double limite = teclado.nextDouble();
        TarjetaDeCredito newCard = new TarjetaDeCredito(limite);

        int userOption = 1 ;
        while (userOption != 0){
            System.out.println("Ingrese el nombre del producto: ");
            String producto = teclado.next();

            System.out.println("Ingrese el costo del producto");
            double costo = teclado.nextInt();

            Compras compra = new Compras(producto,costo);
            boolean compraRelizada = newCard.haceCompra(compra);

            if(compraRelizada){
                System.out.println("Compra realizada con exito!");
                System.out.println("¿Desea agregar otro producto?, Escriba 1 para si y 0 para no");
                userOption = teclado.nextInt();
            }
            else  {
                System.out.println("La compra no pude ser realizada, saldo insuficiente!");
                userOption  = 0;
            }

        }

        System.out.println("***************** * *****************");
        System.out.println("COMPRAS FINALIZADAS!");
        Collections.sort(newCard.getListaDeCompras());
        for (Compras compras : newCard.getListaDeCompras()){
            System.out.println(compras.getNombreProduc() + " - " + compras.getValor());
        }
        System.out.println("***************** * *****************");
    }
}
