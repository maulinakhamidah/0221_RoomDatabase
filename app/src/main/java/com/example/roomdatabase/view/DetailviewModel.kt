

    val uiDetailState: StateFlow<DetailSiswaUiState> =
        repositoriSiswa.getSiswaStream(idSiswa)
            .filterNotNull()
            .map { detailSiswa ->
                DetailSiswaUiState(detailSiswa = detailSiswa.toDetailSiswa())
            }
