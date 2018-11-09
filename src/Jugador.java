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
public class Jugador {

    public int n;
    public String name;
    
    public  void nombre(){
        Recopilacion Name=new Recopilacion();
        Scanner dto=new Scanner(System.in);
        System.out.print("Nombre de jugador "+n+":");
            String name=dto.nextLine();
            n=n+1;
          Name.Nombre(name);
            
    }

    public void NumJugador(int n) {
        this.n=n; //To change body of generated methods, choose Tools | Templates.
    }

}
