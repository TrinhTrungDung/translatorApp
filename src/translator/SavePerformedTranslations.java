package translator;

import java.util.ArrayList;
import java.util.List;

public class SavePerformedTranslations {
    private List<PerformedTranslation> performedTranslations = new ArrayList<PerformedTranslation>();

    SavePerformedTranslations() {}

    public List<PerformedTranslation> getPerformedTranslations() {
        return performedTranslations;
    }

    public void add(PerformedTranslation performedTranslation) {
        performedTranslations.add(performedTranslation);
    }


}
