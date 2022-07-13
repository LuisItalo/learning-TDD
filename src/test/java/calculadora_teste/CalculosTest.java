package calculadora_teste;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

 public class CalculosTest {

    //ceranario de teste
    //preparaçao do cenario
    //execuçao
    //resultados/verificaçoes

    @Test
    public void retornarZeroQuandoNadaInformado(){
        Calculos numeroASomar = new Calculos();
        double esperado = 0;
        double atual = numeroASomar.soma();
        Assertions.assertEquals(esperado, atual);
    }

    @Test
    public void retornarSomaQuandoValoresInformados(){
        Calculos numerosAsomar = new Calculos();
        double atual = numerosAsomar.soma(3,3);
        double esperado = 6;
        Assertions .assertEquals(esperado, atual);
    }
//
//    @Test
//     public void verifivaNumeroPar(){
//        Calculos paraVerificar = new Calculos();
//        boolean informaNUmeroPar = paraVerificar.informaNumeroPar(4); //digita numero para verificar se é numero par
//        Assertions.assertTrue(informaNUmeroPar);
//    }
//
//    @Test
//     public void retornaRaizQuadrada(){
//        Calculos numeroACalcular = new Calculos();
//        double atual = numeroACalcular.raizQuadradaDeDoisNumeros(144 );
//        double essperado = 12;
//        Assertions.assertEquals(essperado, atual);
//    }
}