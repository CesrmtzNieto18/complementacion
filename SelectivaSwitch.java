
import javax.swing.JOptionPane;

public class SelectivaSwitch {

    public static void main(String[] cesar) {
        //declaracion de variables
        byte opcion;
        double a = 0, b = 0, h = 0, r = 0;
        opcion = Byte.parseByte(JOptionPane.showInputDialog("MENU DE OPCIONES"
                + "\n 1.-TRANGULO\n 2.-RECTANGULO\n 3.-CIRCULO\n Escribe el "
                + "numero de tu eleccion"));
        switch (opcion) {

            case 1:
                b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la "
                        + "base de su Triangulo"));
                h = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la "
                        + "altura de su Triangulo"));
                a = (b * h) / 2;
                JOptionPane.showMessageDialog(null, "Su area es" + a);
                break;
            case 2:
                b = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la "
                        + "base de su Rectangulo"));
                h = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la "
                        + "altura de su Rectangulo"));
                a = b * h;
                JOptionPane.showMessageDialog(null, "Su area es" + a);
                break;
            case 3:
                r = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el radio "
                        + "de su circulo"));
                a = ((double) Math.PI * (r * r));
                JOptionPane.showMessageDialog(null, "Su area es" + a);
                break;
        }

    }
}
