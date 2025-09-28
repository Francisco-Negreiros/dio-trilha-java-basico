public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 40.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;

            System.out.println("Valor Solicitado: " +saldo);
        }else{
            System.out.println("Saldo insulficiente!");
        }
        
    }
}
