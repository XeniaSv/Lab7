class SecondMain {
    static void main(String[] args) {

        try {
            //Будет ошибка NullPointerException
            println SecondClass.returnInt(null)
        }
        catch (NullPointerException e) {
            e.printStackTrace()
        }

        //Будет всё ок
        println "========================Возвращение метода return Integer========================"
        println SecondClass.returnInteger(null)

        //Сравнение двух экземпляров класс BigDecimal
        BigDecimal bigDecimalOne = new BigDecimal(3)
        BigDecimal bigDecimalTwo = new BigDecimal(3)
        println "\n========================Сравнение двух экземпляров класс BigDecimal========================"
        println bigDecimalOne == bigDecimalTwo

        //Сравнение метода add и оператора +
        BigDecimal resultMethod = bigDecimalOne.add(bigDecimalTwo)
        BigDecimal resultOperator = bigDecimalOne + bigDecimalTwo
        println "\n========================Сравнение метода add и оператора +========================"
        println resultMethod == resultOperator

        //Присваивание Def переменной разных значений
        def a = 10
        println "\n========================Def переменная========================"
        println a.getClass()
        a = "First"
        println a.getClass()

        //Экземпляры типа Date
        Date dateOne = new Date(2015, 2, 28)
        Date dateTwo = new Date(2015, 1, 31)
        println "\n========================Date переменные========================"
        println(dateOne - dateTwo)
        dateOne.month += 1 + 1
        dateOne.date += 1
        println(dateOne)
    }
}
