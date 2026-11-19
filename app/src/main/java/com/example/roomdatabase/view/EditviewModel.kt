
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.roomdatabase.repositori.RepositoriSiswa
import com.example.roomdatabase.viewmodel.DetailSiswa
import com.example.roomdatabase.viewmodel.UIStateSiswa
import com.example.roomdatabase.viewmodel.toSiswa
import com.example.roomdatabase.viewmodel.toUiStateSiswa
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

