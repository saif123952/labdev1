package com.example.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variable interne pour stocker la progression du compteur
    private var totalPoints = 0
    
    // Référence vers le champ textuel de l'interface
    private lateinit var vueCompteur: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialisation des éléments graphiques
        vueCompteur = findViewById(R.id.tv_valeur_actuelle)
        val boutonNotification = findViewById<Button>(R.id.btn_afficher_toast)
        val boutonPlusUn = findViewById<Button>(R.id.btn_incrementer_score)

        // Action lors du clic sur le bouton de message
        boutonNotification.setOnClickListener {
            lancerNotificationSimple()
        }

        // Action lors du clic sur le bouton d'ajout
        boutonPlusUn.setOnClickListener {
            mettreAJourLeScore()
        }
    }

    /**
     * Affiche un message de type Toast avec un texte personnalisé
     */
    private fun lancerNotificationSimple() {
        val texteAAfficher = "Action effectuée avec succès !"
        Toast.makeText(this, texteAAfficher, Toast.LENGTH_SHORT).show()
    }

    /**
     * Incrémente la variable locale et rafraîchit l'affichage
     */
    private fun mettreAJourLeScore() {
        totalPoints += 1
        vueCompteur.text = totalPoints.toString()
    }
}
