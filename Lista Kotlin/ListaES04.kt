// Faça um Programa que peça as 4 notas bimestrais e mostre a média.

fun main(args: Array<String>) {
    print("Digite a 1ª nota: ")
    val num1 = readLine()?.toFloatOrNull() ?: 0f
    print("Digite a 2ª nota: ")
    val num2 = readLine()?.toFloatOrNull() ?: 0f
    print("Digite a 3ª nota: ")
    val num3 = readLine()?.toFloatOrNull() ?: 0f
    print("Digite a 4ª nota: ")
    val num4 = readLine()?.toFloatOrNull() ?: 0f

    val soma = num1 + num2 + num3 + num4
    val media = soma / 4
    println("A média é: $media")
}