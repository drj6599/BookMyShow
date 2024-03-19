package dev.dheeraj.BookMyShow.model;

import dev.dheeraj.BookMyShow.model.constant.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<MovieShow> movieShows;
    @OneToMany
    private List<Seat> seats;
    @Enumerated(EnumType.STRING)
    @ElementCollection
    private List<AuditoriumFeature> auditoriumFeatures;
}
