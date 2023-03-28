package ru.tinkoff.edu.java.linkParser;

public sealed interface UrlParserResponse permits GitHubResponse, StackOverflowResponse {
}