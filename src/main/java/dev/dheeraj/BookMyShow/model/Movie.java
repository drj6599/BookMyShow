package dev.dheeraj.BookMyShow.model;

import dev.dheeraj.BookMyShow.model.constant.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    private String description;
    @ManyToMany
    private List<Actor> actors;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<MovieFeature> movieFeatures;
}
