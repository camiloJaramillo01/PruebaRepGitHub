
package entradaysalidajoptionpane;

import javax.swing.JOptionPane;

public class EntradaYSalidaJOptionPane {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        //Con el JOptionPane.showInputDialog se piden datos a través de una ventana
        cadena = JOptionPane.showInputDialog("Ingrese una cadena: ");
        //Convierte un string a entero
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: "));
        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);
        //Convierte un string a double
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un decimal: "));
        
        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El decimal es: "+decimal);
        
    }
    
}
