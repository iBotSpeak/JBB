package pl.themolka.jbb.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.nio.charset.Charset;
import pl.themolka.jbb.BBTag;

public class BBParser {
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
    private final BBParserHandler handler;

    public BBParser() {
        this(new BBDefaultParser());
    }

    public BBParser(BBParserHandler handler) {
        this.handler = handler;
    }

    public BBTag parse(File file) throws BBException, IOException {
        return this.parse(file, DEFAULT_CHARSET);
    }

    public BBTag parse(File file, Charset charset) throws BBException, IOException {
        return this.parse(new FileInputStream(file), charset);
    }

    public BBTag parse(InputStream stream) throws BBException, IOException {
        return this.parse(stream, DEFAULT_CHARSET);
    }

    public BBTag parse(InputStream stream, Charset charset) throws BBException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream, charset));
        StringBuilder builder = new StringBuilder();

        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line).append("\n");
        }

        reader.close();
        return this.parse(builder.toString());
    }

    public BBTag parse(String code) throws BBException {
        return this.parseTag(code);
    }

    protected BBParserHandler getHandler() {
        return this.handler;
    }

    protected final BBTag parseTag(String code) throws BBException {
        return this.getHandler().parse(code);
    }
}
