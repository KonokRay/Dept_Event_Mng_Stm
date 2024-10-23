import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OkButton {

    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("OK Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        // Create an OK button
        JButton okButton = new JButton("OK");

        // Add an ActionListener to the button
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Action to perform on button click
                JOptionPane.showMessageDialog(frame, "You clicked OK!");
            }
        });

        // Add the button to the frame
        frame.getContentPane().add(okButton);

        // Set the frame's layout and make it visible
        frame.setLayout(new java.awt.FlowLayout());
        frame.setVisible(true);
    }
}
