/**
 * <p><strong>TesteCalculadora</strong></p>
 * classe utilizada para realizar testes das operações da classe calculadora
 * @author Gabriel Mattos de Lima
 * @version 1.0
 */
package calculadora;

public class TesteCalculadora{

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2,3,"+")); // resultado: 5 
        System.out.println(calc.calcular(2,3,"-")); // resultado: -1
        System.out.println(calc.calcular(2,3,"*")); // resultado: 6
        System.out.println(calc.calcular(2,3,"/")); // fresultado 0

        try {
            System.out.println(calc.calcular(8,0,"/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // colando mensagem de erro caso ocorra
        }

        try {
            System.out.println(calc.calcular(5,5,"x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());// colando mensagem de erro caso ocorra
        }
    }
}