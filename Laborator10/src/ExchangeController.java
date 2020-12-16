import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExchangeController {
    private ExchangeModel modelE;
    private ExchangeView modelV;

    public ExchangeController(ExchangeModel modelE, ExchangeView modelV) {
        this.modelE = modelE;
        this.modelV = modelV;

        modelV.addChangeListener(new addChangeListener());
        modelV.changeCoins(new changeCoins());
    }

    class addChangeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                userInput = modelV.getUserInput();
                modelV.setAns();
            }catch (NumberFormatException err){
                modelV.showError(err.getMessage());
            }
        }
    }

    class changeCoins implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           modelV.setAns();
        }
    }

}


