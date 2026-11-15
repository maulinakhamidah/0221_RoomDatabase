package com.example.roomdatabase.uicontroller

import com.example.roomdatabase.R

interface DestinasiNavigasi {
    val route: String
    val titleRes: Int
}

object DestinasiHome : DestinasiNavigasi {
    override val route = "home"
    override val titleRes = R.string.app_name
}

object DestinasiEntry : DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entry_siswa
}
