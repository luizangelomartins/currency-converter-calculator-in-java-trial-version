


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package currencyconverter;


// IMPORTAÇÃO DE BIBLIOTECAS:
import funcoes.Calculo;
import funcoes.Lista;
import java.util.InputMismatchException;
import java.util.Scanner;


// MÉTODO PRINCIPAL DA CLASSE:
public class Menu {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    int escolha = 0;
    int repetir = 0;
    Lista lista_de_opcoes = new Lista();
    Calculo calculo_de_valores = new Calculo();
    
    
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

                        // CASO "1" - REAL:
                        case 1:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                        
                        // CASO "2" - EURO:
                        case 2:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                        
                        // CASO "3" - IENE:
                        case 3:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                            
                        // CASO "4" - DÓLAR AMERICANO:
                        case 4:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                        
                        // CASO "5" - DÓLAR AUSTRALIANO:
                        case 5:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                            
                        // CASO "6" - DÓLAR CANADENSE:
                        case 6:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                            
                        // CASO "7" - FRANCO SUÍÇO:
                        case 7:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                        
                        // CASO "8" - LIBRA ESTERLINA:
                        case 8:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                        
                        // CASO "9" - LIRA TURCA:
                        case 9:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                        
                        // CASO "10" - PESO ARGENTINO:
                        case 10:
                            calculo_de_valores.exibir_menu_calculo();
                        break;
                        
                        // CASO "11" - RENMIMBI:
                        case 11:
                            calculo_de_valores.exibir_menu_calculo();
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




