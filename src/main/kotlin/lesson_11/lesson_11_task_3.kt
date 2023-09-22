package lesson_11

fun main() {

    val roomList: List<Room> = listOf(
        Room(
            cover = "joystick.jpg",
            name = "Gamers",
            memberList = listOf(
                RoomMember("avatar.png", "BigBoy", RoomMember.UserStatus.TALKS.status),
                RoomMember("picture.jpeg", "Caracal Cat", RoomMember.UserStatus.MIC_DISABLED.status),
                RoomMember("animegirl.gif", "Spalding", RoomMember.UserStatus.USER_MUTED.status)
            )
        ),
        Room(
            cover = "brush.jpg",
            name = "Artists",
            memberList = listOf(
                RoomMember("avatar1.jpg", "Floppa", RoomMember.UserStatus.MIC_DISABLED.status),
                RoomMember("avatar2.jpg", "Salvador", RoomMember.UserStatus.USER_MUTED.status),
                RoomMember("avatar3.jpg", "Bratishka", RoomMember.UserStatus.TALKS.status),
            )
        )
    )

}

class Room(
    val cover: String,
    val name: String,
    val memberList: List<RoomMember>,
)

class RoomMember(
    val userPicture: String,
    val nickname: String,
    val status: String,
) {
    enum class UserStatus(val status: String) {
        TALKS("разговаривает"),
        MIC_DISABLED("микрофон выключен"),
        USER_MUTED("пользователь заглушен"),
    }

    fun longClickOnAvatar(userPic: String) {
        println(nickname)
    }
}