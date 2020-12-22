package sample;

import JavaClass.Games.Game;
import JavaClass.Weapons.Weapon;
import MCV.PlayerList;
import MCV.Sign;
import MCV.StartMatch;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;

public class gameStart {
    @FXML
    private BorderPane pane;
    @FXML
    private Label score;
    @FXML
    private ListView<Game> games;
    @FXML
    private ImageView rock;
    @FXML
    private ImageView paper;
    @FXML
    private ImageView scissors;

    @FXML
    private RadioButton rockB;
    @FXML
    private RadioButton paperB;
    @FXML
    private RadioButton scissorsB;

    private ToggleGroup toggleButton;


    public void initialize(){
        Image image1 = new Image("background.png");

        rock.setImage(new Image("rock.png"));
        paper.setImage(new Image("paper.png"));
        scissors.setImage(new Image("scissors.png"));
        rock.setFitWidth(250);
        rock.setFitHeight(250);
        paper.setFitWidth(250);
        paper.setFitHeight(250);
        scissors.setFitWidth(250);
        scissors.setFitHeight(250);

        toggleButton = new ToggleGroup();
        rockB.setToggleGroup(toggleButton);
        paperB.setToggleGroup(toggleButton);
        scissorsB.setToggleGroup(toggleButton);
        toggleButton.selectToggle(rockB);
        Sign.myPlayer.setNowWeapon(new Weapon(0 , 0 , 0 , null));

        score.setText("My score: " + Sign.myPlayer.getScore());

        games.setItems(PlayerList.getListGame());
        games.setCellFactory(new Callback<ListView<Game>, ListCell<Game>>() {
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

    @FXML
    public void handleClickRock(){
        Sign.myPlayer.setNowWeapon(new Weapon(0 , 0 , 0 , null));
        toggleButton.selectToggle(rockB);
    }

    @FXML
    public void handleClickPaper(){
        Sign.myPlayer.setNowWeapon(new Weapon(1 , 0 , 0 , null));
        toggleButton.selectToggle(paperB);
    }

    @FXML
    public void handleClickScissors(){
        Sign.myPlayer.setNowWeapon(new Weapon(2 , 0 , 0 , null));
        toggleButton.selectToggle(scissorsB);
    }

    @FXML
    public void handleClickStart() throws IOException {
        StartMatch startMatch = new StartMatch(Sign.myPlayer);

        Game game = startMatch.getGame();

        if(game.getResult().equals("Win")){
            Alert alert  = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Win!");
            alert.setHeaderText("You Win \nYou Weapon: " + game.getMyWeapon().toString()+ "\nOpponent Weapon: " + game.getOpponentWeapon().toString());
            alert.show();
        }else if(game.getResult().equals("Lose")){
            Alert alert  = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Lose!");
            alert.setHeaderText("You Lose \nYou Weapon: " + game.getMyWeapon().toString()+ "\nOpponent Weapon: " + game.getOpponentWeapon().toString());
            alert.show();
        }else {
            Alert alert  = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Equality!");
            alert.setHeaderText("Equality \nYou Weapon " + game.getMyWeapon().toString()+ "\nOpponent Weapon: " + game.getOpponentWeapon().toString());
            alert.show();
        }

        games.setItems(PlayerList.getListGame());

        score.setText("My score: " + Sign.myPlayer.getScore());
    }
    @FXML
    public void handleClickBack() throws IOException {
        Stage stage = (Stage) rock.getScene().getWindow();
        stage.close();
        Parent root = FXMLLoader.load(getClass().getResource("Start.fxml"));
        stage.setTitle("RockPaperScissors");
        stage.setScene(new Scene(root, 1000, 700));
        stage.setMaxHeight(700);
        stage.setMaxWidth(1000);
        stage.setMinWidth(1000);
        stage.setMinHeight(700);
        stage.show();
    }
}
