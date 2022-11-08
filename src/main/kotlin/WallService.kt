object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var complains = emptyArray<Complain>()

    fun createComment(comment: Comment): Boolean {
        var postFound = false
        for (post in posts){
            if (post.id == comment.postId){
                postFound = true
                comments += comment
                println("коментарий добавлен ${comment.postId}(${comment.text})")
            }
        }
        if (!postFound){
            throw PostNotFoundException("добавление коментария невозможно не существует ${comment.postId}")
        }
        return true
    }


    fun add(post: Post) {
        posts += post
    }

    fun update(postFind: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postFind.id) {
                posts[index] = postFind.copy(id = post.id, date = post.date)
                return true
            }
        }
        return false
    }


    fun like(postId: Int): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == postId) {
                posts[index] = post.copy(likes = post.likes + 1)
                return true
            }
        }
        return false
    }


    fun print() {
        for (post in posts) {
            println(post)
        }
        println()
    }

    fun makeComplain(complain: Complain): Int {
        var commentIdFound = false
        for (comment in comments) {
            if (comment.id == complain.commentId){
                commentIdFound = true
            }
        }
        if (complain.reason == null)throw  ReasonNotFoundException("невозможно подать жалобу укажи причину")
        if (!commentIdFound)throw  CommentNotFoundException("невозможно подать жалобу")
        complains += complain
        println("жалоба подана")
        return 1
    }


}