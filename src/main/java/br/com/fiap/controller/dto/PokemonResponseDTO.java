package br.com.fiap.controller.dto;

public class PokemonResponseDTO {
    private Long id;
    private String name;
    private int height;
    private int weight;
    private String types;
    int score;

    public PokemonResponseDTO(Long id, String name, int height, int weight, String types, int score) {
        this.id = id;
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.types = types;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTypes() {
        return types;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTypes(String types) {
        this.types = types;
    }
}
