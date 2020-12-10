


    // [ "CRIADOR: LUIZ ÂNGELO MARTINS" ]:



// PACOTE DA CLASSE:
package funcoes;


// IMPORTAÇÃO DE BIBLIOTECAS:
import org.junit.Test;
import static org.junit.Assert.*;


// MÉTODO PRINCIPAL DA CLASSE:
public class CalculoTest {
    
    
    public CalculoTest() {
        
    }

    
    // TESTE DE CALCULO:
    /**
     * Test of executar_calculo method, of class Calculo.
     */
    @Test
    public void testExecutar_calculo() {
        
        double valor_moeda = 6.25;
        double quantia_moeda = 50;
        double resultado;
        
        resultado = valor_moeda * quantia_moeda;
        assertEquals(312.50, resultado, 1);
        
    }
    
    
}




