package com.example.nori.repository.imageRepository;

import com.example.nori.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IImageRepository extends JpaRepository<Image, Long> {
}
