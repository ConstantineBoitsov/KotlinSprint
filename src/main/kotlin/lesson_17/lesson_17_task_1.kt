package lesson_17

class QuizItem(_quizQuestion: String, _quizAnswer: String) {

    val quizQuestion = _quizQuestion
        get() = field

    var quizAnswer = _quizAnswer
        get() = field
        set(value) {
            field = value
        }

}