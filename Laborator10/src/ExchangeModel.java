import java.util.HashMap;
import java.util.Map;

public class ExchangeModel {
    static final Double INITIAL_VALUE  = 1d;

    private final Map<String , Double> coins = new HashMap<>();
    private Double ans;
    private Double val;

    public ExchangeModel() {
        coins.put("EUR" , 4.85);
        coins.put("RON" , 1d);
        coins.put("USD" , 4d);

        reset();
    }

    public void reset(){
        ans = coins.get("EUR");
    }

    public void setAns(String coins2 , String coins1 , Double nrCoins){
        Double coin1 , coin2;
        coin1 = coins.get(coins1);
        coin2 = coins.get(coins2);

        val = coin2 / coin1;
        ans = (coin2 / coin1) * nrCoins;
    }

    public  Double getAns (){
        return ans;
    }

    public Double getVal(){
        return val;
    }
}
