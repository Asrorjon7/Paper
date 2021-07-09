package com.example.dars

import io.paperdb.Paper

object SaveData {

    fun savedata(count: Int) {
        Paper.book().write("count1", count)
    }

    fun getData(): Int {
        return Paper.book().read("count1", 0)
    }


    fun delete() {
        Paper.delete("count1")
    }

}