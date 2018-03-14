package translator;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.util.Scanner;


public class TranslationRunner extends Application {

    @FXML private ListView<String> listView = new ListView<>();
    private Scanner scanner;
    private String input;


    @Override
    public void start(Stage primaryStage) throws Exception {

        TranslationController translationController = new TranslationController();
        primaryStage.setScene(new Scene(translationController, 300, 275));
        primaryStage.show();

        translationController.getChildren().add(listView);

        // Background task
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                while (true) {
                    Platform.runLater(() -> {
                        scanner = new Scanner(System.in);
                        input = scanner.nextLine();
                        System.out.println(input);
                        listView.getItems().add(input);
                    });

                    Thread.sleep(100);
                }
            }
        };

        Thread thread = new Thread(task);
        thread.setDaemon(true);
        thread.start();

//        Parent statisticRoot = FXMLLoader.load(getClass().getResource("statistic.fxml"));
//        primaryStage.setScene(new Scene(statisticRoot, 300, 275));
//        StatisticView statisticView = new StatisticView(statisticRoot, primaryStage);
//        statisticView.show();
    }


    public static void main(String[] args) {
        // Launch application in GUI
        launch(args);
    }
}
