fun main(args: Array<String>) {
   var a = readln().toInt()
   var b = readln().toInt()
   var ор = readln()

   if (ор == "+") {
      println(sum(a, b))
   }
   if (ор == "-") {
      println(min(a, b))
   }
   if (ор == "/") {
      println(del(a, b))
   }
   if (ор == "*") {
      println(umn(a, b))
   }
}

   fun sum (num: Int, num2: Int) :Int {
      return num + num2
   }
   fun min (num: Int, num2: Int) :Int {
      return num - num2
   }
   fun del (num: Int, num2: Int) :Int {
      return num / num2
   }

   fun umn (num: Int, num2: Int) :Int {
   }