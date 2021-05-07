package co.edu.eci.ieti.android.ui.cards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.edu.eci.ieti.R;
import co.edu.eci.ieti.android.model.Task;

public class TasksAdapter extends RecyclerView.Adapter<TasksAdapter.ViewHolder>
{

    List<Task> taskList = null;
    public TasksAdapter(List<Task> tasks) {
        this.taskList = tasks;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType )
    {
        return new ViewHolder( LayoutInflater.from( parent.getContext() ).inflate( R.layout.task_row, parent, false ) );
    }

    @Override
    public void onBindViewHolder( @NonNull ViewHolder holder, int position )
    {
        Task task = taskList.get( position );
        holder.loadData(task);
        //TODO implement update view holder using the task values
    }

    @Override
    public int getItemCount()
    {
        return taskList != null ? taskList.size() : 0;
    }

    public void updateTasks(List<Task> tasks){
        this.taskList = tasks;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView description, name, email, status, duedate;
        ViewHolder( @NonNull View itemView ) {
            super( itemView );
            description = itemView.findViewById(R.id.descriptionTextView);
            status = itemView.findViewById(R.id.statusTextView);
            duedate = itemView.findViewById(R.id.duedateTextView);
        }
        void loadData(Task task){
            description.setText(task.getDescription());
            status.setText(Integer.toString(task.getPriority()));
            duedate.setText(task.getDueDate().toString());

        }
    }

}
