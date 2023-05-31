package calculadora;

public class Calculadora {

    private double valorA;
    private double valorB;

    public Calculadora() {
        this(0.0, 0.0);
    }

    public Calculadora(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorA) {
        this.valorA = valorA;
    }

    public double getAdicao() {
        return (getValorA() + getValorB());
    }
    
        public double getSubtracao() {
        return (getValorA() - getValorB());
    }
    
        public double getProduto() {
        return (getValorA() * getValorB());
    }
    
        public double getDivisao() {
        return (getValorA() / getValorB());
    }

    public String getSubtração() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}