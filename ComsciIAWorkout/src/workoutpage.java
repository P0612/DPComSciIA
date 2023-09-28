import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class workoutpage {
    private JFrame frame;

    public workoutpage() {
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

        JButton planB = new JButton("Plan");
        planB.setForeground(Color.black);
        planB.setBackground(Color.white);
        navBar.add(planB);
        planB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new planP();
            }
        });

        topPanel.add(navBar, BorderLayout.NORTH);
       
        JPanel choicesPanel = new JPanel(new GridLayout(2, 2));
        topPanel.add(choicesPanel, BorderLayout.CENTER);

        JButton bgb = new JButton("Beginner");
        JButton stb = new JButton("Standard");
        JButton avb = new JButton("Advanced");
        JButton exb = new JButton("Extreme");

        bgb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showConfirmPage("Beginner");
            }
        });
        stb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showConfirmPage("Standard");
            }
        });
        avb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showConfirmPage("Advanced");
            }
        });
        exb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showConfirmPage("Extreme");
            }
        });

        choicesPanel.add(bgb);
        choicesPanel.add(stb);
        choicesPanel.add(avb);
        choicesPanel.add(exb);

        frame.setVisible(true);
    }

    private void showConfirmPage(String difficulty) {
        JFrame confirmFrame = new JFrame("Confirm Choice");
        confirmFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        confirmFrame.setSize(500, 500);  

        JLabel label = new JLabel("Difficulty: " + difficulty);
        JButton confirm = new JButton("Confirm");

        JCheckBox armsTag = new JCheckBox("Arms");
        JCheckBox legsTag = new JCheckBox("Legs");
        JCheckBox chestTag = new JCheckBox("Chest");
        JCheckBox cardioTag = new JCheckBox("Cardio");

        JPanel tagsPanel = new JPanel();
        tagsPanel.add(armsTag);
        tagsPanel.add(legsTag);
        tagsPanel.add(chestTag);
        tagsPanel.add(cardioTag);

        String[] columnNames = {"Day 1", "Day 2", "Day 3","Day 4", "Day 5"};
        Object[][] data = {
            {"Difficulty", difficulty, "pushup", "situps", "shit"},
            {"Duration", "30 minutes", "a", "a", "a"},
        };
        
        JTable table = new JTable(data, columnNames);
        JScrollPane tableScroll = new JScrollPane(table);

        confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                StringBuilder selectedTags = new StringBuilder("Selected Tags: ");
                if (armsTag.isSelected()) selectedTags.append("Arms ");
                if (legsTag.isSelected()) selectedTags.append("Legs ");
                if (chestTag.isSelected()) selectedTags.append("Chest ");
                if (cardioTag.isSelected()) selectedTags.append("Cardio ");

                JOptionPane.showMessageDialog(confirmFrame, "You have confirmed " + difficulty + ". " + selectedTags);
                confirmFrame.dispose();
            }
        });

        confirmFrame.setLayout(new FlowLayout());
        confirmFrame.add(label);
        confirmFrame.add(tagsPanel);
        confirmFrame.add(confirm);
        confirmFrame.add(tableScroll); 

        confirmFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new workoutpage();
            }
        });
    }
}
