/** Eine eigene einfache Bruchklasse
 *  mit einer add(...)-Methode
 */

public class  Bruch extends Object{
  int zaehler;                         //Instanzvariable
  int nenner;                          //Instanzvariable
  
   public Bruch() {                    //Standardkonstruktor
    zaehler = 0;					   //d.h. Konstruktor mit 0 Parameter
    nenner = 1;
  }
   public Bruch(int zz, int nn) {     //Konstruktor mit 2 Paramter
    zaehler = zz;
    nenner = nn;
  }
 
  public Bruch(int zz) {              //Konstruktor mit 1 Parameter
    zaehler = zz;
    nenner = 1;
  }
 
  public Bruch add(Bruch bb) {
     Bruch local = new Bruch();
     local.zaehler = this.zaehler * bb.nenner + bb.zaehler * this.nenner;
     local.nenner = this.nenner * bb.nenner;
     return local;                      // local ist in Bruch-Objekt!
  }
 
   public String toString() {
      return this.getClass().getName() + " = " + this.zaehler + "/" + this.nenner;
   }
    public String print() {
       return this.zaehler + "/" + this.nenner;
   }
 
 
   public boolean equals(Bruch obj) {
       if (this.zaehler == obj.zaehler && this.nenner == obj.nenner)
          return true;
       else
          return false;
   }
}
 