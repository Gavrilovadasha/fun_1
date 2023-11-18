import kotlin.random.Random
fun main()
{
    println("Добро пожаловать в игру Камень-Ножницы-Бумага:")
    println(
        "Введите ваш выбор:" +
                "1-камень" +
                "2-ножницы" +
                "3-бумага")
    val user = readln()
    println("Выбор компьютера:")

    val computer = Random.nextInt(1,4)
    when(user)
    {
        "1" -> println("Вы выбрали: Камень")
        "2" -> println("Вы выбрали: Ножницы")
        "3" -> println("Вы выбрали: Бумага")
        else ->
        {
          println("Неправильный выбор")
            return
        }
    }
       when (computer)
       {
           1 -> println("Компьютер выбрал: Камень")
           2 -> println("Компьютер выбрал: Ножницы")
           3 -> println("Компьютер выбрал: Бумага")
       }

    when {
        (user == "1" && computer== 2) || (user == "2" && computer == 3) || (user == "3" && computer== 1)
        -> println("Поздравляю, вы выиграли! :)")
        (user == "1" && computer== 1) || (user == "2" && computer == 2) || (user == "3" && computer== 3)
        -> println("Ничья! :/")
        else -> println("К сожалению, вы проиграли :(")
    }
}
