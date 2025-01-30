package aw.dnd.FCG.repository;

import aw.dnd.FCG.model.DnDCharacter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DnDCharacterRepository extends JpaRepository<DnDCharacter, UUID> {
}
