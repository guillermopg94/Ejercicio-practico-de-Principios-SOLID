package com.kreitek.files;

import java.util.List;

public interface DirectoryMethods {
    List<File> listFiles();
    void addFile(File file);
    void removeFile(File file);
    int getSize();
}
