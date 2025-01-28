package aw.dnd.FCG.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Backstory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long backstoryId;

    private String description;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private CharacterClass characterClass;

}
