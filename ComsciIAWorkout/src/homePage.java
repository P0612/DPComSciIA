import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class homePage {
    private JFrame frame;

    public homePage() {
        frame = new JFrame("WorkOut Home");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel mainPanel = new JPanel(new BorderLayout());
        frame.add(mainPanel);

        JPanel topPanel = new JPanel(new BorderLayout());

        // Navigation bar
        JPanel navBar = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        navBar.setBackground(Color.DARK_GRAY);

        JButton logoutB = new JButton("Logout");
        logoutB.setForeground(Color.black);
        logoutB.setBackground(Color.white);
        navBar.add(logoutB);
        logoutB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new mainworkout();
            }
        });

        JButton homeB = new JButton("Home");
        homeB.setForeground(Color.black);
        homeB.setBackground(Color.white);


        JButton workoutsB = new JButton("Workouts");
        workoutsB.setForeground(Color.black);
        workoutsB.setBackground(Color.white);
        workoutsB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	new workoutpage();
            }
        });

        JButton planB = new JButton("Plan");
        planB.setForeground(Color.black);
        planB.setBackground(Color.white);
        planB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new planP();
            }
        });

        navBar.add(homeB);
        navBar.add(workoutsB);
        navBar.add(planB);

        topPanel.add(navBar, BorderLayout.NORTH);


        JLabel title = new JLabel("Welcome to WorkOut!");
        title.setFont(new Font("Arial", Font.BOLD, 30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        topPanel.add(title, BorderLayout.SOUTH);

        mainPanel.add(topPanel, BorderLayout.NORTH);

        // Image placeholder
        JLabel imagePlaceholder = new JLabel("Image", SwingConstants.CENTER);
        mainPanel.add(imagePlaceholder, BorderLayout.CENTER);

        JLabel description = new JLabel("Text", SwingConstants.CENTER);
        mainPanel.add(description, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new homePage();
                	
            }
        });
    }
}
