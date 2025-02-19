// Faça um Programa que pergunte quanto você ganha por hora e o número
de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês

fun main() {

    print("Quanto você recebe por hora trabalhada?  ")
    val ganho_hora = readLine()?.toFloatOrNull() ?: 0f
    print("Qual o número de horas trabalhadas no mês?  ")
    val numero_hora = readLine()?.toFloatOrNull() ?: 0f
    

    val salario = ganho_hora * numero_hora
    println("O sálario total no mês é:  R$$salario")
    
}