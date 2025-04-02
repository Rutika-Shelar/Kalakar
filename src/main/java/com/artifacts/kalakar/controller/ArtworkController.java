package com.artifacts.kalakar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.artifacts.kalakar.service.ArtworkService;

@Controller
@RequestMapping("/artwork")
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

    @PostMapping("/upload")
    public String uploadArtwork(@RequestParam("userId") int userId, @RequestParam("file") MultipartFile file, @RequestParam("title") String title) {
        try {
            artworkService.saveArtwork(userId, file, title);
            return "redirect:/profile";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }
}