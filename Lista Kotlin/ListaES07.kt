// Faça um Programa que calcule a área de um quadrado, em seguida mostre
o dobro desta área para o usuário.

fun main() {

    print("Digite a base de um quadrado: ")
    val base = readLine()!!.toInt()
    
    print("Digite a altura do quadrado: ")
    val altura = readLine()!!.toInt()
    
    val area = base * altura
    println("A área do quadrado é: $area")

    val dobro = area * 2
    println("O dobro desta área é: $dobro")
}