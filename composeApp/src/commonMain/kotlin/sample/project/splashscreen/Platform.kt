package sample.project.splashscreen

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform