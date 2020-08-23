package groovyLang.builder.normal

class MacBookBuilder extends Builder {
    private mComputer = new MacBook()


    @Override
    void buildBoard(Object board) {

        mComputer.setBoard(board)
    }

    @Override
    void buildDiaplay(Object display) {

        mComputer.setDisplay(display)
    }

    @Override
    void buildOs(Object os) {

        mComputer.setOs()
    }

    @Override
    Computer build() {
        return mComputer
    }
}
