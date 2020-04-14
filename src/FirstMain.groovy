class FirstMain {
    static void main(String[] args) {
        //Экземпляр класса FirstClass
        FirstClass firstClass = new FirstClass(4, 9.9f, "Hello")

        println "==========================Old date========================="
        //Вывод на экран значений по имени переменной
        println firstClass.getProperty("numberOne")
        println firstClass.getProperty("numberTwo")
        println firstClass.getProperty("string")

        //Измена значений экземпляра класса
        firstClass.setProperty("numberOne", 6)
        firstClass.setProperty("numberTwo", 4.5f)
        firstClass.setProperty("string", "Privet")

        println "=========================New date========================="
        //Вывод на экран значений по имени переменной
        println firstClass.getProperty("numberOne")
        println firstClass.getProperty("numberTwo")
        println firstClass.getProperty("string")
    }
}
