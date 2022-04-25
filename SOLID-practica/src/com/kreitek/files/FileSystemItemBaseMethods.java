package com.kreitek.files;

public interface FileSystemItemBaseMethods {

    String getName();
    void setName(String name);
    Directory getParent();
    void setParent(Directory directory);
    String getFullPath();
}
