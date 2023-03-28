package ru.tinkoff.edu.java.linkParser;

import java.net.URI;

public interface UrlParser {
    void setNext(UrlParser parser);

    UrlParserResponse parse(String url);

    UrlParserResponse parseUri(URI uri);
}