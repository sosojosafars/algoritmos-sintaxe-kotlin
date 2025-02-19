// Faça um Programa que peça a temperatura em graus Fahrenheit,
transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).

fun main() {

    print("Digite uma temperatura em Fahrenheit(°F):    ")
    val fahrenheit = readLine()!!.toDouble()
   
    val celsius = 5 * ((fahrenheit - 32) / 9)
    println("A temperatura em Celsius é:  $celsius°C")
   
}