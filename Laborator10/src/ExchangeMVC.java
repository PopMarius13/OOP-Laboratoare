public class ExchangeMVC {

    public static void main(String[] args) {
            ExchangeModel model = new ExchangeModel();
            ExchangeView view = new ExchangeView(model);
            ExchangeController controller = new ExchangeController(model , view);

            view.setVisible(true);
    }
}
