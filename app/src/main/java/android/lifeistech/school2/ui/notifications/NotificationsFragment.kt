package android.lifeistech.school2.ui.notifications

//import android.lifeistech.school2.ObjectAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import android.lifeistech.school2.R
import androidx.lifecycle.LiveData
//import io.realm.Realm
//import io.realm.RealmResults

class NotificationsFragment : Fragment() {

    //val realm: Realm = Realm.getDefaultInstance()

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //makeAdapter(readAll())
        notificationsViewModel =
            ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_break, container, false)
        return root
    }
}


//    val r = Object()
//    fun makeAdapter(bookList: RealmResults<Object>) {
//        val adapter = ObjectAdapter(
//            this,
//            bookList,
//            object : BookShelfAdapter.OnItemClickListener {
//                override fun onItemClick(item: Book) {
//                    r = item
//                    val a = AlertDialogFragment()
//                    a.show(supportFragmentManager, "AlertDialogFragment")
//                }
//
//            }
//        )
//    }
//}
