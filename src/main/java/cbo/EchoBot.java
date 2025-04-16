package cbo;
import io.github.natanimn.filters.Filter;

public class EchoBot extends Bot{
    EchoBot (String TOKEN) {
        super(TOKEN);
        addCommand(filter -> filter.commands("start"), new StartMessage()).
        addCommand(Filter::text, new EchoMessage());

    }
}
