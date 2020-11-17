//importanto método/classe para imprimir
import java.util.Scanner;

public class Desafio05 {
    public static void main(String[] args) {
        
        // atributos
        double R = 0;
        int horas = 0, min = 0, seg = 0;
        
        // criando 
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do indice de radioatividade(R): ");
        R = teclado.nextDouble();
        teclado.close();
        
        // condições para exibir o valor do indice
        // se o valor for <= 0.2 não é necessária a conversão
        if (R <= 0.2){
            System.out.println(horas+"h "+min+"min "+seg+"seg");
        } else{ // senão, é preciso converter até q o indice deja <= 0.2
            while (R > 0.2){
                // enquanto r> 0.2, divide o indice por 2 e adiciona 50 seg
                R /= 2;
                seg += 50;
            }

            // conversão de horas, minutos e segundos
            min = seg/60;
            seg = seg%60;
            horas = min/60;
            min = min%60;

            // imprime qual o tempo necessário para a conversão
            System.out.println(horas+"h "+min+"min "+seg+"seg");           
        }  
    }
}