// Faça um Programa que converta metros para centímetros.

fun main() {
    print("Digite um valor em metros para ser convertido:  ")
    val metros = readLine()?.toFloatOrNull() ?: 0f
  
    val converter = metros*100

    println("Centimetros: $converter")
}