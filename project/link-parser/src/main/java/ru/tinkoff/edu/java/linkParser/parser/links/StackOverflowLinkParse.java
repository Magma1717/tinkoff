package ru.tinkoff.edu.java.linkParser.parser.links;

import ru.tinkoff.edu.java.linkParser.parser.result.ParseResult;
import ru.tinkoff.edu.java.linkParser.parser.result.StackOverflowResultRecord;

public final class StackOverflowLinkParse extends LinkParse {
    @Override
    public ParseResult check(String link) {
        String[] splitLink = link.split("/");
        if (splitLink[2].equals("stackoverflow.com") && splitLink.length > 4 && splitLink[3].equals("questions")) {
            return new StackOverflowResultRecord(splitLink[4]);
        }
        return checkNext(link);
    }
}