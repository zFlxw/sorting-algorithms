package com.github.zflxw.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 * Just a helper class for IO.
 */
public class FileUtils {
    public static int[] getInput(Class<?> clazz) {
        File file;
        try {
            file = FileUtils.loadResourceFile(clazz, "input.txt");
            return FileUtils.readFileLines(file).stream().mapToInt(Integer::parseInt).toArray();
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> readFileLines(File file) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = Files.newBufferedReader(file.toPath());

        bufferedReader.lines().forEach(list::add);
        bufferedReader.close();

        return list;
    }

    public static File loadResourceFile(Class<?> clazz, String fileName) throws URISyntaxException {
        ClassLoader classLoader = clazz.getClassLoader();
        URL resource = classLoader.getResource(fileName);

        if (resource == null) {
            throw new IllegalArgumentException("File not found! " + fileName);
        } else {
            return new File(resource.toURI());
        }
    }
}
