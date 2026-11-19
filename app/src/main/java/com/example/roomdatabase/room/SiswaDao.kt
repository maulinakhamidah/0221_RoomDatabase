



    @Query("SELECT * from tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}