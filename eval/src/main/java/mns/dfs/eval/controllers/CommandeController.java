package mns.dfs.eval.controllers;

import com.fasterxml.jackson.annotation.JsonView;
import mns.dfs.eval.dao.CommandeDao;
import mns.dfs.eval.models.Commande;
import mns.dfs.eval.views.CommandeDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class CommandeController {

    private CommandeDao commandeDao;

    @Autowired
    public CommandeController(CommandeDao commandeDao) {
        this.commandeDao = commandeDao;
    }

    @GetMapping("/liste-commande")
    @JsonView(CommandeDisplay.class)
    public List<Commande> commandes() {
        return commandeDao.findAll();
    }
}
