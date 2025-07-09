public class AutorizacaoCompra {
    public static void main(String[] args) {
        boolean saldoSuficiente = true; 
        boolean contaAtiva = true;      
        
        boolean compraAutorizada = saldoSuficiente && contaAtiva;

        System.out.println("Compra autorizada: " + compraAutorizada);
    }
}
