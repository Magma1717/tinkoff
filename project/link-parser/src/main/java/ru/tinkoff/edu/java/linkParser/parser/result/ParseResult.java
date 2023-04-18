package ru.tinkoff.edu.java.linkParser.parser.result;

public sealed interface ParseResult permits GitHubResultRecord, StackOverflowResultRecord {
    String getResult();
}