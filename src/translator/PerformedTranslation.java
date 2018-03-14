package translator;

public class PerformedTranslation {
    private String ger;
    private String en;

    PerformedTranslation(String en, String ger) {
        this.ger = ger;
        this.en = en;
    }

    public String getGer() {
        return ger;
    }

    public String getEn() {
        return en;
    }

    public void setGer(String ger) {
        this.ger = ger;
    }

    public void setEn(String en) {
        this.en = en;
    }
}