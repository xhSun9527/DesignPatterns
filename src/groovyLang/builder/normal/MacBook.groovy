package groovyLang.builder.normal

class MacBook extends Computer{
    private MacBook() {
    }

    @Override
    void setOs(Object os) {
        mOs = "Mac OS X 10.10"
    }
}
