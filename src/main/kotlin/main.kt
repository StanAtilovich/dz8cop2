import org.jetbrains.annotations.Nullable
import java.awt.event.WindowListener

class CommentNotFoundException(msg: String) : RuntimeException(msg)

class ReasonNotFoundException(msg: String) : RuntimeException(msg)
fun main() {
    val post = Post(
        1,
        "Шупашкара киль",
        attachments = arrayOf(
            AudioAtachment(Audio(1, "song.mp3")),
            RepostsAtachment(23, false),
            DonutAtachment(Donut(true, 455, "Салам", true, "all")),
        ),
        likes = 99,
        ownerId = 455555,
        date = 17102022,
        views = (458)
    )

    post.printContent()
    println((post.attachments[0] as AudioAtachment).audio)

    WallService.add(post)
    WallService.update(post)
    WallService.add(
        Post(
            2,
            "Я Чуваш!",
            attachments = arrayOf(
                AudioAtachment(Audio(2, "anothersong.mp3")),
                VideoAtachment(Video(2, 60)),
                RepostsAtachment(23, false),
                (DonutAtachment(Donut(true, 700, "Ачисем", true, "all")))
            ),
            likes = 78,
            ownerId = 789,
            date = 181022,
            views = 635
        )
    )

    post.printContent()
    println((post.attachments[0] as AudioAtachment).audio)

    WallService.add(post)
    WallService.add(
        Post(
            3,
            "Как свалить из России?",
            attachments = arrayOf(
                AudioAtachment(Audio(3, "чакапущ.mp3")),
                VideoAtachment(Video(3, 30)),
                RepostsAtachment(25, false),
                (DonutAtachment(Donut(true, 800, "Атилла рулит", true, "all")))
            ),
            likes = 0,
            ownerId = 999,
            date = 191022,
            views = 1000
        )
    )

    post.printContent()
    println((post.attachments[0] as AudioAtachment).audio)

    WallService.add(post)
    WallService.add(

        Post(
            4,
            "сколько стоит квартира в Караганде?",
            attachments = arrayOf(
                AudioAtachment(Audio(3, "Тупах яле.mp3")),
                VideoAtachment(Video(3, 40)),
                RepostsAtachment(26, false),
                (DonutAtachment(Donut(true, 700, "Дацин", true, "all")))
            ),
            likes = 70000,
            ownerId = 11,
            date = 201022,
            views = 10
        )
    )


    post.printContent()
    println((post.attachments[0] as AudioAtachment).audio)

    WallService.add(post)
    WallService.add(

        Post(
            5,
            "ылуоси?",
            attachments = arrayOf(
                AudioAtachment(Audio(4, "Турапа перле.mp3")),
                VideoAtachment(Video(4, 1000)),
                RepostsAtachment(27, false),
                (DonutAtachment(Donut(true, 99900, "Чайна", true, "all")))
            ),
            likes = 7000,
            ownerId = 12,
            date = 211022,
            views = 1770
        )
    )


    WallService.print()
    WallService.like(2)
    WallService.print()

    WallService.createComment(Comment(1,2,51122,"Salam",null))

    try {
        WallService.createComment(Comment(65,454,61122,"sass",null))
        }catch (e: PostNotFoundException){
            println(e.message)
        }
    try {
        WallService.makeComplain(Complain(0,5, ReasonsComplain.ABUSE))
    }catch(e: CommentNotFoundException){
        println(e.message)
    }
    WallService.makeComplain(Complain(0,1, ReasonsComplain.SPAM))

    try{
        WallService.makeComplain(Complain(0,1))
    }catch(e: ReasonNotFoundException){
        println(e.message)
    }
}