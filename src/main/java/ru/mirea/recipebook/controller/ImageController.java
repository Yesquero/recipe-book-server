package ru.mirea.recipebook.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.mirea.recipebook.domain.Image;
import ru.mirea.recipebook.service.ImageService;

import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/image")
public class ImageController {

	private final ImageService imageService;

	@PostMapping("/upload")
	public UUID uploadImage(@RequestParam MultipartFile image) {
		return imageService.saveImage(image);
	}

	@GetMapping(value = "/get/{imageUuid}")
	public Resource downloadImage(@PathVariable UUID imageUuid) {
		Image found = imageService.findByUuid(imageUuid);

		return new ByteArrayResource(found.getContent());
	}

}
