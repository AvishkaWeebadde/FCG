package aw.dnd.FCG.repository;

import aw.dnd.FCG.model.Stats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StatsRepository extends JpaRepository<Stats, UUID> {
}
