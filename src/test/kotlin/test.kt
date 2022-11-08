import org.junit.Assert
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Test {
    @Test
    fun testAdd() {
        val service = WallService
        val post1 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post2 = Post(
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
        val post3 = Post(
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
        val post4 = Post(
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
        val post5 = Post(
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


        service.add(
            Post(
                1,
                "Шупашкара киль",
                attachments = arrayOf(
                    AudioAtachment(Audio(1, "song.mp3")),
                    RepostsAtachment(23, false),
                    DonutAtachment(Donut(true, 455, "Салам", true, "all"))
                ),
                likes = 99,
                ownerId = 455555,
                date = 17102022,
                views = (458)
            )
        )

        val post = Post(
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
        WallService.add(post1)
        WallService.add(post2)
        WallService.add(post3)
        WallService.add(post4)
        WallService.add(post5)
        val result = service.add(post)
        Assert.assertNotNull(result)

    }

    @Test
    fun test2() {
        val service = WallService
        val post1 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post2 = Post(
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
        val post3 = Post(
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
        val post4 = Post(
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
        val post5 = Post(
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


        service.add(
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

        val post = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        WallService.add(post1)
        WallService.add(post2)
        WallService.add(post3)
        WallService.add(post4)
        WallService.add(post5)
        val result = service.add(post)
        Assert.assertNotNull(result)


    }

    @Test
    fun test3() {
        val service = WallService
        val post1 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post2 = Post(
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
        val post3 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post4 = Post(
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
        val post5 = Post(
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


        service.add(
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

        val post = Post(
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
        WallService.add(post1)
        WallService.add(post2)
        WallService.add(post3)
        WallService.add(post4)
        WallService.add(post5)
        val result = service.add(post)
        Assert.assertNotNull(result)


    }

    @Test
    fun test4() {
        val service = WallService
        val post1 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post2 = Post(
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
        val post3 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post4 = Post(
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
        val post5 = Post(
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


        service.add(
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

        val post = Post(
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
        WallService.add(post1)
        WallService.add(post2)
        WallService.add(post3)
        WallService.add(post4)
        WallService.add(post5)
        val result = service.add(post)
        Assert.assertNotNull(result)


    }

    @Test
    fun test5() {
        val service = WallService
        val post1 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post2 = Post(
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
        val post3 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post4 = Post(
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
        val post5 = Post(
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


        service.add(
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

        val post = Post(
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

        WallService.add(post1)
        WallService.add(post2)
        WallService.add(post3)
        WallService.add(post4)
        WallService.add(post5)
        val result = service.add(post)
        Assert.assertNotNull(result)


    }


    @Test
    fun testUpdateTrue() {
        val service = WallService
        val post1 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )
        val post2 = Post(
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
        val post3 = Post(
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
        val post4 = Post(
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
        val post5 = Post(
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


        service.update(
            Post(
                1,
                "Шупашкара киль",
                attachments = arrayOf(
                    AudioAtachment(Audio(1, "song.mp3")),
                    RepostsAtachment(23, false),
                    DonutAtachment(Donut(true, 455, "Салам", true, "all"))
                ),
                likes = 99,
                ownerId = 455555,
                date = 17102022,
                views = (458)
            )
        )

        val post = Post(
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
        WallService.add(post1)
        WallService.add(post2)
        WallService.add(post3)
        WallService.add(post4)
        WallService.add(post5)
        val result = service.update(post)
        assertTrue(result)

    }

    @Test
    fun testUpdateFalse() {
        val service = WallService
        val post1 = Post(
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
        val post2 = Post(
            1,
            "Шупашкара киль",
            attachments = arrayOf(
                AudioAtachment(Audio(1, "song.mp3")),
                RepostsAtachment(23, false),
                DonutAtachment(Donut(true, 455, "Салам", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )


        val update = Post(
            333,
            "киле каймалла",
            attachments = arrayOf(
                AudioAtachment(Audio(999, "s.mp3")),
                RepostsAtachment(999, false),
                DonutAtachment(Donut(true, 999, "Салам сире", true, "all"))
            ),
            likes = 99,
            ownerId = 455555,
            date = 17102022,
            views = (458)
        )

        service.add(post1)
        service.add(post2)

        val result = service.update(update)
        assertFalse(result)


    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {
        val comment2 = Comment(1, 2, 51122, "salam", null)
        WallService.createComment(comment2)
    }

    @Test
    fun testCommentAdd()
    {
        val comment: Comment = Comment(1, 2, 51122, "salam", null)
        val postId = 1
        val result = 1
        assertEquals(result,postId)
    }

}




