package com.artifacts.kalakar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.artifacts.kalakar.entity.Artwork;

public interface ArtworkRepository extends JpaRepository<Artwork, Integer> {
	List<Artwork> findByUserId(int userId);

}
