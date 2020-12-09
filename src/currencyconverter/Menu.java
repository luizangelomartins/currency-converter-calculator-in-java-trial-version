


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package currencyconverter;


// IMPORTAÇÃO DE BIBLIOTECAS:
import funcoes.Lista;
import java.util.InputMismatchException;
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class Menu {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int escolha = 0;
    int repetir = 0;
    Lista lista_de_opcoes = new Lista();
    
    
    // FUNÇÃO QUE IRÁ EXIBIR O MENU:
    public void exibir_menu() {
        
        while( repetir != 1 ) {
            
            try {

                    System.out.println("");
                    System.out.println("MENU GERAL");
                    System.out.println("");
                    lista_de_opcoes.exibir_lista();
                    System.out.println("");
                    System.out.printf("DIGITE SUA RESPOSTA: ");
                    Scanner escolha_usuario1 = new Scanner(System.in);
                    escolha = escolha_usuario1.nextInt();

                    switch( escolha ) {

                        // CASO "0" - SAIR:
                        case 0:
                            repetir = 1;
                        break;

                        // VALORES INCORRETOS:
                        default:
                            System.err.println("POR FAVOR DIGITE UM VALOR VALIDO!");
                            System.err.println("TENTE NOVAMENTE!");

                    }

            }catch(InputMismatchException e) {

                System.err.println("POR FAVOR DIGITE UM VALOR VALIDO!");
                System.err.println("TENTE NOVAMENTE!");

            }
        
        }
            
    }
    
}




