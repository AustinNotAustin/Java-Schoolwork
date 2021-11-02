/*******************
Name: Austin C Arledge

Date: 7 Jan 21

Notes: Wasn't sure what "if" and ".getSource" you wanted implemented so I made something up for it.
*******************/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Actions extends JFrame implements ActionListener {
   // Create the components (textarea and buttons)
   JFrame frame = new JFrame("Austin's JFrame");
   JPanel panel = new JPanel();
   JButton button = new JButton();
   TextArea text = new TextArea(2, 75);
   String source;

   public Actions() {
      // create the window (include a close operation)
      frame.setSize(350, 350);
      frame.setLocation(500, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);

      // create the container (include FlowLayout)
      panel.setLayout(new FlowLayout());

      // add the event listeners (button.addActionListener)
      button.addActionListener(this);

      // add the components
      button.setText("Push Me");
      button.setBounds(50, 100, 95, 30);
      text.setText("You haven't hit the button yet...");
      panel.add(button);
      panel.add(text);
      frame.add(panel);
   }

   public void actionPerformed(ActionEvent event) {
      // add the event handler( if statements and event.getSource should be used here)
      // Not sure what if & event.getSource thing you want done but I'll improvise
      
      if (button.getLabel() == "That's enough, chill out")
         button.setText("Double Click!");
         
      if (button.getLabel() == "Push Me") {
         source = String.valueOf(event.getSource());
         text.setText("You clicked on this button: " + source);
         button.setText("That's enough, chill out");
      }
   }

   public static void main (String[] args) { 
      Actions eg = new Actions();
   }
   
}