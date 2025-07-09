public class VerificacaoDesconto {
    public static void main(String[] args) {
        boolean produtoComDesconto = true; 
        boolean clienteTemCupom = false; 

        boolean descontoAplicado = produtoComDesconto || clienteTemCupom;

        System.out.println("Desconto aplicado: " + descontoAplicado);
    }
}
