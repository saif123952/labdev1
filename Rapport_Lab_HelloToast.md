# Rapport de Laboratoire : Application HelloToast

## 1. Objectif du Laboratoire
L'objectif de ce projet était de concevoir une application Android simple permettant d'interagir avec l'utilisateur via des messages "Toast" et un compteur dynamique.

## 2. Conception de l'Interface (XML)
Pour rendre l'application unique, j'ai opté pour un `RelativeLayout` au lieu d'un simple `LinearLayout`. Cela permet une gestion plus flexible du positionnement.

**Modifications apportées :**
- **Couleurs personnalisées** : Utilisation d'une palette de couleurs sobres (Brun/Terre) pour s'éloigner du style par défaut.
- **IDs explicites** : Les composants ont été renommés pour plus de clarté (`tv_valeur_actuelle`, `btn_incrementer_score`).
- **Style visuel** : Ajout de marges (`padding`) et de styles de texte en gras pour une meilleure lisibilité.

## 3. Logique de l'Application (Kotlin)
Le code a été structuré de manière modulaire pour faciliter la maintenance et éviter les redondances.

**Points clés du code :**
- **Encapsulation** : La logique de mise à jour du score et l'affichage des notifications ont été extraites dans des fonctions privées dédiées (`lancerNotificationSimple` et `mettreAJourLeScore`).
- **Nomenclature** : Utilisation de noms de variables explicites comme `totalPoints` au lieu de simples noms génériques.

## 4. Démonstration
Voici un aperçu du fonctionnement de l'application :

![Capture d'écran de l'application](demo.png)
*(Note : Remplacer "demo.png" par votre capture d'écran réelle après l'exécution sur l'émulateur)*

## 5. Conclusion
Ce laboratoire a permis de maîtriser les concepts fondamentaux d'Android : la liaison entre le fichier XML et le code Kotlin via `findViewById`, la gestion des événements de clic, et la manipulation dynamique des vues.
