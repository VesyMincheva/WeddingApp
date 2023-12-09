package bg.softuni.WeddingApp.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Map;
import java.util.UUID;
@Service
public class CloudService {
    private Cloudinary cloudinary;

    public CloudService(){
        cloudinary =new Cloudinary(ObjectUtils.asMap(
                "cloud_name", "drlwiuzbk",
                "api_key", "478428421531267",
                "api_secret", "GAaBX6HUWDq-e244nsZJsR5561Q"));
    }

    public String saveImage(MultipartFile multipartFile){
        String imageId = UUID.randomUUID().toString();
        Map params = ObjectUtils.asMap(
            "public_id", imageId,
                "overwrite", true,
                "resource_type", "image"
        );
        File tempFile = new File(imageId);
        try {
            Files.write(tempFile.toPath(), multipartFile.getBytes());
            cloudinary.uploader().upload(tempFile, params);
            Files.delete(tempFile.toPath());
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return String.format("https://res.cloudinary.com/drlwiuzbk/image/upload/v1702151064/" +
                imageId);
    }
}
