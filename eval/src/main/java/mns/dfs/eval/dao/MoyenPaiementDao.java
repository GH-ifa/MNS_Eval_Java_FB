package mns.dfs.eval.dao;

import mns.dfs.eval.models.MoyenPaiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MoyenPaiementDao extends JpaRepository<MoyenPaiement, Integer> {
}
