public class GestorDeCobranza {
    
    public void intentarLiquidacionMalicionsa(CreditoCorporativo c){
    
       c.SetsaldoPendiente(0);
       c.abonarCapital(-5000);

       }
       
    


    public void aplicarAlivioFinanciero(CreditoCorporativo c){
        double saldo = c.getsaldoPendiente();
        double Descuento = saldo * 0.5;

        c.abonarCapital(Descuento);
    }



}
