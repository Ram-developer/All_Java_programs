import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
class OnlineTest extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    JLabel label;
    JRadioButton[] radioButton = new JRadioButton[5];
    JButton btnNext, btnBookmark;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, now = 0;
    int[] m = new int[10];
    OnlineTest(String s) {
        super(s);
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButton[i] = new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }
        btnNext = new JButton("Next");
        btnBookmark = new JButton("Bookmark");
        btnNext.addActionListener(this);
        btnBookmark.addActionListener(this);
        add(btnNext);
        add(btnBookmark);
        set();
        label.setBounds(30, 40, 450, 20);
        radioButton[0].setBounds(50, 80, 450, 20);
        radioButton[1].setBounds(50, 110, 200, 20);
        radioButton[2].setBounds(50, 140, 200, 20);
        radioButton[3].setBounds(50, 170, 200, 20);
        btnNext.setBounds(100, 240, 100, 30);
        btnBookmark.setBounds(270, 240, 100, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(600, 350);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNext) {
            if (check())
                count = count + 1;
            current++;
            set();
            if (current == 9) {
                btnNext.setEnabled(false);
                btnBookmark.setText("Result");
            }
        }
        if (e.getActionCommand().equals("Bookmark")) {
            JButton bk = new JButton("Bookmark" + x);
            bk.setBounds(480, 20 + 30 * x, 100, 30);
            add(bk);
            bk.addActionListener(this);
            m[x] = current;
            x++;
            current++;
            set();
            if (current == 9)
                btnBookmark.setText("Result");
            setVisible(false);
            setVisible(true);
        }
        for (int i = 0, y = 1; i < x; i++, y++) {
            if (e.getActionCommand().equals("Bookmark" + y)) {
                if (check())
                    count = count + 1;
                now = current;
                current = m[y];
                set();
                ((JButton) e.getSource()).setEnabled(false);
                current = now;
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            current++;
            JOptionPane.showMessageDialog(this, "correct answers= " + count);
            System.exit(0);
        }
    }
    void set() {
        radioButton[4].setSelected(true);
        if (current == 0) {
            label.setText("Que1:  SAFAR mess crash?");
            radioButton[0].setText("Jonny Singh");
            radioButton[1].setText("Natasa Malcova");
            radioButton[2].setText("Mia Khalifa");
            radioButton[3].setText("All gay man");
        }
        if (current == 1) {
            label.setText("Que2:  What is the total SAFAR mess candidate?");
            radioButton[0].setText("TWO");
            radioButton[1].setText("FIVE");
            radioButton[2].setText("THREE");
            radioButton[3].setText("FOUR");
        }
        if (current == 2) {
            label.setText("Que3: SAFAR mess target?");
            radioButton[0].setText("AMAZON");
            radioButton[1].setText("MICROSOFT");
            radioButton[2].setText("GOOGLE");
            radioButton[3].setText("TCS");
        }
        if (current == 3) {
            label.setText("Que4: Penis length of Azahar?");
            radioButton[0].setText("4 inch");
            radioButton[1].setText("5 inch");
            radioButton[2].setText("6 inch");
            radioButton[3].setText("7 inch");
        }
        if (current == 4) {
            label.setText("Que5:  Penis length of Nooralam?");
            radioButton[0].setText("2 inch");
            radioButton[1].setText("3 inch");
            radioButton[2].setText("4 inch");
            radioButton[3].setText("5 inch");
        }
        if (current == 5) {
            label.setText("Que6: Total girl friend of Mojaffar Ansari?");
            radioButton[0].setText("Zero");
            radioButton[1].setText("One");
            radioButton[2].setText("Two");
            radioButton[3].setText("Infinite");
        }
        if (current == 6) {
            label.setText("Que7:  Total x-gf of Nooralam Rahaman?");
            radioButton[0].setText("10(Before passed 10th class.)");
            radioButton[1].setText("20(Before passed 12th class.)");
            radioButton[2].setText("30(Before passed Diploma.)");
            radioButton[3].setText("40(Continue including present gf Priya)");
        }
        if (current == 7) {
            label.setText("Que8:  House location of Ramprasad Mandal?");
            radioButton[0].setText("Murshidabad");
            radioButton[1].setText("Bankura");
            radioButton[2].setText("Purba Medinipur");
            radioButton[3].setText("Paschim Medinipur");
        }
        if (current == 8) {
            label.setText("Que9: House location of Panulal Azahar");
            radioButton[0].setText("Murshidabad");
            radioButton[1].setText("Delhi");
            radioButton[2].setText("Dargeeling");
            radioButton[3].setText("Goa");
        }
        if (current == 9) {
            label.setText("Que10: House location of Naralam?");
            radioButton[0].setText("Paschim Medinipur");
            radioButton[1].setText("Purba Medinipur");
            radioButton[2].setText("Bankura");
            radioButton[3].setText("Birbhum");
        }
        label.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            radioButton[j].setBounds(50, 80 + i, 200, 20);
    }
    boolean check() {
        if (current == 0)
            return (radioButton[1].isSelected());
        if (current == 1)
            return (radioButton[1].isSelected());
        if (current == 2)
            return (radioButton[0].isSelected());
        if (current == 3)
            return (radioButton[2].isSelected());
        if (current == 4)
            return (radioButton[0].isSelected());
        if (current == 5)
            return (radioButton[0].isSelected());
        if (current == 6)
            return (radioButton[3].isSelected());
        if (current == 7)
            return (radioButton[2].isSelected());
        if (current == 8)
            return (radioButton[0].isSelected());
        if (current == 9)
            return (radioButton[1].isSelected());
        return false;
    }
    public static void main(String[] s) {
        new OnlineTest("Online Test App");
    }
}
