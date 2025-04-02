package com.artifacts.kalakar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.artifacts.kalakar.entity.Artwork;
import com.artifacts.kalakar.entity.User;

public interface ArtworkRepository extends JpaRepository<Artwork, Integer> {
	List<Artwork> findByUserId(int userId);

	
}
