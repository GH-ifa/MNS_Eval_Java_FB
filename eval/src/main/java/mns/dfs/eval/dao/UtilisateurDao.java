package mns.dfs.eval.dao;

import mns.dfs.eval.models.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer> {

    @Query("SELECT COUNT(*) FROM Utilisateur")
    int compteUtilisateur();

    @Transactional
    void deleteByLogin(String login);
}
