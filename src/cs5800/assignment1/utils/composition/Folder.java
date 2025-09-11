package cs5800.assignment1.utils.composition;
import cs5800.assignment1.utils.composition.File;

public class Folder {
    private String name;
    private Folder[] subFolders = new Folder[20];
    private File[] files = new File[20];
    private int folderIndex = 0;
    private int fileIndex = 0;

    public Folder() {
        this.setName("");
    }

    public Folder(String name){
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean hasSubFoldersOrFiles() {
        if(this.folderIndex > 0) {
            return true;
        }

        if(this.fileIndex > 0) {
            return true;
        }

        return false;
    }

    private void setFolderIndex(int index) {
        this.folderIndex = index;
    }

    private int getFolderIndex() {
        return this.folderIndex;
    }

    private void setFileIndex(int index) {
        this.fileIndex = index;
    }

    private int getFileIndex() {
        return this.fileIndex;
    }

    public Folder addSubFolder(String folderName) {
        int currentIndex = this.getFolderIndex();
        int nextIndex = currentIndex + 1;
        this.subFolders[currentIndex] = new Folder(folderName);
        this.setFolderIndex(nextIndex);

        return this.subFolders[currentIndex];
    }

    public Folder getSubFolder(int folderIndex) {
        return this.subFolders[folderIndex];
    }

    public File addFile(String fileName) {
        int currentIndex = this.getFileIndex();
        int nextIndex = currentIndex + 1;

        this.files[currentIndex] = new File(fileName);
        this.setFileIndex(nextIndex);

        return this.files[currentIndex];
    }

    public File getFile(int index) {
        return this.files[index];
    }

    public void print(int level) {
        int nextLevel = level + 1;
        String prepend = "";

        if(level >= 1) {
            for(int i = 0; i < level; i++) {
                prepend = prepend + "  ";
            }
        }

        // First print Folders
        System.out.println(prepend + " - " + this.name + "(d)");
        int folderIndex = this.getFolderIndex();
        for(int i = 0; i < folderIndex; i++) {
            Folder folder = this.getSubFolder(i);
            folder.print(nextLevel);
        }

        // Next print files
        int fileIndex = this.getFileIndex();
        for(int i = 0; i < fileIndex; i++) {
            File subfile = this.getFile(i);
            String fileName = subfile.getName();
            System.out.println(prepend + prepend + " - " + fileName + "(f)");
        }
    }
}
