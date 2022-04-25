package com.kreitek.service;

import com.kreitek.files.Directory;
import com.kreitek.files.DirectoryMethods;
import com.kreitek.files.File;
import com.kreitek.files.FileSystemItemBase;

import java.util.List;

public class FileManager {

    public static int calculateSize(Directory fileSystemItem) {
        int totalSize = 0;

        if (fileSystemItem instanceof Directory) {
            totalSize = fileSystemItem.getSize();
        } else if (fileSystemItem instanceof Directory) {
            for (FileSystemItemBase item : fileSystemItem.listFiles()) {
                totalSize += calculateSize((List<File>) item);
            }
        }

        return totalSize;
    }

    public static int calculateSize(List<File> files) {
        int totalSize = 0;

        for(File item : files) {
            if (item instanceof File) {
                totalSize += item.getSize();
            } else if (item instanceof DirectoryMethods) {
                totalSize += calculateSize((Directory) ((DirectoryMethods) item).listFiles());
            }
        }

        return totalSize;
    }

    // Aquí habría otros métodos para gestionar ficheros y directorios:
    // Crear ficheros, mover ficheros, eliminar ficheros, etc.
}
