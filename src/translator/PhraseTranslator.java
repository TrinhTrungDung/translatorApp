package translator;

import java.util.HashMap;

public class PhraseTranslator implements Translator {
    private HashMap<String, String> phraseMapping = new HashMap<>();

    PhraseTranslator() {
        phraseMapping.put("hello", "hallo");
        phraseMapping.put("play", "spielen");
        phraseMapping.put("read", "lesen");
        phraseMapping.put("how are you", "Wie geht es dir");
        phraseMapping.put("where are you from", "woher kommen Sie");
        phraseMapping.put("teacher","Lehrer" );
        phraseMapping.put("money", "Geld");
        phraseMapping.put("who are you", "Wer bist du?");
        phraseMapping.put("Germany", "Deutschland");
        phraseMapping.put("Vietnamese","Vietnamesisch");
    }

    @Override
    public String translate(String input) {
        PerformedTranslation performedTranslation;

        if(phraseMapping.containsKey(input)) {
            performedTranslation = new PerformedTranslation(input, phraseMapping.get(input));
            System.out.println(phraseMapping.get(input));
            return performedTranslation.getEn() + "," + performedTranslation.getGer();
        } else {
            throw new IllegalArgumentException("Invalid parameter");
        }
    }

    @Override
    public HashMap<String, String> getMapping() {
        return phraseMapping;
    }
}
