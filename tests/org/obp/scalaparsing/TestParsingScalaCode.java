package org.obp.scalaparsing;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestParsingScalaCode {
    @Test
    public void testEmptyFunction() throws IOException {
        assertEquals(0,FoundMethodsVisitor.parseScalaFunction("").size());
    }

    @Test
    public void testHelloWorldFunction() throws IOException {
        assertEquals(0,FoundMethodsVisitor.parseScalaFunction("def hello = println(\"Hello, world!\")").size());
    }
}
