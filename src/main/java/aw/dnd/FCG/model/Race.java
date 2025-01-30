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
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID race_id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "race", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DnDCharacter> characters;
}
