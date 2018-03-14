package translator;

import java.io.File;

public class ExternalDatabase {
    private File file;
    private SavePerformedTranslations savePerformedTranslations;

    ExternalDatabase(String fileName) {
        this.file = ;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        if (!file.exists()) {
            file = new File();
        }
        this.file = file;
    }

    public SavePerformedTranslations getSavePerformedTranslations() {
        return savePerformedTranslations;
    }

    public void setSavePerformedTranslations(SavePerformedTranslations savePerformedTranslations) {
        this.savePerformedTranslations = savePerformedTranslations;
    }

    public void save() {

    }
}