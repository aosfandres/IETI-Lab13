package co.edu.eci.ieti.android.network.service;

import java.util.List;

import co.edu.eci.ieti.android.model.Task;
import retrofit2.Call;
import retrofit2.http.GET;


public interface TaskService {

    @GET( "api/task" )
    Call<List<Task>> getTasks();
}
