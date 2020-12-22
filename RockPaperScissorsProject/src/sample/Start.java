package sample;

import JavaClass.Games.Game;
import JavaClass.Players.Player;
import MCV.PlayerList;
import MCV.Sign;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;

public class Start {
    @FXML
    private  BorderPane pane;
    @FXML
    private ListView<Game> matches;
    @FXML
    private Label playerLabel;
    @FXML
    private ListView<Player> players;

    public int i = 1;

    public void initialize(){
        Image image1 = new Image("background.png");
        players.setMouseTransparent(true);
        pane.setBackground(new Background(new BackgroundImage(image1 , BackgroundRepeat.NO_REPEAT , BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER , BackgroundSize.DEFAULT)));


        players.setItems(PlayerList.getListPlayer());
        matches.setItems(PlayerList.getListGame());

        i = 0;
        players.setCellFactory(new Callback<ListView<Player>, ListCell<Player>>() {
            @Override
            public ListCell<Player> call(ListView<Player> playerListView) {
                ListCell<Player> cell = new ListCell<>(){
                    @Override
                    protected void updateItem(Player player, boolean b) {
                        super.updateItem(player, b);
                        if(b){
                            setText(null);
                        }else{
                            setText("" + i + ". "  + player.toString());
                            i++;
                            if(player.getName().equals(Sign.myPlayer.getName())){
                                setTextFill(Color.RED);
                                playerLabel.setText(player.toString());
                            }
                        }
                    }
                };
                return cell;
            }
        });
        matches.setCellFactory(new Callback<ListView<Game>, ListCell<Game>>() {
            @Override
            public ListCell<Game> call(ListView<Game> gameListView) {
                ListCell<Game> cell = new ListCell<>(){
                    @Override
                    protected void updateItem(Game game, boolean b) {
                        super.updateItem(game, b);
                        if(b){
                            setText(null);
                        }else{
                            setText(game.toString());
                        }

                    }
                };
                return cell;
            }
        });

    }

    public void handleClickPlay() throws IOException {
        Stage stage = (Stage) playerLabel.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("GameStart.fxml"));
        stage.setTitle("RockPaperScissors");
        stage.setScene(new Scene(root, 1000, 700));
        stage.setMaxHeight(700);
        stage.setMaxWidth(1000);
        stage.setMinWidth(1000);
        stage.setMinHeight(700);
        stage.show();
    }

    public void handleClickSignOut() throws IOException{
        Stage stage = (Stage) playerLabel.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("RockPaperScissors");
        stage.setScene(new Scene(root, 1000, 700));
        stage.setMaxHeight(700);
        stage.setMaxWidth(1000);
        stage.setMinWidth(1000);
        stage.setMinHeight(700);
        stage.show();
    }
}
