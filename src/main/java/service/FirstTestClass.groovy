package service

class FirstTestClass {
    def functionA(argA) {
        print ArgA
    }

    def name

    private def privateName;

    void testThirdClass(){
        def third = new ThirdTestClass(second: 2, first: "aaaa");
        println "testThirdClass"
        List properties = third.metaPropertyValues
        properties.each {x->println x.properties.values().toString()}

    }

    void printName (name){
        println name
    }

    int functionB(int argB) {
        print argB
        println "!!!!!!!!!!!!!!!!! HELLO WORLD !!!!!!!!!!!!!!!!!!!"
        return argB
    }
}
