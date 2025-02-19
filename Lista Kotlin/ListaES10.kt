// Faça um Programa que peça a temperatura em graus Celsius, transforme
e mostre em graus Fahrenheit.

fun main() {
    print("Digite uma temperatura em Celsius(°C):  ")
    val celsius = readLine()!!.toDouble()
   
    val fahrenheit = celsius * 1.8 + 32
    println("A temperatura em Fahrenheit é:  $fahrenheit°F")
}