import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val cal = Calendar.getInstance()
    println(cal.get(Calendar.DAY_OF_MONTH))

    cal.set(Calendar.DAY_OF_MONTH,17)
    cal.set(Calendar.YEAR,2004)
    cal.set(Calendar.MONTH,3)

    var DOB = cal.get(Calendar.DAY_OF_MONTH)
    var YOB = cal.get(Calendar.YEAR)
    var MOB = cal.get(Calendar.MONTH)
    println("$DOB/$MOB/$YOB")

    var date = cal.time
    var format = SimpleDateFormat("dd/MM/yyyy")
    println(format.format(date))

    var format2 = SimpleDateFormat("dd/MM/yyyy hh:mm:ss a")
    println(format2.format(date))

}