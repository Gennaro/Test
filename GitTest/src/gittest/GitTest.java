
/*--------------------------------------------------------------------------*/
/*
 * Author:  Gennaro
 * Date:    Dec 22, 2011
 * Purpose: Marissa's Branch
 * Inputs:  
 * Outputs: 
 */
package gittest;

//imports

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GitTest {

//variables

 static Font font1, font2, font3, font4, font5;

    public static void FontSetter() {
      font1 = new Font("Serif", Font.BOLD, 14);
      font2 = new Font("SansSerif", Font.BOLD + Font.ITALIC, 24);
      font3 = new Font("Monospaced", Font.PLAIN, 30);
      font4 = new Font("Dialog", Font.PLAIN, 36);
      font5 = new Font("Serif", Font.ITALIC, 48);
      
     }


    public static class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Goodbye World!"); 
            System.exit(0);
                  
            
        }
    }
    
    public static class HelloWorldDisplay extends JPanel{
        
        
        public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        int x,y;
        for(int i=0; i<20; i++) {
            FontSetter();
            int fontNum = (int)(5*Math.random()) + 1;
          switch (fontNum) {
             case 1:
                g.setFont(font1);
                break;
             case 2:
                g.setFont(font2);
                break;
             case 3:
                g.setFont(font3);
                break;
             case 4:
                g.setFont(font4);
                break;
             case 5:
                g.setFont(font5);
                break;
          }
            float hue = (float)Math.random();
            g.setColor( Color.getHSBColor(hue, 1.0F, 1.0F) );
            x = -50 + (int)(Math.random()*(200));
            y = (int)(Math.random()*(300));
            g.drawString("Hello World!", x, y);
            }
        }
    }

   public static void main(String[] args) {
       System.out.println("Hello World!");
       System.out.println("Hello World");
       System.out.println("Marissa");
    
       HelloWorldDisplay displayPanel = new HelloWorldDisplay();
       
       JButton OK = new JButton("OK");
       ButtonHandler Listener = new ButtonHandler();
       OK.addActionListener(Listener);
       
       JPanel content = new JPanel();
       content.setLayout(new BorderLayout());
       content.add(displayPanel, BorderLayout.CENTER);
       content.add(OK, BorderLayout.SOUTH);
       
       
       JFrame window = new JFrame("");
       window.setContentPane(content);
       window.setSize(450,400);
       window.setLocation(350,250);
       window.setVisible(true);
         

   }
}

