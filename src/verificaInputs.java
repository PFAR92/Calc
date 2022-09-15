//essa classe analiza todos os inputs do usuario e permite adicionar novos inputs sem alterar o método principal

public class verificaInputs {

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
            Float totalS = funcoes.soma(x, y);
            return totalS;

            case "t":
            Float totalT = funcoes.subtracao(x, y);
            return totalT;

            case "m":
            Float totalM = funcoes.multiplicacao(x, y);
            return totalM;

            case "d":
            Float totalD = funcoes.divisao(x, y);
            return totalD;

            default:
            return null;
            

        }
        
    }
  
}
