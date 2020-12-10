


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package funcoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class Calculo {
    
    // FUNÇÃO QUE IRÁ CALCULAR OS VALORES DE CONVERSÃO:
    public double executar_calculo(String nome_corrente) {
        
        double valor_moeda;
        double quantia_moeda;
        double resultado;
        
        System.out.println("");
        System.out.printf("DIGITE O VALOR UNITARIO ATUAL DE(A) " + nome_corrente + "(S) EM RELAÇÃO A MOEDA DE INTERESSE: ");
        Scanner converter_moeda_valor = new Scanner(System.in);
        valor_moeda = converter_moeda_valor.nextDouble();
        
        System.out.printf("DIGITE A QUANTIA DE(A) " + nome_corrente + "(S) EM POSSE: ");
        Scanner converter_moeda_quantia = new Scanner(System.in);
        quantia_moeda = converter_moeda_quantia.nextDouble();

        resultado = valor_moeda * quantia_moeda;
        return resultado;
        
    }
    
}



