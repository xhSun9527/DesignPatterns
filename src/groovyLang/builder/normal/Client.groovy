package groovyLang.builder.normal

class Client {

    static main(args){

        MacBookBuilder builder = new MacBookBuilder()
        Director director = new Director(builder)

        director.constract.call("Intel主板", "Retina显示器")

        println "computer info : ${builder.build().toString()}"
    }
}
