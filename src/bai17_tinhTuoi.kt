import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    var format = SimpleDateFormat("dd/MM/yyyy")
    println("Enter your date of birth: ")
    var s = readLine()
    if (s == null) return
    var dateInput = format.parse(s)
    var timeNamSinh = Calendar.getInstance()
    timeNamSinh.time = dateInput
    var YOB = timeNamSinh.get(Calendar.YEAR)
    var MOB = timeNamSinh.get(Calendar.MONTH) + 1
    var DOB = timeNamSinh.get(Calendar.DAY_OF_MONTH)
    println("Ngay sinh: $DOB")
    println("Thang sinh: $MOB")
    println("Nam sinh: $YOB")

    var currentTime = Calendar.getInstance()
    var currentYear = currentTime.get(Calendar.YEAR)
    println("You are ${currentYear - YOB} years old!")
}