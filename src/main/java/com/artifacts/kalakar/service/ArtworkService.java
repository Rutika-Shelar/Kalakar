package com.artifacts.kalakar.service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.artifacts.kalakar.entity.Artwork;
import com.artifacts.kalakar.entity.User;
import com.artifacts.kalakar.repository.ArtworkRepository;
import com.artifacts.kalakar.repository.UserRepository;

@Service
public class ArtworkService {

    @Autowired
    private ArtworkRepository artworksRepository;

    @Autowired
    private UserRepository userRepository;
    
    User user = new User();
    
}
