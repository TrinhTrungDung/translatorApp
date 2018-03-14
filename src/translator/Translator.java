package translator;

import java.util.HashMap;

public interface Translator {
    String translate(String input);
    HashMap<String, String> getMapping();
}
