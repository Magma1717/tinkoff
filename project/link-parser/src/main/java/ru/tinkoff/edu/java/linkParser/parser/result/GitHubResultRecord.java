package ru.tinkoff.edu.java.linkParser.parser.result;

public record GitHubResultRecord(String userName, String repository) implements ParseResult {
    @Override
    public String getResult() {
        return userName + "/" + repository;
    }
}