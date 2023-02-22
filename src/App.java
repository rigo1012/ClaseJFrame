import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    public App(){
        setLayout(null);
        setSize(500,500);
        setVisible(true);

        JTabbedPane pestañas = new JTabbedPane();
        // Pneles

        JPanel pantalla1= new JPanel();
        //Carateristicas de la pantalla
        pantalla1.setBackground(Color.lightGray);

        JPanel pantalla2= new JPanel();
        pantalla2.setBackground(Color.cyan);

        //Se agregan como pestañas

        pestañas.addTab("Vista",pantalla1);
        pestañas.addTab("Vista 2", pantalla2);

        add(pestañas);
        pestañas.setBounds(0,0,300,300);
    }
    public static void main (String[] args){
        App app = new App();
    }
    }