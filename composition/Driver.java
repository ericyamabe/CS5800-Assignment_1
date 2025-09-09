package com.cs5800.composition;
import com.cs5800.composition.Folder;

public class Driver {
    public static void main(String[] args) {
        // 1st Level
        Folder phpDemo = new Folder("php_demo1");
        Folder sourceFiles = phpDemo.addSubFolder("Source Files");
        Folder includePath = phpDemo.addSubFolder("Include Path");
        Folder remoteFiles = phpDemo.addSubFolder("Remote Files");

        // 2nd Level
        Folder phalcon = sourceFiles.addSubFolder(".phalcon");
        Folder app = sourceFiles.addSubFolder("app");
        Folder cache = sourceFiles.addSubFolder("cache");
        Folder publicFolder = sourceFiles.addSubFolder("public");
        sourceFiles.addFile(".htaccess");
        sourceFiles.addFile(".htrouter.php");
        sourceFiles.addFile("index.html");

        // 3rd Level
        Folder config = app.addSubFolder("config");
        Folder controllers = app.addSubFolder("controllers");
        Folder library = app.addSubFolder("library");
        Folder migrations = app.addSubFolder("migrations");
        Folder models = app.addSubFolder("models");
        Folder views = app.addSubFolder("views");

        phpDemo.print();
    }
}