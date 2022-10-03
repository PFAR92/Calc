public class FuncoesEscolhidas implements Controlador{
    private float numeroVerificado;
    private float numero1;
    private float numero2;


    public float getNumeroVerificado() {
        return numeroVerificado;
    }

    public void setNumeroVerificado(float numeroVerificado) {
        this.numeroVerificado = numeroVerificado;
    }

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    @Override
    public boolean verificaInputs(String valor) {
        try {
            Double.parseDouble(valor);
            this.setNumeroVerificado(Float.parseFloat(valor));
            return true;
    
            }catch(NumberFormatException e) {
                System.err.println("precisa ser uma valor numérico positivo ou negativo");
                return false;
            }
    }

    @Override
    public float soma() {
        return numero1 + numero2;
    }

    @Override
    public float subtracao() {
        return numero1 - numero2;
    }

    @Override
    public float multiplicacao() {
        return numero1 * numero2;
    }

    @Override
    public float divisao() {
        return numero1 / numero2;
    }

    
    
}
