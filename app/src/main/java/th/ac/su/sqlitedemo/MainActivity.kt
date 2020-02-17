package th.ac.su.sqlitedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import th.ac.su.sqlitedemo.model.Student

class MainActivity : AppCompatActivity() {

    var listStudent = ArrayList<Student>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var student1 = Student(1234,"Chaleamkeat","pikunthong_c@silpakorn.edu")
        var student2 = Student(1234,"Sarayuth","sssyy@gamil.com")
        var student3 = Student(1234,"bruce","bb@gamil.com")

        listStudent.add(student1)
        listStudent.add(student2)
        listStudent.add(student3)



    }
}
