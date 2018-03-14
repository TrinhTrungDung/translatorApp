package translator;

import javafx.scene.Parent;
import javafx.stage.Stage;

public class TranslationView extends Stage {

    private Parent root;
    private Stage stage;

    TranslationView(Parent root, Stage stage) {
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
