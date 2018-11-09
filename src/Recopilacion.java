/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Recopilacion {
    public String names;
    public int gols,camisetas;
 /*    public static void dt(){
   Jugador NOMBRE=new Jugador();
    Anotacion Goles=new Anotacion();
    NumCamisa Tgoles=new NumCamisa();
    Recopilacion Na=new Recopilacion();}*/
    

    public void Nombre(String name) {
        this.names=name;
    }

    void tgoles(int goles) {
        this.gols=goles; //To change body of generated methods, choose Tools | Templates.
    }

    void NumCam(int camiseta) {
        this.camisetas=camiseta; 
    }

    void combinar() {
        Recopilacion re=new Recopilacion();
        
        int x=1;
        String b;
        do {
            String a="\nEl jugador "+camisetas+", "+names+" anoto en el segundo x ";
            b=a;
            b=b+b;
             x++;
        }while(x<=gols);
       // System.out.println(b);
       
    }

   

    
    
    
}
