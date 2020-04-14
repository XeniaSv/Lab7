//Деление двух чисел
def closureOne = { a, b -> return a / b }
//Вычитание двух чисел
def closureTwo = { d, c -> return (d - c) }
//Выражение a/b - c
def closureThree = { a, b, c -> return (closureTwo(closureOne(a, b), c)) }

println(closureOne(6, 3))
println(closureTwo(4, 2))
println(closureThree(4, 2, 4))
