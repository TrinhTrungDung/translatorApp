package translator;

import java.util.HashMap;

public class NumberTranslator implements Translator {
    private HashMap<String, String> numberMapping = new HashMap<>();

    NumberTranslator() {
        numberMapping.put("one", "eins");
        numberMapping.put("two", "zwei");
        numberMapping.put("three", "drei");
        numberMapping.put("four", "vier");
        numberMapping.put("five", "fünf");
        numberMapping.put("six", "sechs");
        numberMapping.put("seven", "sieben");
        numberMapping.put("eight", "acht");
        numberMapping.put("nine", "neun");
        numberMapping.put("ten", "zehn");
        numberMapping.put("eleven", "elf");
        numberMapping.put("twelve", "zwölf");
        numberMapping.put("thirteen", "dreizehn");
        numberMapping.put("fourteen", "vierzehn");
        numberMapping.put("fifteen", "fünfzehn");
        numberMapping.put("sixteen", "sechzehn");
        numberMapping.put("seventeen", "siebzehn");
        numberMapping.put("eighteen", "achtzehn");
        numberMapping.put("nineteen","neunzehn" );
        numberMapping.put("twenty", "zwanzig");
    }

    @Override
    public String translate(String input) {
        PerformedTranslation performedTranslation;

        if (numberMapping.containsKey(input)) {
            performedTranslation = new PerformedTranslation(input, numberMapping.get(input));
            System.out.println(numberMapping.get(input));
            return performedTranslation.getEn() + "," + performedTranslation.getGer();
        } else {
            throw new IllegalArgumentException("Invalid parameter");
        }
    }

    @Override
    public HashMap<String, String> getMapping() {
        return numberMapping;
    }
}
