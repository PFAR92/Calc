//essa classe tem todas as fuções matemáticas escolhidas pelo usuário cada método com uma função específica
public class funcoes {
    public static Float soma(String n1, String n2){

        float x = Float.parseFloat(n1);
        float y = Float.parseFloat(n2);
        Float total = x + y;
        return total;

    }

    public static Float subtracao (String n1, String n2){

        float x = Float.parseFloat(n1);
        float y = Float.parseFloat(n2);
        float total = x - y;
        return total;

    }

    public static Float multiplicacao (String n1, String n2){

        float x = Float.parseFloat(n1);
        float y = Float.parseFloat(n2);
        float total = x * y;
        return total; 
    }

    public static Float divisao(String n1, String n2){

        float x = Float.parseFloat(n1);
        float y = Float.parseFloat(n2);
        Float total = x / y;
        return total;
    }
}
