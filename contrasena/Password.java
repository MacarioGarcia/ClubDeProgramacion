
/**
 * 
 *
 * @author Garcia Bautista Macario
 * @version 1.0
 */
import javax.swing.JOptionPane;//Importamos la biblioteca para poder usar JOptionPane
public class Password
{//Llave de Inicio de la clase
   public static void verificar(){// Inicia el Metodo Verificar (Firma del metodo)
       String password="amk14702"; //variable que contiene la contraseña a comparar
       String pass; //Variable que va almacenar la contraseña escrita por el usuario
       pass=JOptionPane.showInputDialog("Contraseña"); //Muestra una ventana para que el usuario introduzca la contraseña y se guarda en pass
       if(password.equals(pass))//compara si la contraseña introducida por el usuario es igual a la contraseña establecida
            JOptionPane.showMessageDialog(null,"Contraseña correcta");//Muestra una ventana con el mensaje "Contraseña correcta"
       else //Si no son iguales las contraseñas muestra el mensaje "Contraseña incorrecta!!"
            JOptionPane.showMessageDialog(null,"Contraseña Incorrecta!!");
   }//Cierre del metodo Verificar
   
   public static void main(String [] args){//Inicio del main
       verificar(); //Ejecuta el metodo verificar
       
    }//Fin del main
}//Llave de cierre de la clase
