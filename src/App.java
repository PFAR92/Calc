import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        String conta,valor1,valor2;

        while(true){

            while(true) {

                System.out.print("Digite 1° valor: ");
                valor1 = teclado.nextLine();
               
                if (verificaInputs.numero(valor1) == true){
                    break;
                    return;
                }
            }
    
            while(true){
                
                System.out.print("Digite 2° valor: ");
                valor2 = teclado.nextLine();
    
                if (verificaInputs.numero(valor2) == true){
                    break;
                }
            }
                
            while (true){
    
                System.out.print("Qual a função desejada? [s]somar [t]subtrair [m]multiplicar [d]dividir [outra letra para sair]   ");
                conta = teclado.nextLine();

                Float total = verificaInputs.conta(conta, valor1, valor2);

                if(total != null){
                    System.out.println(total);
                }else{
                    return;
                }
                
               
            }
        }

        }

        
}
