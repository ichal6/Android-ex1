package pl.lechowicz.click

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class NewActivity : AppCompatActivity() {
    private val studentList = listOf(
        Student("Hary", "Poter"),
        Student("Jan", "Kowalski"),
        Student("Keanu", "Reeves"),
        Student("Michał", "Lechowicz")
        )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.new_activity)

        val studentRC = findViewById<RecyclerView>(R.id.studentRC)
        studentRC.layoutManager = LinearLayoutManager(this)
        val adapter = StudentRecyclerViewAdapter(studentList)
        studentRC.adapter = adapter
    }
}
