package android.lifeistech.school2

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Object(): RealmObject(){
    @PrimaryKey
    open var id : String = UUID.randomUUID().toString()
    open var title: String = ""
}