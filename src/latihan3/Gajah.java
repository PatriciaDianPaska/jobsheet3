/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author ASUS
 */
public class Gajah extends Hewan{    
    public static void testClassMethod(){
        System.out.println("The Class Method in Hewan...");
    }
    //meng-override method pada class Animal
  public void testInstanceMethod(){
      System.out.println("The Instance Method in Hewan...");
  }
  public static void main (String[] args){
      Gajah myGajah = new Gajah ();
      Hewan myHewan = myGajah;
      Hewan.testClassMethod();
      myHewan.testInstanceMethod();
      Hewan hewan = new Hewan ();
      hewan.testInstanceMethod();
      myGajah.testClassMethod ();
  }
}
