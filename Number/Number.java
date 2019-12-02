
/**
 * 
 *
 * @author Garcia Bautista Macario
 * @version 1.0
 */
import javax.swing.JOptionPane;//Importamos la biblioteca para poder usar JOptionPane
public class Number
{//Llave de inicio de la clase Number
    public static String numero(double n){//Llave de inicio del metodo numero
        if(n==0)//Compara el parametro n
            return "Es igual a cero"; //si el parametro n es igual a cero, regresa un string "Es igual a cero"
        if(n>0)
            return "Es positivo";//si el parametro n es mayor a cero, regresa un string "Es positivo"
        else//Si no se cumple ninguna de las comparaciones anteriores, automaticamente el parametro n es menor a 0
            return "Es negativo";//si el parametro n es menor a cero, regresa un string "Es negativo"
    }//Llave de cierre del metodo numero
    
    public static void main(String [] args){//Inicio del main
        double num=Double.parseDouble(JOptionPane.showInputDialog("Introduce el numero"));//se declara una variable double num, y se utiliza un JOptionPane para que el usuario introduzca el numero
        System.out.println(numero(num));//Muestra en pantalla (consola) si es igual a cero, positivo o negativo
       
    }//Fin del main
}//Llave del cierre de la clase Number
