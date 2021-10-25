package com.epam.glava_10.archiv;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class UnPackJar {
    private Path destionPath;
    public static final int BUFFER = 2_048;

    public void unpack(String destinationDirectory, String nameJar) {
        try (JarFile jarFile = new JarFile(nameJar)) {
            jarFile.stream().forEach(entry -> {
                String entryname = entry.getName();
                System.out.println("Extracting: " + entry);
                destionPath = Paths.get(destinationDirectory, entryname);
                destionPath.getParent().toFile().mkdirs();
                if (!entry.isDirectory()) {
                    writeFile(jarFile, entry);
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeFile(JarFile jar, JarEntry entry) {
        int currentByte;
        byte data[] = new byte[BUFFER];
        try (BufferedInputStream bufferedInput =
                     new BufferedInputStream(jar.getInputStream(entry));
             FileOutputStream fileOutput =
                     new FileOutputStream(destionPath.toString());
             BufferedOutputStream bufferedOutput =
                     new BufferedOutputStream(fileOutput, BUFFER)) {

            while ((currentByte = bufferedInput.read(data, 0, BUFFER)) > 0) {
                bufferedOutput.write(data, 0, currentByte);
            }
        bufferedOutput.flush();
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}

