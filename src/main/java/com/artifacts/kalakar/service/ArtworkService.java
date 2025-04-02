package com.artifacts.kalakar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.artifacts.kalakar.entity.User;
import com.artifacts.kalakar.entity.Artwork;
import com.artifacts.kalakar.repository.ArtworkRepository;
import com.artifacts.kalakar.repository.UserRepository;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

@Service
public class ArtworkService {

    @Autowired
    private ArtworkRepository artworkRepository;

    @Autowired
    private UserRepository userRepository;

    public void saveArtwork(int userId, MultipartFile file, String title) throws IOException {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            Artwork artwork = new Artwork();
            artwork.setTitle(title);
            artwork.setFile(file.getBytes());
            artwork.setUser(user);
            
            
            artworkRepository.save(artwork);
            
        }
    }
}
