package groovyLang.builder.normal

class Director {

    Builder builder

    Director(Builder builder) {
        this.builder = builder
    }

    def constract = {
        board, display ->
            builder.buildBoard(board)
            builder.buildDiaplay(display)
            builder.buildOs()
    }
}
