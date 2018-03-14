package translator;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class StatisticView extends Stage {

    private Parent root;
    private Stage stage;

    public StatisticView(Parent translationRoot, Stage primaryStage) {
        this.root = root;
        this.stage = stage;
    }

    public Parent getRoot() {
        return root;
    }

    public Stage getStage() {
        return stage;
    }
}
