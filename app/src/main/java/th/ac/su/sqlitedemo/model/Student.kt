package th.ac.su.sqlitedemo.model

import android.provider.ContactsContract

class Student {

    var id:Int = 0
    var name:String? = null
    var email:String? = null

    constructor(){}

    constructor(id:Int,name:String,email:String){

        this.id = id
        this.name = name
        this.email = email

    }

}