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
            Float totalS = FuncoesMatematicas.soma(x, y);
            return totalS;

            case "t":
            Float totalT = FuncoesMatematicas.subtracao(x, y);
            return totalT;

            case "m":
            Float totalM = FuncoesMatematicas.multiplicacao(x, y);
            return totalM;

            case "d":
            Float totalD = FuncoesMatematicas.divisao(x, y);
            return totalD;

            default:
            return null;
            

        }
        
    }
  
}
