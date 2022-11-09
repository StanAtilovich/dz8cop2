import org.jetbrains.annotations.Nullable
import java.awt.event.WindowListener

data class Comment(
    @Nullable
    val id: Int,
    val postId: Int,
    val date: Int,
    val text: String,
    val attachments: Array<Attachment>? = null
)

class PostNotFoundException(message: String) : RuntimeException(message)

data class Post(
    @Nullable
    val id: Int,
    val contentL: String,
    val likes: Int = 0,
    val attachments: Array<Attachment> = emptyArray(),
    val ownerId: Int? = 0,
    val date: Long,
    val views: Int? = 0,
    val comments: Int? = null

) {
    fun printContent() {
        println("Post with$id printted it content:$contentL")
    }
}
data class Complain(
    val ownerId: Int,
    val commentId: Int,
    val reason : ReasonsComplain? = null
)
enum class ReasonsComplain(
    val id: Int,
    val text: String
){
    SPAM(0, "спам"),
    CHLDPRN(1, "детская порнография"),
    EXTREMISM(2, "экстремизм"),
    VIOLENCE(3, "насилие"),
    DRUGS(4, "пропаганда наркотиков"),
    ADULT(5, "материал для взрослых"),
    ABUSE(6, "оскорбление"),
    SUICIDE(8, "призывы к суициду");
}


data class Audio(
    val id: Int,
    val name: String
)

data class Video(
    val id: Int,
    val lenght: Int
)

data class Donut(
    val isDonut: Boolean = false,
    val paidDuration: Int = 0,
    val placeholder: String = "",
    val canPublishFreeCopy: Boolean = false,
    val editMode: String
)

interface Attachment {
    val type: String
}

data class AudioAtachment(val audio: Audio) : Attachment {
    override val type = "audio"
}


data class VideoAtachment(val video: Video) : Attachment {
    override val type = "video"
}

data class DonutAtachment(
    val dunut: Donut,
    val isDonut: Boolean = false,
    val paidDuration: Int = 0,
    val canPublishFreeCopy: Boolean = false,
    val editMode: String = " "
) : Attachment {
    override val type = "donut"
}

data class RepostsAtachment(
    val count: Long,
    val userReposted: Boolean
) : Attachment {
    override val type = "reposts"
}