package pl.themolka.jbb.parser;

import pl.themolka.jbb.BBTag;

public class BBDefaultParser implements BBParserHandler {
    @Override
    public BBTag parse(String code) throws BBException {
        // TODO :D
        return new BBTag().addText(code);
    }
}
