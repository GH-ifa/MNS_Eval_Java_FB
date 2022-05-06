package mns.dfs.eval.models;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import mns.dfs.eval.views.EmployeDisplay;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Employe extends Utilisateur {
    @JsonView(EmployeDisplay.class)
    private boolean administrateur;

    @OneToMany(mappedBy = "gestionnaire")
    @JsonView({EmployeDisplay.class})
    private Set<Article> listeArticleAgerer = new HashSet<>();
}
