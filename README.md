# Evaluation Java pour Franck B.

Création de tous les modèles des objets nécessaires et de leurs DAO correspondants, y compris la partie des propriétés / caractéristiques pas nécessaires pour faire fonctionner l'API.

Création des 4 controlleurs contenant toutes les routes demandées. La suppression d'un utilisateur (non-employé) a été testée avec Thunder Client.

Test des services retournant un seul employé, de la liste des commandes et de la liste des employés.

Utilisation de 2 JsonViews pour limiter les données retournées.

(Le sujet demandait seulement une liste des commandes sans précision alors que l'interface front-end indique "10 dernières commandes", j'ai donc créé une fonction alternative supplémentaire "dernieresCommandes" sur la route "/liste-dernieres-commande" que je n'utilise pas, mais qui est là au cas où)