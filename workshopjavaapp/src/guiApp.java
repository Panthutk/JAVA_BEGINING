package workshopjavaapp.src;

import javax.security.sasl.SaslException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiApp {

    private static JFrame frame;
    private static JPanel panel;
    private static JLabel nameLabel, natLabel, dateLabel, sexLabel;
    private static JRadioButton maleRadio, femaleRadio;
    private static JButton submit_btn, reset_btn;
    private static JTextField nameField, natField, dateField;
    private static String sex_msg;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();
            }
        });
    }

    public static void createAndShowGui() {

        frame = new JFrame();
        frame.setTitle("Workshop Java Application");
        frame.setSize(700, 700);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500, 500));

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        nameLabel = new JLabel();
        nameLabel.setForeground(Color.MAGENTA);
        nameLabel.setFont(new Font("Times", Font.BOLD, 15));
        nameLabel.setText("Name :");

        nameLabel.setBounds(10, 0, 200, 30);
        panel.add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(220, 10, 200, 30);
        nameField.setToolTipText("Please input your name");
        panel.add(nameField);

        natLabel = new JLabel();
        natLabel.setText("National :");
        natLabel.setForeground(Color.ORANGE);

        natLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        natLabel.setBounds(10, 50, 200, 40);
        panel.add(natLabel);

        natField = new JTextField();
        natField.setBounds(220, 60, 200, 30);
        natField.setToolTipText("Please input your nationality");
        panel.add(natField);

        dateLabel = new JLabel();
        dateLabel.setText("Date of Birth");
        dateLabel.setForeground(Color.MAGENTA);
        dateLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        dateLabel.setBounds(20, 100, 200, 40);
        panel.add(dateLabel);

        dateField = new JTextField();
        dateField.setBounds(220, 110, 200, 30);
        dateField.setToolTipText("Please input your DAte of birth");
        panel.add(dateField);

        sexLabel = new JLabel("Gender");
        sexLabel.setForeground(Color.YELLOW);
        sexLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        panel.add(sexLabel);

        maleRadio = new JRadioButton("Male", true);
        maleRadio.setBounds(220, 150, 100, 30);
        panel.add(maleRadio);

        femaleRadio = new JRadioButton("Female", false);
        femaleRadio.setBounds(330, 150, 100, 30);
        panel.add(femaleRadio);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(maleRadio);
        buttonGroup.add(femaleRadio);

        submit_btn = new JButton("Submit");
        submit_btn.setBounds(90, 200, 100, 30);
        panel.add(submit_btn);

        submit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (maleRadio.isSelected()) {
                    sex_msg = "male";
                } else if (femaleRadio.isSelected()) {
                    sex_msg = "female";
                }

                String msg = String.format("name : %s \nNationality %s \ndate : %s \nGender : %s ", nameField.getText(),
                        natField.getText(), dateField.getText(), sex_msg);
                JOptionPane.showMessageDialog(frame, msg, "POP UP NAME", JOptionPane.WARNING_MESSAGE);
            }
        });

        frame.pack();
    }
}