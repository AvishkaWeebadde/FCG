package aw.dnd.FCG.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

    @OneToOne(mappedBy = "stats")
    private Character character;
}
