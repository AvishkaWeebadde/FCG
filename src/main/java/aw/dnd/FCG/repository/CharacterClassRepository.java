package aw.dnd.FCG.repository;

import aw.dnd.FCG.model.CharacterClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CharacterClassRepository extends JpaRepository<CharacterClass, UUID> {
}
