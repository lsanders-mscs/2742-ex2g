package lukas.sanders.Java2742.ex2g;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SensorReadingAdapter extends RecyclerView.Adapter<SensorReadingHolder> {
    private final List<SensorReading> sensorReadings;
    private Context context;
    private int itemResource;


    public SensorReadingAdapter(Context context, int itemResource, List<SensorReading> sensorReadings) {
        this.context = context;
        this.itemResource = itemResource;
        this.sensorReadings = sensorReadings;
    }

    @Override
    public SensorReadingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(this.itemResource, parent, false);
        return new SensorReadingHolder(this.context, view);
    }

    @Override
    public void onBindViewHolder(SensorReadingHolder holder, int position) {
        SensorReading sensorReading = this.sensorReadings.get(position);
        holder.bindSensorReading(sensorReading);
    }

    @Override
    public int getItemCount() {
        return this.sensorReadings.size();
    }
}
