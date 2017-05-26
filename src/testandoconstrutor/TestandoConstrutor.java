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
public class TestandoConstrutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComConstrutor cc = new ComConstrutor();
        cc = new ComConstrutor("Java");
        cc = new ComConstrutor(2017);
        cc = new ComConstrutor("Java", 2017);
    }
    
}
