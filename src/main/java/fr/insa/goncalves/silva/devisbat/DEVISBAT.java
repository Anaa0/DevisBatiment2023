/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.goncalves.silva.devisbat;

/**
 *
 * @author macbook
 */
public class DEVISBAT {

    public static void main(String[] args) {
        // coucou
        Coin c1;
        System.out.println(" Identifiant du Coin");
        int id=Lire.i();
        System.out.println(" Abscisse du Coin");
        double x=Lire.d();
        System.out.println(" Ordonnée du Coin");
        double y=Lire.d();
        c1=new Coin(id,x,y);
        
        // Pour afficher textuellement le coin c1
        c1.afficher();
                
         Coin c2;
         System.out.println(" Identifiant du Coin");
         id=Lire.i();
         System.out.println(" Abscisse du Coin");
         x=Lire.d();
         System.out.println(" Ordonnée du Coin");
         y=Lire.d();
         c2=new Coin(id,x,y);
         
         Mur m1;
         System.out.println(" Identifiant du Mur");
         id=Lire.i();
         m1=new Mur(id,c1,c2);
         m1.afficher();
//         System.out.println(c2.toString());
//         System.out.println(m1.toString());
         System.out.println("Longueur du mur ="+m1.longueur());
         
         //Formattage de l'affichage
         System.out.format("\nLongueur du mur =%.2f",m1.longueur());
//         System.out.printf("\nLongueur du mur =%.3f\n",m1.longueur());
 /*         
// Exemple         
         double dval=7.1475;
         System.out.format("\nLongueur du mur =%.2f",dval);
         System.out.format("\nLongueur du mur =%.3f",dval);
         */
 
         // Calcul et affichage de la surface d'un mur
         //double surface=m1.surface();
         //System.out.println(m1.toString()+"\nSurface :"+m1.surface());
         System.out.format(m1.toString()+"\nSurface :%.2f",m1.surface());
          
         //Création d'un revetement
         System.out.println("\n Identifiant Revetement ?");
         id = Lire.i();
         double r;
         System.out.println("Prix unitaire Revetement ?");
         r = Lire.d();
         Revetement r1 ; 
         r1 = new Revetement(id,r);
         
         double MontantRevetement;
         MontantRevetement = CalculMontantRevetement (m1, r1); 
         
         System.out.format("\n Montant revetement %.2f" , MontantRevetement);
         
    } // fin de la méthode main
    
    //création d'une nouvelle méthode hors du main.  
    //Définition d'1 nouvelle méthode STATIQUE (= quand une methode n'a pas besoin d'1 instance)
    // instance ex : "Lire.i" --> instance = "Lire"
    
    static double CalculMontantRevetement (Mur M, Revetement R)
    {
        double MontantRevetement = M.surface() * R.prix ; 
        return (MontantRevetement);
    } // fin méthode calculRevetement
            
    
 } //fin de la classe principale 