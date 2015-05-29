import javax.swing.*;


/**
 * Created by abhayphougat on 5/30/15.
 */
public class SampleForm extends JFrame{
    private JButton shouldIDoItButton;
    private JPanel rootPanel;
    private JLabel response;

    public SampleForm() {
        super("Hello World");
        
        shouldIDoItButton.addActionListener(event ->
                response.setText("dont do it you might regret it !!!"));
        shouldIDoItButton.addActionListener(event ->
                response.setText("do it do it, you will miss it otherwise"));
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }


}
