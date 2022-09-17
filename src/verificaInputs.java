//essa classe analiza todos os inputs do usuario e permite adicionar novos inputs sem alterar o método principal

public class VerificaInputs {
    //esse método veirfica se é um número positivo ou negativo
    public static Boolean numero(String numero){
    
        try {
            Double.parseDouble(numero);
            return true;

            }catch(NumberFormatException e) {
                return false;
            }  
    
}
    public static Float conta (String escolha, String x, String y){

        switch(escolha){
            case "s":
            Float totalS = Funcoes.soma(x, y);
            return totalS;

            case "t":
            Float totalT = Funcoes.subtracao(x, y);
            return totalT;

            case "m":
            Float totalM = Funcoes.multiplicacao(x, y);
            return totalM;

            case "d":
            Float totalD = Funcoes.divisao(x, y);
            return totalD;

            default:
            return null;
            

        }
        
    }
  
}
