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
public class Anotacion {
public int n;
public int goles;

Scanner dto=new Scanner(System.in);
    void numero_goles() {
        Recopilacion re=new Recopilacion();
        System.out.print("Numero de anotaciones de 10 del jugador "+n+":");
            int goles=dto.nextInt();
            n=n+1; 
re.tgoles(goles);//To change body of generated methods, choose Tools | Templates.
    }

    void NumJugador(int n) {
        this.n=n; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
