public class GestorDeCobranza {

    public void intertarLiquidacionMalicionsa(CreditoCorporativo c){
       
       c.abonarCapital(-5000);

       }
    


    public void aplicarAlivioFinanciero(CreditoCorporativo c){
        double saldo = c.getsaldoPendiente();
        double Descuento = saldo * 0.5;

        c.abonarCapital(Descuento);
    }


    
}
