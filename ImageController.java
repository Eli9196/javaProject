package com.tbp.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbp.crud.entity.AccountProfile;
import org.springframework.core.io.FileSystemResource;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.util.Base64;



@RestController
@RequestMapping("/image")
public class ImageController {
    
    @GetMapping(value = "/{name}/{surname}/{filename}")
    public FileSystemResource getHttpImageLink(@PathVariable String name, @PathVariable String surname, @PathVariable String filename) {
        try {
            // Create AccountProfile object
            AccountProfile accountProfile = new AccountProfile();
            accountProfile.setName(name);
            accountProfile.setSurname(surname);
            
            // Read base64 image data from flat file
            String base64ImageData = readBase64ImageDataFromFlatFile();
            
            // Convert base64 image data to physical file
            File imageFile = convertBase64ImageDataToImage(base64ImageData, filename);
            
            // Save AccountProfile to database
            saveAccountProfileToDatabase(accountProfile);
            
            // Return the file system resource
            return new FileSystemResource(imageFile);
        } catch (IOException e) {
            // Log the error
            e.printStackTrace();
        }
        
        return null;
    }

    private String readBase64ImageDataFromFlatFile() throws IOException {
        // Read the flat file and extract the base64 image data
        // Implement your logic here
        
        return "base64ImageData";
    }
    private File convertBase64ImageDataToImage(String base64ImageData, String filename) throws IOException {
        // Decode the base64 image data
        byte[] imageData = Base64.getDecoder().decode(base64ImageData);
        
        // Create a temporary file to store the image
        File imageFile = File.createTempFile(filename, ".jpg");
        
        // Write the image data to the file
        try (FileOutputStream fos = new FileOutputStream(imageFile)) {
            fos.write(imageData);
        }
        return imageFile;
    }
    private void saveAccountProfileToDatabase(AccountProfile accountProfile) {
        // Save the AccountProfile to the database
        // Implement your logic here
    }
    public interface FileParser {
        void parseCSV(File csvFile);
        File convertCSVDataToImage(String base64ImageData);
        URI createImageLink(File imageFile);
    }


}