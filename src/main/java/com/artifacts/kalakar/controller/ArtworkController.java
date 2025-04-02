package com.artifacts.kalakar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.artifacts.kalakar.service.ArtworkService;


@Controller
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

   
}
