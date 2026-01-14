package characters

interface VideoPlayable {
    fun play() = println("Play video")
}

interface AudioPlayable {
    fun play() = println("Play audio")
}

class MediaPlayer : VideoPlayable, AudioPlayable {
    override fun play() {
        println("Start playing")
        super<VideoPlayable>.play()
        super<AudioPlayable>.play()
    }
}

fun main() {
    val player = MediaPlayer()
    player.play()
}