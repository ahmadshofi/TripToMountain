package com.ahmad.triptomountain.gunung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.ahmad.triptomountain.R
import kotlinx.android.synthetic.main.activity_gunung.*

import kotlinx.android.synthetic.main.activity_manajemen_perjalanan.recyclerView

class Gunung : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gunung)

        val bundle = intent.extras
        if (bundle != null){
            val provinsi = bundle.getString("provinsi")
            txtNamaProvinsi.text = bundle.getString("provinsi")

            recyclerView.layoutManager = GridLayoutManager(this, 2)

            val items : ArrayList<ItemGunung> = ArrayList()

            items.add(ItemGunung(R.drawable.sinabung,"Sinabung", "Gunung Sinabung adalah gunung api di Dataran Tinggi Karo, Kabupaten Karo, Sumatra Utara, Indonesia. Sinabung bersama Gunung Sibayak di dekatnya adalah dua gunung berapi aktif di Sumatra Utara dan menjadi puncak tertinggi ke 2 di provinsi itu. Ketinggian gunung ini adalah 2.451 meter.","SUMATERA UTARA","2.460 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.sinabung,"Sibayak", "Gunung Sibayak adalah sebuah gunung di Kabupaten Karo, Sumatra Utara. Orang suku Karo menyebut gunung Sibayak dengan sebutuan \"gunung Raja\". Gunung Sibayak merupakan gunung berapi dan meletus terakhir tahun 1881. Gunung ini berada di sekitar 50 kilometer barat daya Kota Medan. ","SUMATERA UTARA","2.212 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.kerinci,"Kerinci", "Gunung Kerinci adalah gunung tertinggi di Sumatra, gunung berapi tertinggi di Indonesia, dan puncak tertinggi di Indonesia di luar Papua. Gunung Kerinci terletak di Provinsi Jambi, di Pegunungan Bukit Barisan, dekat pantai barat, dan terletak sekitar 130 km sebelah selatan Padang Provinsi Sumatra Barat. ","SUMATERA BARAT","3.805  M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.talamau,"Talamau", "Gunung Talamau atau juga disebut Gunung Ophir adalah gunung tertinggi di Sumatra Barat yang terletak di Kabupaten Pasaman Barat, berdampingan dengan Gunung Pasaman. Gunung ini memiliki ketinggian 2,920 meter dan termasuk dalam tipe gunung api tidak aktif. ","SUMATERA BARAT","2.919 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.singgalang,"Singgalang", "Gunung Singgalang merupakan sebuah gunung yang terdapat di provinsi Sumatra Barat, Indonesia dengan ketinggian 2,877 meter. Dari bentuknya, gunung ini sangat mirip dengan Gunung Merbabu di Jawa Tengah.","SUMATERA BARAT","2.877 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.talang,"Talang", "Gunung Talang merupakan gunung berapi yang terletak terletak di kabupaten Solok, provinsi Sumatra Barat, Indonesia. Gunung Talang berlokasi sekitar 9 km dari kota Arosuka ibu kota kabupaten Solok, dan sekitar 40 km sebelah timur kota Padang.","SUMATERA BARAT","2.597 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.daik,"Daik", "Gunung Daik adalah gunung yang terletak di Pulau Lingga, Kabupaten Lingga, Provinsi Kepulauan Riau, Indonesia. Gunung ini adalah gunung tertinggi di Provinsi Kepulauan Riau. Gunung Daik memiliki tiga puncak: Gunung Daik. Gunung Pejantan. Gunung Cindai Menangis.","KEPULAUAN RIAU","1.165 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.ranai,"Ranai", "Gunung Ranai adalah gunung yang terletak di pulau Ranai, Kabupaten Natuna, Provinsi Kepulauan Riau, Indonesia. Gunung Ranai merupakan gunung dataran rendah, sebab ketinggiannya berkisar antara 300—1.035 meter di atas permukaan laut.","KEPULAUAN RIAU","1.165 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.sepincan,"Sepincan", "Gunung Ranai adalah gunung yang terletak di pulau Ranai, Kabupaten Natuna, Provinsi Kepulauan Riau, Indonesia. Gunung Ranai merupakan gunung dataran rendah, sebab ketinggiannya berkisar antara 300—1.035 meter di atas permukaan laut.","KEPULAUAN RIAU","1000 mdpl",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.pesagi,"Pesagi", "Gunung Pesagi adalah salah satu dari 12 Gunung yang ada di provinsi Lampung, Indonesia. Dari beberapa gunung tersebut, Pesagi adalah gunung yang mempunyai puncak paling tinggi yang ada di Lampung. Ketinggian puncak dari gunung ini mencapai 2.262 m bila diukur dari atas permukaan laut.","LAMPUNG","2.262 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.tanggamus,"Tanggamus", "Gunung Tanggamus adalah sebuah gunung yang terletak di Kecamatan Kota Agung, Kabupaten Tanggamus, Provinsi Lampung, Indonesia. Gunung ini berada di sebelah timur laut dari Kota Agung dengan jarak sekitar 10 km. Gunung ini adalah gunung tertinggi kedua di Provinsi Lampung, setelah Gunung Pesagi.","LAMPUNG","2.102 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.seminung,"Seminung", "Gunung Seminung adalah gunung yang terletak di perbatasan Kecamatan Sukau, Kabupaten Lampung Barat, Provinsi Lampung, dengan Kecamatan Banding Agung, Kabupaten Ogan Komering Ulu Selatan, Provinsi Sumatra Selatan. Sama seperti Gunung Merapi, gunung ini merupakan \"gunung antar-provinsi\".","LAMPUNG","1.881 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.leuser,"Leuser", "Gunung Leuser dengan ketinggiannya 3,404 m terletak di sebelah tenggara Aceh, dekat perbatasan dengan Sumatra Utara. Gunung Leuser terletak di dalam Taman Nasional Gunung Leuser yang mengambil nama gunung ini sebagai namanya.","ACEH","3.466 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.bandahara,"Bandahara", "Gunung Bandahara adalah sebuah gunung yang terdapat di Kabupaten Gayo Lues, Provinsi Aceh, Indonesia. Jarak dari kota Blang Kejeran ibu kota Kabupaten Gayo Lues sekitar 50 ke arah tenggara - timur, sedangkan jarak dari Kota Kutacane, ibu kota Kabupaten Aceh Tenggara, sekitar 35 km arah utara - barat laut.","ACEH","3.030 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.bandahara,"Bandahara", "Gunung Bandahara adalah sebuah gunung yang terdapat di Kabupaten Gayo Lues, Provinsi Aceh, Indonesia. Jarak dari kota Blang Kejeran ibu kota Kabupaten Gayo Lues sekitar 50 ke arah tenggara - timur, sedangkan jarak dari Kota Kutacane, ibu kota Kabupaten Aceh Tenggara, sekitar 35 km arah utara - barat laut.","ACEH","3.030 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.peutsagoe,"Peuet Sagoe", "Gunung Puet Sague adalah sebuah gunung berapi yang terletak di wilayah Meureudu, Kabupaten Pidie, Provinsi Aceh, Indonesia. Gunung ini menjulang tinggi dengan empat buah puncak.","ACEH","2.801 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))
            items.add(ItemGunung(R.drawable.geuradong,"Geureudong", "Gunung Geureudong atau Bur ni Geureudong atau Bur ni Telong adalah gunung stratovolcano di Provinsi Aceh, Indonesia. Nama resmi untuk kompleks gunung berapi ini masih menjadi perdebatan, karena posisi Bur ni Geureudong dan Bur ni Telong yang berdekatan.","ACEH","2.885 M",
                arrayListOf("Rp.20000","Rp.40000","Rp.60000")))


            val filteredItems = items.filter { itemGunung -> itemGunung.provinsi.equals(provinsi)}
            recyclerView.adapter = GunungAdapter(filteredItems,this)
        }
        else {
            finish();
        }
    }
}
