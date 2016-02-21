# JBB Java Library

> Here **is** _an_ ~~example~~ of **The [JBB Java Library](https://github.com/iBotSpeak/JBB)**.

### Code example

```java
JBBCode code = new JBBCode();

code.getRoot().addText("Here "); // raw text
code.getRoot().add(new BBBold("is")); // bold
code.getRoot().add(new BBItalic(" an ")); // italic
code.getRoot().add(new BBTag("s", null, "example")); // custom
code.getRoot().addText(" of ");

BBBold brand = new BBBold(); // new tag object
brand.addText("The ");
brand.add(new BBTag("url", "https://github.com/iBotSpeak/JBB", "JBB Java Library")); // custom tag with an attribute

code.getRoot().add(brand); // add a child to the parent tag
code.getRoot().addText(".");

System.out.println(code.toString());
```

Prints the following:

```bbcode
Here [b]is[/b][i] an [/i][s]example[/s] of [b]The [url="https://github.com/iBotSpeak/JBB"]JBB Java Library[/url][/b].
```

### Layouts

```java
JBBCode layoutsCode = new JBBCode();

// your code goes here...
layoutsCode.getRoot().add(code.getRoot());

try {
    layoutsCode.executeLayout(new TagCaseLayout(TagCaseLayout.TagCaseState.UPPER_CASE));
} catch (BBLayoutException ex) {
    ex.printStackTrace();
}

System.out.println(layoutsCode.toString());
```

Will give:

```bbcode
Here [B]is[/B][I] an [/I][S]example[/S] of [B]The [URL="https://github.com/iBotSpeak/JBB"]JBB Java Library[/URL][/B].
```
