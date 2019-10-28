package exercises

enum class Prioridade1 {
  BAIXA, MEDIA, ALTA
}

enum class Prioridade2(val id:Int) {
  BAIXA(1){
    override fun toString(): String {
      return "Super baixa, não se preocupe"
    }
  }, MEDIA(5), ALTA(10)
}

class Alarme(var desc:String, p:Prioridade2)

fun main() {
  println(Prioridade1.ALTA)
  println(Prioridade2.ALTA.id)
  Alarme("Aviso", Prioridade2.ALTA)
  for(p in Prioridade2.values()){
    if(p.toString() === "MÉDIA"){
      println("Esse é verdade")
    }
    println("$p - ${p.id} - ${p.ordinal}")
  }
}