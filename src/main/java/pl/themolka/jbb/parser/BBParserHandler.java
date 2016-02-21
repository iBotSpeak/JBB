package pl.themolka.jbb.parser;

import pl.themolka.jbb.BBTag;

public interface BBParserHandler {
    BBTag parse(String code) throws BBException;
}
