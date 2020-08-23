package groovyLang.builder.normal

abstract class Computer {

    protected board
    protected display
    protected os

    protected Computer() {}

    def getBoard() {
        return board
    }

    void setBoard(board) {
        this.board = board
    }

    def getDisplay() {
        return display
    }

    void setDisplay(display) {
        this.display = display
    }

    def getOs() {
        return os
    }

    void setOs(os) {
        this.os = os
    }
}
