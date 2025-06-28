class DetailActivity : AppCompatActivity() {

    private var jumlah = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nama_layout_xml_kamu) // ganti dengan nama file XML kamu, misalnya activity_detail_produk

        val btnKeranjang = findViewById<ImageView>(R.id.btnKeranjang)
        val jumlahProduk = findViewById<TextView>(R.id.jumlahProduk)

        btnKeranjang.setOnClickListener {
            jumlah++
            jumlahProduk.text = "Jumlah: $jumlah"
        }
    }
}
