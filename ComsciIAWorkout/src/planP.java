import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class planP {
private JFrame frame;
	public planP() {
		// TODO Auto-generated constructor stub
	    frame = new JFrame("Workout Choices");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel topPanel = new JPanel(new BorderLayout());
        frame.add(topPanel);

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
        navBar.add(homeB);
        homeB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new homePage();
            }
        });

        JButton workoutsB = new JButton("Workouts");
        workoutsB.setForeground(Color.black);
        workoutsB.setBackground(Color.white);
        navBar.add(workoutsB);
        workoutsB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new workoutpage();
            }
        });

        JButton planB = new JButton("Plan");
        planB.setForeground(Color.black);
        planB.setBackground(Color.white);
        navBar.add(planB);

        topPanel.add(navBar, BorderLayout.NORTH);
	}
	  public static void main(String[] args) {
	        SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                new planP();
	            }
	        });
	    }
}
