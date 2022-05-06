package mns.dfs.eval.dao;

import mns.dfs.eval.models.Caracteristique;
import mns.dfs.eval.models.CleProprieteArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaracteristiqueDao extends JpaRepository<Caracteristique, CleProprieteArticle> {

}
