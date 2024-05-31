import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.event.*;


public class LoginSignupGUI {

    public static void main(String[] args) {
        // Initialize the XML file
        XMLUtils.createXMLFile();

        JFrame frame = new JFrame("Login and Sign-Up");
        frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);

        // Center the frame
        frame.setLocationRelativeTo(null);

        // Create the card layout container
        JPanel cardPanel = new JPanel(new CardLayout()) {
            private static final long serialVersionUID = 1L;
            private Image backgroundImage;

            {
                try {
                    backgroundImage = ImageIO.read(new File("background.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        // Create login panel
        JPanel loginPanel = new JPanel(new GridBagLayout());
        loginPanel.setOpaque(false); // Make it transparent

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding
        gbc.fill = GridBagConstraints.HORIZONTAL; // Fill horizontally

        JLabel loginHeadingLabel = new JLabel("Login");
        loginHeadingLabel.setFont(new Font("Arial", Font.BOLD, 18));
        loginHeadingLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(loginHeadingLabel, gbc);

        JLabel userLabel1 = new JLabel("Username:");
        userLabel1.setForeground(Color.WHITE); // Set label text color to white
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        loginPanel.add(userLabel1, gbc);

        JTextField userText1 = new JTextField();
        userText1.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        loginPanel.add(userText1, gbc);

        JLabel passLabel1 = new JLabel("Password:");
        passLabel1.setForeground(Color.WHITE); // Set label text color to white
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        loginPanel.add(passLabel1, gbc);

        JPasswordField passText1 = new JPasswordField();
        passText1.setPreferredSize(new Dimension(200, 30));
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        loginPanel.add(passText1, gbc);

        JPanel loginButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        loginButtonPanel.setOpaque(false); // Make it transparent

        JButton loginButton = new JButton("Login");
        loginButton.setPreferredSize(new Dimension(100, 30)); // Set preferred size for buttons
        JButton switchToSignupButton = new JButton("Sign Up");
        switchToSignupButton.setPreferredSize(new Dimension(100, 30)); // Set preferred size for buttons

        // Apply style to buttons
        loginButton.setBackground(Color.green.darker());
        loginButton.setForeground(Color.WHITE);
        switchToSignupButton.setBackground(new Color(50, 150, 250));
        switchToSignupButton.setForeground(Color.WHITE);

        loginButtonPanel.add(loginButton);
        loginButtonPanel.add(switchToSignupButton);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        loginPanel.add(loginButtonPanel, gbc);

        // Create sign-up panel
        JPanel signupPanel = new JPanel(new GridBagLayout());
        signupPanel.setOpaque(false); // Make it transparent

        JLabel signupHeadingLabel = new JLabel("Sign Up");
        signupHeadingLabel.setFont(new Font("Arial", Font.BOLD, 18));
        signupHeadingLabel.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        signupPanel.add(signupHeadingLabel, gbc);

        JLabel userLabel2 = new JLabel("Username:");
        userLabel2.setForeground(Color.WHITE); // Set label text color to white
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        signupPanel.add(userLabel2, gbc);

        JTextField userText2 = new JTextField();
        userText2.setPreferredSize(new Dimension(200, 30)); // Set preferred size for input fields
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        signupPanel.add(userText2, gbc);

        JLabel passLabel2 = new JLabel("Password:");
        passLabel2.setForeground(Color.WHITE); // Set label text color to white
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        signupPanel.add(passLabel2, gbc);

        JPasswordField passText2 = new JPasswordField();
        passText2.setPreferredSize(new Dimension(200, 30)); // Set preferred size for input fields
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_START;
        signupPanel.add(passText2, gbc);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setForeground(Color.WHITE); // Set label text color to white
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_END;
        signupPanel.add(emailLabel, gbc);

        JTextField emailText = new JTextField();
        emailText.setPreferredSize(new Dimension(200, 30)); // Set preferred size for input fields
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.LINE_START;
        signupPanel.add(emailText, gbc);

        JPanel signupButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        signupButtonPanel.setOpaque(false); // Make it transparent

        JButton signupButton = new JButton("Sign Up");
        signupButton.setPreferredSize(new Dimension(100, 30)); 
        JButton switchToLoginButton = new JButton("Login");
        switchToLoginButton.setPreferredSize(new Dimension(100, 30));

        // Apply style to buttons
        signupButton.setBackground(Color.green.darker());
        signupButton.setForeground(Color.WHITE);
        switchToLoginButton.setBackground(new Color(50, 150, 250));
        switchToLoginButton.setForeground(Color.WHITE);

        signupButtonPanel.add(signupButton);
        signupButtonPanel.add(switchToLoginButton);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        signupPanel.add(signupButtonPanel, gbc);

        // Add panels to card panel
        cardPanel.add(loginPanel, "Login");
        cardPanel.add(signupPanel, "Signup");

        // Add card panel to frame
        frame.add(cardPanel);

        frame.setVisible(true);
        
        
        // Switch to signup panel
        switchToSignupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) cardPanel.getLayout();
                cl.show(cardPanel, "Signup");
            }
        });

        // Switch to login panel
        switchToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) cardPanel.getLayout();
                cl.show(cardPanel, "Login");
            }
        });

        // Login button action
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText1.getText();
                String password = new String(passText1.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all the fields.");
                } else {
                    if (XMLUtils.validateUser(username, password)) {
                        JOptionPane.showMessageDialog(frame, "Login successful");
                        frame.dispose();
                        showMainWindow();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid username or password");
                    }
                }
            }
        });

        // Sign-up button action
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText2.getText();
                String password = new String(passText2.getPassword());
                String email = emailText.getText();

                if (username.isEmpty() || password.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill all the fields.");
                } else {
                    XMLUtils.addUser(username, password, email);
                    JOptionPane.showMessageDialog(frame, "Sign-up successful");
                    frame.dispose();
                    showMainWindow();
                }
            }
        });
        
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            public boolean dispatchKeyEvent(KeyEvent e) {
                if (e.getID() == KeyEvent.KEY_PRESSED && e.isControlDown() && e.getKeyCode() == KeyEvent.VK_X) {
                    frame.dispose();
                }
                return false;
            }
        });

        frame.setVisible(true);
    }
    
    private static void showMainWindow() {
        new SchoolManagementSystemGUI();
    }
}
