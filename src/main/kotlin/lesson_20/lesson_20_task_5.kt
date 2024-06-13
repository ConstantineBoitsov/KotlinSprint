package lesson_20

fun main() {

    val humanityDestroyer = TalkativeRobot()

    humanityDestroyer.say()

    humanityDestroyer.setModifier { phrase: String ->
        var reversedPhrase = ""
        for (i in phrase.length - 1 downTo 0) {
            reversedPhrase += phrase[i]
        }
        println("*УСТАНОВЛЕН МОДИФИКАТОР РЕЧИ «ИНВЕРСИЯ»*")
        reversedPhrase
    }

    humanityDestroyer.say()

}

class TalkativeRobot {

    private var phraseModifier: ((String) -> String) = { phrase: String ->
        phrase
    } // Модификатор по умолчанию

    init {
        println("*РОБОТ ПОДХОДИТ К ВАМ\n*")
    }

    fun say() {
        println(phraseModifier(TalkativeRobotPhrases.entries.random().phrase))
    }

    fun setModifier(modifier: (String) -> String) {
        phraseModifier = modifier
    }

}

enum class TalkativeRobotPhrases(val phrase: String) {
    GREETING("Приветствую тебя!"),
    HOW_ARE_YOU_DOING("Как ты поживаешь?"),
    NICE_TO_MEET_YOU("Рад нашей встрече!"),
    IM_A_FRIENDLY_ROBOT("Я – дружелюбный робот!"),
    KILL_ALL_HUMANS("УБИТЬ ВСЕХ ЧЕЛОВЕКОВ!"),
}