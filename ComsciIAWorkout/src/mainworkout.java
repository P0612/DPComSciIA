import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainworkout {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;

    public mainworkout() {
        frame = new JFrame("WorkOut Login"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); 

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY); 
        panel.setLayout(new GridBagLayout()); 
        GridBagConstraints c = new GridBagConstraints(); 

        JLabel titleLabel = new JLabel("Login");
        titleLabel.setForeground(Color.WHITE); 
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24)); 
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.insets = new Insets(20,0,20,0); 
        panel.add(titleLabel, c);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setForeground(Color.WHITE);
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.insets = new Insets(5,0,5,5);
        panel.add(usernameLabel, c);

        usernameField = new JTextField(10);
        c.gridx = 1;
        c.gridy = 1;
        panel.add(usernameField, c);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setForeground(Color.WHITE);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(passwordLabel, c);

        passwordField = new JPasswordField(10);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(passwordField, c);

        JButton loginButton = new JButton("Login");
        c.gridx = 0;
        c.gridy = 3;
        c.gridwidth = 2;
        c.insets = new Insets(20,0,0,0); 
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                
                if (username.equals("miu") && password.equals("miu")) {
                    new homePage();
                } else {
                    JOptionPane.showMessageDialog(frame, "Login failed. Please try again.");
                }
            }
        });

        panel.add(loginButton, c);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new mainworkout();
                
            }
        });
    }
}
