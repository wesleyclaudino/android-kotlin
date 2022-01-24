package br.com.alura.financas.extensions

fun String.limitaEmAte(caracteres: Int) : String {
    if(this.length > caracteres){
        val primeiroCaractere = 0
        return "${this.substring(primeiroCaractere, caracteres)}..."
    }
    return this
}