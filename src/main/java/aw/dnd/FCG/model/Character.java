package aw.dnd.FCG.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "race_id")
    private Race race;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private CharacterClass characterClass;

    @OneToOne
    @JoinColumn(name = "backstory_id")
    private Backstory backstory;

    @OneToOne
    @JoinColumn(name = "stats_id")
    private Stats stats;

    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();  // Automatically set creation timestamp
        }
    }

}
