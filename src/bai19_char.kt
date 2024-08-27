fun main(args: Array<String>) {
    //method
    println('8'.isDigit())
    println('a'.isLetter())
    println(' '.isWhitespace())
    println('h'.isLowerCase())
    println('H'.isUpperCase())

    var s:String = "Not funny at all!!!"
    println(s::class.java.typeName)
    println(s.length)
    println(s[7])
    println(s.indexOf('a'))
    println(s.lastIndexOf(' '))

    var s1:String = "Not"
    var check:Boolean = s.contains(s1)
    println(check)

    var sub:String = s.substring(4, 9)
    println(sub)

    var newS = s.replace("funny", "tired" /*ignoreCase = true*/)
    println(newS)

    var snew = s.replaceFirst("a", "*")
    println(snew)

    
}