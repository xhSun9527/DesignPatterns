package groovyLang.builder.normal

abstract class Builder {
    abstract void buildBoard(board)

    abstract void buildDiaplay(display)

    abstract void buildOs(os)

    abstract Computer build()
}
