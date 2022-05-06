package mns.dfs.eval.models;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.Setter;
import mns.dfs.eval.views.CommandeDisplay;
import mns.dfs.eval.views.EmployeDisplay;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView(EmployeDisplay.class)
    private Integer id;

    @JsonView({EmployeDisplay.class, CommandeDisplay.class})
    private String login;

    private String password;

    @ManyToMany
    private Set<MoyenPaiement> listeMoyenPaiement;

    @OneToMany(mappedBy = "client")
    private Set<Commande> listeCommande;
}
