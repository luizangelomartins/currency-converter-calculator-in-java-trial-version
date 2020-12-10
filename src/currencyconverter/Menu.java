


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
    int repetir = 0;
    int escolha1 = 0;
    String nome = "";
    Lista lista_de_opcoes = new Lista();
    Calculo calculo_de_valores = new Calculo();
    
    
    // FUNÇÃO QUE IRÁ EXIBIR O MENU:
    public void exibir_menu() {
        
        while( repetir != 1 ) {
            
            try {

                    nome = "";
                    System.out.println("");
                    System.out.println("MENU GERAL");
                    System.out.println("");
                    lista_de_opcoes.exibir_lista();
                    System.out.println("");
                    System.out.printf("DIGITE SUA RESPOSTA: ");
                    Scanner escolha_usuario1 = new Scanner(System.in);
                    escolha1 = escolha_usuario1.nextInt();
                    
                    switch( escolha1 ) {

                        // CASO "0" - SAIR:
                        case 0:
                            repetir = 1;
                        break;

                        // CASO "1" - REAL:
                        case 1:
                            nome = "REAL";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                        
                        // CASO "2" - EURO:
                        case 2:
                            nome = "EURO";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                        
                        // CASO "3" - IENE:
                        case 3:
                            nome = "IENE";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                            
                        // CASO "4" - DÓLAR AMERICANO:
                        case 4:
                            nome = "DÓLAR AMERICANO";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                        
                        // CASO "5" - DÓLAR AUSTRALIANO:
                        case 5:
                            nome = "DÓLAR AUSTRALIANO";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                            
                        // CASO "6" - DÓLAR CANADENSE:
                        case 6:
                            nome = "DÓLAR CANADENSE";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                            
                        // CASO "7" - FRANCO SUÍÇO:
                        case 7:
                            nome = "FRANCO SUÍÇO";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                        
                        // CASO "8" - LIBRA ESTERLINA:
                        case 8:
                            nome = "LIBRA ESTERLINA";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                        
                        // CASO "9" - LIRA TURCA:
                        case 9:
                            nome = "LIRA TURCA";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                        
                        // CASO "10" - PESO ARGENTINO:
                        case 10:
                            nome = "PESO ARGENTINO";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
                        break;
                        
                        // CASO "11" - RENMIMBI:
                        case 11:
                            nome = "RENMIMBI";
                            System.err.println("VOCÊ TEM: " + calculo_de_valores.executar_calculo(nome) + " DA MOEDA INTERESSADA EM POSSE." );
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




