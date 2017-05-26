/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testandoconstrutor;

/**
 *
 * @author tiago.lucas
 */
public class ComConstrutor {
    /**
     * Construtores
     * - Métodos especiais são utilizados para inicialização de objetos recém instanciados
     * - Devem possuir o mesmo nome da classe, sendo executados sempre que o operador new() é acionado
     * na aplicação (interface).
     * - Podem existir mais de um método construtor por classe:
     *      - As assinaturas dos métodos as diferenciam.
     *      - Será executado o construtor que possuir os argumentos na mesma ordem da
     *      assinatura do método.
     */
    public ComConstrutor(){
        System.out.println("Hello Construtor");
    }
    public ComConstrutor(String a){
        System.out.println("Hello Construtor: "+a);
    }
    public ComConstrutor(int b){
        System.out.println("Hello Construtor: "+b);
    }
    public ComConstrutor(String a, int b){
        System.out.println("Hello Construtor: "+a+", "+b);
    }
}
