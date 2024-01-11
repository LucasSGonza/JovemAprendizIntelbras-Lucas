fun main() {
    val song = Song("Vida Loka, Pt. 2", "Racionais MC's", 2002, 3800000)
    song.showInformationAboutTheSong()
    print(song.isFamous)
}

class Song(val title: String, val artist: String, val releaseYear: Int, val songPlayCount: Int) {
    
    var isFamous: Boolean = false
    
    init {
        isThisSongFamous()
    }
    
    private fun isThisSongFamous(): Boolean {
    	this.isFamous = if (this.songPlayCount > 1000) true else false
        return this.isFamous
    }
    
    fun showInformationAboutTheSong() {
    	println("$title, de $artist, lançado em $releaseYear")
    }
    
}