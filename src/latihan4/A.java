/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author ASUS
 */
class A {
    int a;
    int c;
    int d;
  public void setA (int nilai){
      a = nilai;
  }
  
  public int getA(){
      return a;
  }
  
  public void setC (int nilai){
      c = nilai;
  }
  
  public int getC(){
      return c;
  }
  
   public void setD (int nilai){
      d = nilai;
  }
  
  public int getD(){
      return d;
  }
  
  public void tampilkanNilai(){
      System.out.println("Nilai a : "+getA());
  }
  
  public void tampilkanNilaiC(){
      System.out.println("Nilai c : "+getC());
  }
  
  public void tampilkanNilaiD(){
      System.out.println("Nilai d : "+getD());
  }
  
}
