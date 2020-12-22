package sample;

import JavaClass.Players.ListPlayers;
import JavaClass.Players.Player;
import MCV.PlayerList;
import MCV.Sign;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.Duration;

import java.io.IOException;
import java.util.List;


public class Controller {
    private final int NUM_FRAMES = 6;
    private final int PAUSE_BETWEEN_FRAMES = 2;
    private Timeline timeline = new Timeline();
    private List<Image> images = List.of(new Image("match1.png") , new Image("match5.png") , new Image("match3.png") , new Image("match4.png") , new Image("match2.png"), new Image("image3.jpg"));
    public int j;

    @FXML
    private BorderPane paneBorder;
    @FXML
    private PasswordField pass;
    @FXML
    private TextField name;
    @FXML
    private ListView<Player> listPlayer;
    @FXML
    private ImageView image = new ImageView();

    public void initialize() throws IOException {
        Image image1 = new Image("background.png");
        listPlayer.setMouseTransparent(true);

        paneBorder.setBackground(new Background(new BackgroundImage(image1 , BackgroundRepeat.NO_REPEAT , BackgroundRepeat.NO_REPEAT , BackgroundPosition.CENTER , BackgroundSize.DEFAULT)));
        image.setFitWidth(600);
        image.setFitHeight(350);

        for (int i = 0; i < NUM_FRAMES; i++)  {
            timeline.getKeyFrames().add(
                    new KeyFrame(
                            Duration.seconds((i) * PAUSE_BETWEEN_FRAMES),
                            new KeyValue(image.imageProperty(), images.get(i))
                    )
            );
        }

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        if(ListPlayers.list.isEmpty()) {
            ListPlayers.loadPlayers();
        }else{
            ListPlayers.storePlayers();
        }

        listPlayer.setItems(PlayerList.getListPlayer());
        j = 0;
        listPlayer.setCellFactory(new Callback<ListView<Player>, ListCell<Player>>() {
            @Override
            public ListCell<Player> call(ListView<Player> playerListView) {
                ListCell<Player> cell = new ListCell<>(){
                    @Override
                    protected void updateItem(Player player, boolean b) {
                        super.updateItem(player, b);
                        if(b){
                            setText(null);
                        }else{
                            setText("" + j + ". "  + player.toString());
                            j++;
                        }
                    }
                };
                return cell;
            }
        });
    }

    @FXML
    public void handleClickSignIn() throws IOException {
        if(Sign.singIn(name.getText() , pass.getText())){
            Stage stage = (Stage) paneBorder.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
            stage.setTitle("RockPaperScissors");
            stage.setScene(new Scene(root, 1000, 700));
            stage.setMaxHeight(700);
            stage.setMaxWidth(1000);
            stage.setMinWidth(1000);
            stage.setMinHeight(700);
            stage.show();
        }else{
            Alert alert  = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Incorrect username or password.");
            alert.show();
        }
    }
    @FXML
    public void handleClickSingUp() throws IOException {
        if(Sign.singUp(name.getText() , pass.getText())){
            Stage stage = (Stage) paneBorder.getScene().getWindow();
            stage.close();
            Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
            stage.setTitle("RockPaperScissors");
            stage.setScene(new Scene(root, 1000, 700));
            stage.setMaxHeight(700);
            stage.setMaxWidth(1000);
            stage.setMinWidth(1000);
            stage.setMinHeight(700);
            stage.show();
        }else{
            Alert alert  = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Username must be unique");
            alert.show();
        }
    }

}
