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
            label.setText("Que1:  Which of the following option leads to the portability and security of Java?");
            radioButton[0].setText("The applet makes the Java code secure and portable");
            radioButton[1].setText("Bytecode is executed by JVM");
            radioButton[2].setText("Use of exception handling");
            radioButton[3].setText("Dynamic binding between objects");
        }
        if (current == 1) {
            label.setText("Que2:  Which of the following is not a Java features?");
            radioButton[0].setText("Dynamic");
            radioButton[1].setText("Use of pointers");
            radioButton[2].setText("Architecture neutral");
            radioButton[3].setText("Object oriented");
        }
        if (current == 2) {
            label.setText("Que3: The \\u0021 article referred to as a");
            radioButton[0].setText("Unicode escape sequence");
            radioButton[1].setText("Octal escape");
            radioButton[2].setText("Hexadecimal");
            radioButton[3].setText("Line feed");
        }
        if (current == 3) {
            label.setText("Que4: _____ is used to find and fix bugs in the Java programs.");
            radioButton[0].setText("JVM");
            radioButton[1].setText("JRE");
            radioButton[2].setText("JDK");
            radioButton[3].setText("JDB");
        }
        if (current == 4) {
            label.setText("Que5:  Which of the following is a valid declaration of a char?");
            radioButton[0].setText("char ch = '\\utea';");
            radioButton[1].setText("char ca = 'tea';");
            radioButton[2].setText("char cr = \\u0223;");
            radioButton[3].setText("char cc = '\\itea';");
        }
        if (current == 5) {
            label.setText("Que6: What is the return type of the hashCode() method in the Object class?");
            radioButton[0].setText("Int");
            radioButton[1].setText("Object");
            radioButton[2].setText("Long");
            radioButton[3].setText("Void");
        }
        if (current == 6) {
            label.setText("Que7:  Which of the following is a valid long literal?");
            radioButton[0].setText("BH002837");
            radioButton[1].setText("L3637300");
            radioButton[2].setText("00465743");
            radioButton[3].setText("0xnf029L");
        }
        if (current == 7) {
            label.setText("Que8:  What does the expression float a = 35 / 0 return?");
            radioButton[0].setText("0");
            radioButton[1].setText("Not a number");
            radioButton[2].setText("Infinity");
            radioButton[3].setText("Run time exception");
        }
        if (current == 8) {
            label.setText("Que9: Evaluate the following Java expression, if x=3, y=5, and z=10:");
            radioButton[0].setText("24");
            radioButton[1].setText("98");
            radioButton[2].setText("46");
            radioButton[3].setText("25");
        }
        if (current == 9) {
            label.setText("Que10: Which of the following tool is used to generate API documentation " +
                    "in HTML format from doc comments in source code??");
            radioButton[0].setText("Javadoc tool");
            radioButton[1].setText("javaw command");
            radioButton[2].setText("javap tool");
            radioButton[3].setText("javah command");
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
