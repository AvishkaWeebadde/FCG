package aw.dnd.FCG.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID class_id;

    private String name;
    private String description;

    @OneToMany(mappedBy = "characterClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Character> characters;

    @OneToMany(mappedBy = "characterClass", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Backstory> backstories;

}
