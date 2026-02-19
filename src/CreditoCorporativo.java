import java.lang.String;

public class CreditoCorporativo {
    private String Id;
    private double montoPrestado;
    private double saldoPendiente;
    private double tasaInteres;
    private boolean esRiesgoso;

    public CreditoCorporativo(String Id, double montoPrestado, double tasaInteres) {
        this.Id = Id;
        this.montoPrestado = montoPrestado;
        this.saldoPendiente = montoPrestado;
        this.tasaInteres = tasaInteres;
        this.esRiesgoso = false;
    }

    public CreditoCorporativo(String Id, double montoPrestado, double saldoPendiente, double tasaInteres) {
        this.Id = Id;
        this.montoPrestado = montoPrestado;
        this.saldoPendiente = saldoPendiente;
        this.tasaInteres = tasaInteres;
        this.esRiesgoso = false;
    }

    public CreditoCorporativo(String Id, double montoPrestado) {
        this.Id = Id;
        this.montoPrestado = montoPrestado;
        this.saldoPendiente = saldoPendiente;
        this.tasaInteres = 1.5;
        this.esRiesgoso = false;
    }

    public void SetsaldoPendiente(double saldoPendiente) {
        if (saldoPendiente < 0) {
            System.out.println("error");
        } else {
            this.saldoPendiente = saldoPendiente;
        }

    }

    public String Id(){
        return Id;

    }

    public double getsaldoPendiente() {
        return saldoPendiente;

    }

    public boolean esRiesgoso() {
        return saldoPendiente > (montoPrestado * 1.2);
    }

    public void abonarCapital(double saldo) {
        saldoPendiente= saldoPendiente-saldo;
    }

    public void capitalizarIntereses() {
        double interes= saldoPendiente * tasaInteres;
        saldoPendiente+= interes;

        if (esRiesgoso){
            System.out.println("Es riesgoso");

        }
            System.out.println("Es riesgoso");

            
        }
    } 

    


