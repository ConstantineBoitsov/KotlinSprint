package lesson_11

fun main() {

    val roomList: List<Room> = listOf(
        Room(
            cover = "joystick.jpg",
            name = "Gamers",
            memberList = listOf(
                RoomMember("avatar.png", "BigBoy", RoomMemberStatus.TALKS),
                RoomMember("picture.jpeg", "Caracal Cat", RoomMemberStatus.MIC_DISABLED),
                RoomMember("animegirl.gif", "Spalding", RoomMemberStatus.USER_MUTED)
            )
        ),
        Room(
            cover = "brush.jpg",
            name = "Artists",
            memberList = listOf(
                RoomMember("avatar1.jpg", "Floppa", RoomMemberStatus.MIC_DISABLED),
                RoomMember("avatar2.jpg", "Salvador", RoomMemberStatus.USER_MUTED),
                RoomMember("avatar3.jpg", "Bratishka", RoomMemberStatus.TALKS),
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
    val status: RoomMemberStatus,
) {
    fun longClickOnAvatar(userPic: String) {
        println(nickname)
    }
}

enum class RoomMemberStatus(val status: String) {
    TALKS("разговаривает"),
    MIC_DISABLED("микрофон выключен"),
    USER_MUTED("пользователь заглушен"),
}