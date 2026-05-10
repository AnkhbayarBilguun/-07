import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class FacebookLoginGUI extends JFrame {

    JTextField emailField;
    JPasswordField passwordField;
    JButton loginButton;
    JButton createButton;

    public FacebookLoginGUI() {

        setTitle("Facebook Login");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(245, 245, 245));

        // Facebook Title
        JLabel title = new JLabel("facebook");
        title.setFont(new Font("Arial", Font.BOLD, 60));
        title.setForeground(new Color(24, 119, 242));
        title.setBounds(95, 70, 320, 70);
        panel.add(title);

        // Email Field
        emailField = new JTextField();
        emailField.setBounds(40, 200, 400, 60);
        emailField.setFont(new Font("Arial", Font.PLAIN, 20));
        emailField.setBorder(new RoundedBorder(30));
        emailField.setText("Email or mobile number");
        emailField.setForeground(Color.GRAY);
        panel.add(emailField);

        // Password Field
        passwordField = new JPasswordField();
        passwordField.setBounds(40, 290, 400, 60);
        passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordField.setBorder(new RoundedBorder(30));
        passwordField.setText("Password");
        passwordField.setForeground(Color.GRAY);
        panel.add(passwordField);

        // Login Button
        loginButton = new JButton("Log in");
        loginButton.setBounds(40, 390, 400, 60);
        loginButton.setBackground(new Color(24, 119, 242));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Arial", Font.BOLD, 24));
        loginButton.setFocusPainted(false);
        loginButton.setBorder(new RoundedBorder(30));

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("Login clicked");

                JOptionPane.showMessageDialog(null,
                        "Login button clicked");
            }
        });

        panel.add(loginButton);

        // Forgot Password
        JLabel forgot = new JLabel("Forgot password?");
        forgot.setFont(new Font("Arial", Font.BOLD, 18));
        forgot.setForeground(new Color(24, 119, 242));
        forgot.setBounds(150, 480, 250, 30);
        panel.add(forgot);

        // Create Account Button
        createButton = new JButton("Create new account");
        createButton.setBounds(40, 590, 400, 60);
        createButton.setBackground(Color.WHITE);
        createButton.setForeground(new Color(24, 119, 242));
        createButton.setFont(new Font("Arial", Font.BOLD, 22));
        createButton.setFocusPainted(false);
        createButton.setBorder(new LineBorder(
                new Color(24, 119, 242), 2, true));

        createButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                System.out.println("Create account clicked");

                JOptionPane.showMessageDialog(null,
                        "Create account button clicked");
            }
        });

        panel.add(createButton);

        add(panel);
        setVisible(true);
    }

    // Rounded Border
    class RoundedBorder extends AbstractBorder {

        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public void paintBorder(Component c, Graphics g,
                                int x, int y,
                                int width, int height) {

            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(Color.LIGHT_GRAY);
            g2.drawRoundRect(
                    x, y,
                    width - 1,
                    height - 1,
                    radius,
                    radius);
        }

        public Insets getBorderInsets(Component c) {
            return new Insets(10, 15, 10, 15);
        }

        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.right = 15;
            insets.top = insets.bottom = 10;
            return insets;
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FacebookLoginGUI();
            }
        });
    }
}