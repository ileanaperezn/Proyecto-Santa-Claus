/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package santa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aylín Aldana
 */
public class Santa implements Runnable{
    private main main;

    public void run() {
        while(true){
            esperar(5000);
            if(main.contador_renos == 9){
                
                main.reparteregalos();
                esperar(5000);
            }
             if(main.contador_duendes == 3){
                 System.out.println("Duendes");
                 main.ayudaduendes();
                 esperar(5000);
             }
           main.santadormido();
        }
        
    }

    private void esperar(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Santa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    void setMain(main main) {
       this.main = main;
    }
}
