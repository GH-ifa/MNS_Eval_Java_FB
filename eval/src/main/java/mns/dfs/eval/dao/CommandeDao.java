package mns.dfs.eval.dao;

import mns.dfs.eval.models.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommandeDao extends JpaRepository<Commande, Integer> {
    List<Commande> findFirst10ByOrderByIdDesc();
}
