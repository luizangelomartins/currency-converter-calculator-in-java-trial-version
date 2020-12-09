


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package currencyconverter;


// IMPORTAÇÃO DE BIBLIOTECAS:
import funcoes.Lista;


// MÉTODO PRINCIPAL DA CLASSE:
public class Menu {
    
    
    // DECLARAÇÃO DE VARIAVEIS E OBJETOS:
    Lista lista_de_opcoes = new Lista();
    
    
    // FUNÇÃO QUE IRÁ EXIBIR O MENU:
    public void exibir_menu() {
        
        System.out.println("");
        System.out.println("MENU GERAL");
        System.out.println("");
        lista_de_opcoes.exibir_lista();
        System.out.println("");
        System.out.printf("DIGITE SUA RESPOSTA: ");
        
    }
    
}




