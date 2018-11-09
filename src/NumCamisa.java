/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.*;
public class NumCamisa {
    public int camiseta;
    
Scanner dto=new Scanner(System.in);
public int n;
    void Tgoles() {
        Recopilacion re=new Recopilacion();
         System.out.print("Camiseta del jugador "+n+":");
            int camiseta=dto.nextInt();
            n=n+1;
re.NumCam(camiseta);//To change body of generated methods, choose Tools | Templates.
    }
     void NumJugador(int n) {
        this.n=n;
     }
}
