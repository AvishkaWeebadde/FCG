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
public class Backstory {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID backstoryId;

    private String description;
}
