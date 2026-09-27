package com.example.botdeseguretat

import android.util.Log

fun main() {
    botDeSeguretat()
}

fun botDeSeguretat() {

    val persona = Persona(
        name = "Adrian",
        age = 27,
        entreteniments = listOf("Anime", "Cinema", "Llegir", "Música", "Programar", "Videojocs")
    )

    if (persona.name != "Adrian") {
        Log.d("BOT", "Error: nom incorrecte. Accés denegat.")
        return
    } else {
        Log.d("BOT", "Nom correcte. Benvingut, ${persona.name}.")
    }

    if (persona.age >= 0 && persona.age <= 13) {
        Log.d("BOT", "Ets massa petit. Accés denegat.")
        return

    } else if (persona.age >= 14 && persona.age <= 17) {
        Log.d("BOT", "Necessites permís parental.")
        return

    } else if (persona.age >= 18) {
        Log.d("BOT", "Ets major d'edat. Accés concedit.")

    } else {
        Log.d("BOT", "Edat no vàlida.")
        return
    }

    Log.d("BOT", "Entreteniments filtrats:")

    val ordenats = persona.entreteniments.sorted()

    for (entret in ordenats) {
        val lletra = entret.first().uppercaseChar()

        if (lletra >= 'A' && lletra <= 'L') {
            Log.d("BOT", " $entret")
        }
    }
}
