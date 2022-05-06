package mns.dfs.eval.dao;

import mns.dfs.eval.models.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeDao  extends JpaRepository<Employe, Integer> {

    int countByAdministrateur(boolean b);

    boolean existsByLogin(String login);
}
