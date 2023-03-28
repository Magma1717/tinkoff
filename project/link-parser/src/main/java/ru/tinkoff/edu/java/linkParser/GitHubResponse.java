package ru.tinkoff.edu.java.linkParser;


public record GitHubResponse(String user, String repository) implements UrlParserResponse {
}