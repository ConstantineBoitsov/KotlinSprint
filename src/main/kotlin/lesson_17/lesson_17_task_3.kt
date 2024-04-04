package lesson_17

fun main() {

    val someHiddenFolder = Folder(_name = "Photos", _filesAmount = 43, isHidden = true)

    println(someHiddenFolder.name)
    println(someHiddenFolder.filesAmount)

}

class Folder(
    _name: String,
    _filesAmount: Int,
    val isHidden: Boolean,
) {

    val name = _name
        get() = if (isHidden) "скрытая папка"
        else field

    val filesAmount = _filesAmount
        get() = if (isHidden) 0
        else field

}