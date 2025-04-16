package MikuManager;

import io.github.natanimn.filters.Filter;
import io.github.natanimn.filters.FilterExecutor;

public class TextFilter implements FilterExecutor {
    private String ftext;
    TextFilter (String text) {
        ftext = text;
    }
    @Override
    public boolean execute (Filter filter) {
        return filter.texts(ftext);
    }
}
