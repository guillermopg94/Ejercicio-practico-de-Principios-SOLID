package com.kreitek.files;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemItemBase implements DirectoryMethods {

    private final List<File> files;

    public Directory(Directory parent, String name) {
        super( parent, name);
        files = new ArrayList<>();
        // Aquí vendría lógica que rellena la lista de ficheros
    }


    @Override
    public List<File> listFiles() {
        return files;
    }



    @Override
    public void addFile(File file) {
        if (!files.contains(file)) {
            files.add(file);
            file.setParent(this);
        }
    }


    @Override
    public void removeFile(File file) {
        files.remove(file);
    }

    @Override
    public int getSize() {
        return 0;
    }


}
