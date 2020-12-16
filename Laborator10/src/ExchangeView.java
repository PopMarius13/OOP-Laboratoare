import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ExchangeView extends JFrame {
       private JButton changeBt = new JButton(">>");
       private JTextField answer = new JTextField(25);
       private JTextField inputCoins = new JTextField(10);
       private JTextField outputCoins = new JTextField(10);
       private JComboBox comboIn ;
       private JComboBox comboOut;
       private JTextField suma = new JTextField(4);
       private JTextField total = new JTextField(4);

       private ExchangeModel model;

    public ExchangeView(ExchangeModel model) throws HeadlessException {
        this.model = model;

        suma.setText("Suma: ");
        suma.setEditable(false);
        total.setText("Total: ");
        total.setEditable(false);

        addCoins();

        this.model.setAns("RON" , "EUR", 1.);
        putAns("RON" , "EUR" , this.model.getVal());
        answer.setEditable(false);
        outputCoins.setEditable(false);
        inputCoins.setText("1");
        outputCoins.setText("");

        changeBt.setBackground(Color.BLUE);

        JPanel content = new JPanel(new GridLayout(0 , 1));
        content.setBackground(Color.DARK_GRAY);
        content.setSize(300 , 100);

        JPanel top = new JPanel(new FlowLayout());
        top.add(answer);

        JPanel center = new JPanel(new FlowLayout());
        center.add(comboIn);
        center.add(changeBt);
        center.add(comboOut);

        JPanel down = new JPanel(new FlowLayout());
        down.add(suma);
        down.add(inputCoins);
        down.add(total);
        down.add(outputCoins);

        content.add(top);
        content.add(center);
        content.add(down);

        this.setContentPane(content);
        this.pack();

        this.setTitle("Exchange");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addCoins(){
        String s[] = {"EUR" , "RON" , "USD"};
        comboIn = new JComboBox<>(s);
        comboOut = new JComboBox<>(s);

        comboIn.setSelectedItem("RON");
    }

    public void putAns (String s1 , String s2 , Double d2){
        NumberFormat formatter = new DecimalFormat("#0.0000");
        answer.setText("1 " + s1 + " = " + formatter.format(d2) + " " + s2);
    }

    public void reset(){
        this.model.setAns("RON" , "EUR" ,ExchangeModel.INITIAL_VALUE);
        putAns("RON" , "EUR" , this.model.getVal());
    }

    public String getInputCombo(){
        return comboIn.getSelectedItem() + "";
    }
    public String getOutputCombo(){
        return comboOut.getSelectedItem() + "";
    }

    public void setAns (){
        NumberFormat formatter = new DecimalFormat("#0.0000");
        Double d1;
        this.model.setAns(comboIn.getSelectedItem() + "" , comboOut.getSelectedItem() + "",  Double.valueOf(inputCoins.getText()));
        putAns(comboIn.getSelectedItem() + "" , comboOut.getSelectedItem() + "" , this.model.getVal());
        d1 = this.model.getAns();
        outputCoins.setText(formatter.format(d1));
    }

    public void addChangeListener(ActionListener change){
        changeBt.addActionListener(change);
    }

    public void changeCoins(ActionListener change){
        comboOut.addActionListener(change);
        comboIn.addActionListener(change);
    }

    void showError(String errMessage) {
        JOptionPane.showMessageDialog(this, errMessage);
    }

    public String getUserInput(){
        return inputCoins.getText();
    }
}
