package cs5800.test.java;
import org.junit.Assert;
import org.junit.Test;

import cs5800.assignment1.utils.composition.File;
import cs5800.assignment1.utils.composition.Folder;

public class TestComposition {
    public final Folder folder = new Folder();
    public final File file = new File();

    @Test
    void testFolder() {
        // Variable Setup
        final String name = "Test Folder";

        // Setup objects
        this.folder.setName(name);

        // Start testing
        Assert.assertEquals(this.folder.getName(), name);
    }

    @Test
    void testFile() {
        // Variable Setup
        final String name = "Test File";

        // Setup objects
        this.file.setName(name);

        // Start testing
        Assert.assertEquals(this.file.getName(), name);
    }

    @Test
    void testFolderWithSubFolder() {
        // Variable Setup
        final String name = "Test Folder";
        final String subFolderName = "Sub Folder";

        // Setup objects
        final Folder subFolder = new Folder(subFolderName);

        this.folder.setName(name);
        this.folder.addSubFolder(subFolder);

        // Start testing
        Folder assertedSubFolder = this.folder.getSubFolder(0);

        Assert.assertEquals(this.folder.getName(), name);
        Assert.assertEquals(assertedSubFolder.getName(), subFolderName);
    }

    @Test
    void testFolderWithFile() {
        // Variable Setup
        final String name = "Test Folder";
        final String fileName = "Test File";

        // Setup objects
        this.file.setName(name);
        this.folder.setName(name);
        this.folder.addFile(this.file);

        // Start testing
        File assertedFile = this.folder.getFile(0);


        Assert.assertEquals(this.folder.getName(), name);
        Assert.assertEquals(assertedFile.getName(), fileName);
    }

    @Test
    void testFolderWithSubFolderAndFile() {
        // Variable Setup
        final String name = "Test Folder";
        final String subFolderName = "Sub Folder";
        final String fileName = "Test File";

        // Setup objects
        final Folder subFolder = new Folder(subFolderName);
        this.file.setName(name);
        this.folder.setName(name);
        this.folder.addSubFolder(subFolder);
        this.folder.addFile(this.file);

        // Start testing
        Folder assertedSubFolder = this.folder.getSubFolder(0);
        File assertedFile = this.folder.getFile(0);

        Assert.assertEquals(this.folder.getName(), name);
        Assert.assertEquals(assertedSubFolder.getName(), subFolderName);
        Assert.assertEquals(assertedFile.getName(), fileName);
    }
}
