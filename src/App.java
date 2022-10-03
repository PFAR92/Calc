import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        FuncoesEscolhidas operacoes1 = new FuncoesEscolhidas();

        while(true){
            System.out.print("Digite o 1° número: ");
            String numero1 = input.next();
            if(operacoes1.verificaInputs(numero1)){
                operacoes1.setNumero1(operacoes1.getNumeroVerificado());
                break;
            }
        }
        while(true){
            System.out.print("Digite o 2° número: ");
            String numero2 = input.next();
            if(operacoes1.verificaInputs(numero2)){
                operacoes1.setNumero2(operacoes1.getNumeroVerificado());
                break;
            }
        }
        System.out.print("Escolha qual função executar: [S]SOMA [T]SUBTRACAO [M]MULTIPLICACAO [D]DIVISAO: ");
        String escolha = input.next();
        input.close();
        switch(escolha.toLowerCase()){
            case "s":
                System.out.println(operacoes1.soma());
                break;
            case "t":
                System.out.println(operacoes1.subtracao());
                break;
            case "m":
                System.out.println(operacoes1.multiplicacao());
                break;
            case "d":
                System.out.println(operacoes1.divisao());
                break;
            default:
                System.out.println("Opção inválida");

        }


    }

        
}
