// HospitalAdapter.kt
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.nashir.massive_project.CallAmbulanActivity
import com.nashir.massive_project.Model.Hospital
import com.nashir.massive_project.R

class HospitalAdapter(private val hospitalList: List<Hospital>) : RecyclerView.Adapter<HospitalAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val distanceTextView: TextView = itemView.findViewById(R.id.distanceTextView)
        val phoneIcon: ImageView = itemView.findViewById(R.id.phoneIcon)

        init {
            phoneIcon.setOnClickListener {
                val hospital = hospitalList[adapterPosition]
                makePhoneCall(hospital.phoneNumber, itemView.context)
            }

            itemView.setOnClickListener {
                val hospital = hospitalList[adapterPosition]
                openCallAmbulanceActivity(hospital.phoneNumber, itemView.context)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.ambulance_card_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val hospital = hospitalList[position]
        holder.nameTextView.text = hospital.name
        holder.distanceTextView.text = hospital.distance
    }

    override fun getItemCount(): Int {
        return hospitalList.size
    }

    private fun makePhoneCall(phoneNumber: String, context: Context) {
        val dialIntent = Intent(Intent.ACTION_DIAL)
        dialIntent.data = Uri.parse("tel:$phoneNumber")
        context.startActivity(dialIntent)
    }

    private fun openCallAmbulanceActivity(phoneNumber: String, context: Context) {
        val intent = Intent(context, CallAmbulanActivity::class.java)
        intent.putExtra("phoneNumber", phoneNumber)
        context.startActivity(intent)
    }
}