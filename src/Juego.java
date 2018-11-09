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
public class Juego {
    public int n=1;
   
    public static void main(String[]args){
        Scanner dto=new Scanner (System.in);
        Juego N=new Juego();
       
        Jugador Name=new Jugador();
        NumCamisa gol=new NumCamisa();
        Anotacion numG=new Anotacion();
       Recopilacion Total=new Recopilacion();
      // nuevo t=new nuevo();
        int n=1;
        Name.NumJugador(n);
        gol.NumJugador(n);
        numG.NumJugador(n);
        
        do {
            Name.nombre();
            //System.out.println("Nombre de jugador "+n+":");
            //String name=dto.nextLine();
            gol.Tgoles();
            numG.numero_goles();
            System.out.println("-------------------------------------");
            n++;
            //Gol.GolNum();
            Total.combinar();
        }while(n<=5);
        
        
        
    }

    
    



   
}
