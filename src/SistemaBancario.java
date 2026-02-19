public class SistemaBancario {

    public static void main(String[] args) {
        CreditoCorporativo miCredito= new CreditoCorporativo("CORP-99", 10000, 0.05);
    
    
    for (int i=0; i< 5 ;i++){
            miCredito.capitalizarIntereses();
        }

        System.out.println("¿mi credito es riesgoso? "+ miCredito.esRiesgoso());

        System.out.println("Mi saldo actual es: "+miCredito.getsaldoPendiente());

        GestorDeCobranza gestor = new GestorDeCobranza();

        gestor.aplicarAlivioFinanciero(miCredito);

        System.out.println("Su saldo despues del alivio es: " + miCredito.getsaldoPendiente());

        


    }
}
