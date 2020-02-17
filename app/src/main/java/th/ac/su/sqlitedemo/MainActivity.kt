package th.ac.su.sqlitedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import th.ac.su.sqlitedemo.adapter.ListStudentAdapter
import th.ac.su.sqlitedemo.model.Student

class MainActivity : AppCompatActivity() {

    var listStudent = ArrayList<Student>()

    lateinit var listViewStudent:ListView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var student1 = Student(124,"supanat","supanat@gmail.com")
        var student2 = Student(222,"sarayuth","sssyy@gmail.com")
        var student3 = Student(333,"bruce","bb@gmail.com")
        var student4 = Student(111,"Benz","benz@gmail.com")
        var student5 = Student(999,"pikun","pikun@gmail.com")
        var student6 = Student(150,"ice","ice@gmail.com")
        var student7 = Student(1506648,"toon","toon@gmail.com")
        var student8 = Student(1500048,"Bas","bas@gmail.com")
        listStudent.add(student1)
        listStudent.add(student2)
        listStudent.add(student3)
        listStudent.add(student4)
        listStudent.add(student5)
        listStudent.add(student6)
        listStudent.add(student7)


        listViewStudent =  findViewById<ListView>(R.id.listViewStudent)


        reloadData()
    }

    fun reloadData(){

        val adapter = ListStudentAdapter(this@MainActivity,listStudent)
        listViewStudent.adapter = adapter
    }


}