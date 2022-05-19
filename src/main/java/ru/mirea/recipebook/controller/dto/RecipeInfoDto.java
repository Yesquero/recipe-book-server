package ru.mirea.recipebook.controller.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RecipeInfoDto {

	private String uuid;

	private String category;

	private String recipeImageUuid;

	private String name;

	private Integer complexity;

	private String description;

	private String instructions;

	private BigDecimal price;

	private Integer duration;

	private String portion;

	private BigDecimal calories;

	private BigDecimal fats;

	private BigDecimal proteins;

	private BigDecimal carbohydrates;

	private String status;

	private Double rating;

}
