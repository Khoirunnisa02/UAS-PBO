import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// GUI Class 
class gui implements ActionListener {
    // Data members
    JFrame f;
    JButton b1, b2;

    // Constructor
    public gui() {
        // Create frame
        f = new JFrame("Fauna");

        // Create components
        b1 = new JButton("Rabbit");
        b2 = new JButton("Cow");

        // Add action listeners
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Add components
        f.add(b1);
        f.add(b2);

        // Set Layout Manager
        f.setLayout(new FlowLayout());

        // Set the size of frame
        f.setSize(300, 200);

        f.show();
    }

    // Override the actionPerformed() method
    public void actionPerformed(ActionEvent e) {
        // Create object
        fauna a;

        if (e.getSource() == b1) {
            a = new rabbit("Bunny", 1);
        } else {
            a = new cow("Momo", 4);
        }

        // Call the eat and sleep methods
        a.eat();
        a.sleep();

        // Print the name and age of animal
        System.out.println("Name: " + a.name);
        System.out.println("Age: " + a.age);
    }

    // Main method
    public static void main(String args[]) {
        new gui();
    }
}