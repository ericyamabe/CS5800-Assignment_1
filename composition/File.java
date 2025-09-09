package com.cs5800.composition;

public class File {
    private String name;
    private String content;

    public File() {
        this.setName("");
        this.setContent("");
    }

    public File(String name) {
        this.setName(name);
        this.setContent("");
    }

    public File(String name, String content) {
        this.setName(name);
        this.setContent(content);        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }
}