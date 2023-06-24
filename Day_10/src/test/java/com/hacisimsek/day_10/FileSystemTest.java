package com.hacisimsek.day_10;
import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.Jimfs;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Path;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileSystemTest {

    @Autowired
    private ResourceLoader resourceLoader;

    private FileSystem fileSystem;

    @Before
    public void setup() throws IOException {
        // Create an in-memory file system using Jimfs
        fileSystem = Jimfs.newFileSystem(Configuration.unix());
    }

    @Test
    public void testFileSystem() throws IOException {
        // Use the fileSystem variable to perform your tests
        Path testFile = fileSystem.getPath("/test.txt");
        Files.createFile(testFile);
        // ... perform your assertions or further operations
    }

    @Test
    public void testResourceLoading() throws IOException {
        // Load a resource from the in-memory file system using Spring's ResourceLoader
        Resource resource = resourceLoader.getResource("jimfs:/test.txt");
        // ... perform your assertions or further operations
    }
}