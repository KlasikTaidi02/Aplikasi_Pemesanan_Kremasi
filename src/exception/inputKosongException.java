/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;
import java.lang.Exception;
/**
 *
 * @author User
 */
public class inputKosongException extends Exception  {
    
   public void showMessage()
   {
       System.out.println(" !! INPUT HARUS TIDAK BOLEH KOSONG !! ");
   }
    
}
