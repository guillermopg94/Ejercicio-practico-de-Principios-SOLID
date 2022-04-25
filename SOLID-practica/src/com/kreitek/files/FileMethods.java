package com.kreitek.files;

public interface FileMethods {
    String getExtension();
    int getSize();
    void open();
    void close();
    void setPosition(int numberOfBytesFromBeginning);
    byte[] read(int numberOfBytesToRead);
    void write(byte[] buffer);
}
